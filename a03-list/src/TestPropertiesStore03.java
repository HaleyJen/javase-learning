/*
    使用properties对象，创建properties文件。
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestPropertiesStore03 {
    public static void main(String[] args) throws IOException {
        String path = "src/a03list/mysql2.properties";

        Properties properties = new Properties();

        //创建键值对
        properties.setProperty("charset", "utf8");
        properties.setProperty("user", "tom");//中文保存的是unicode值
        properties.setProperty("pwd", "123456");

        //保存
        properties.store(new FileWriter(path), null);//null不写的话，就是注释

    }
}
