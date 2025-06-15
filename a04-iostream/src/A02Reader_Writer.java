/*
    复制文本（读取+写入）
    注：
    1、输出流，会简单的创建文件。
 */
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;


public class A02Reader_Writer {
    public static void main(String[] args) throws Exception {
        String filePathPre =  "C:\\Users\\haley\\Desktop\\inbox\\other\\book.txt";
        String filePathNew =  "C:\\Users\\haley\\Desktop\\inbox\\other\\bookNew.txt";

        //1 建立连接
        FileReader fileReader = new FileReader(filePathPre);
        FileWriter fileWriter = new FileWriter(filePathNew);

        //2 循环读写
        char [] buf = new char[88];
        while ( fileReader.read(buf) != -1){
            fileWriter.write(buf);
        }

        //3 关闭刷新
        fileReader.close();
        fileWriter.close();



    }
}
