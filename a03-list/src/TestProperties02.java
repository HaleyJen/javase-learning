/*
    用properties对象，读取properties文件
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestProperties02 {
    public static void main(String[] args) throws IOException {
        String path = "src/a03list/mysql.properties";

        //1）使用普通流的方法（底层）
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;
        while ( (line = bufferedReader.readLine()) != null){
            String [] parts = line.split("=");
            System.out.println(parts[0] + "=" + parts[1]);
        }

        //2）使用properties对象
        Properties properties = new Properties();
        properties.load(new FileReader(path)); //加载，将指定的文件，加载到properties（本质就是键值对，hash存储）
        properties.list(System.out);

        //根据key，得到value
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println(user + " " + pwd);

    }
}
