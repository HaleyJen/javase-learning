/*
    读取文本到屏幕
 */

import java.io.FileReader;
import java.io.IOException;

public class A01Reader {
    public static void main(String[] args) throws IOException {
        String filePath =  "C:\\Users\\haley\\Desktop\\inbox\\other\\book.txt";

        //1 建立连接
        FileReader fileReader = new FileReader(filePath);

/*        //2 循环读文件（无缓存）
        int data;
        while ((data = fileReader.read()) != -1){
            System.out.print((char) data);
        }*/

        //3 循环读文件（有缓存）
        char [] buf = new char[88];
        while (fileReader.read(buf) != -1){
            System.out.print(new String(buf));
        }

    }

}
