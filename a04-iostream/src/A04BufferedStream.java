import java.io.*;

/*
   完成文件的复制（缓冲流）
   ？
   1、缓冲区默认大小
   2、在写入时，特别对于文件，需要指定长度！（在这里需要，缓冲数组）
 */
public class A04BufferedStream {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\haley\\Desktop\\inbox\\other\\video.mp4";
        String filePathNew = "C:\\Users\\haley\\Desktop\\inbox\\other\\videoNew.mp4";

        //1 建立连接
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));//可以用匿名类
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(filePathNew));

        //2 循环读取文件 利用字节数组
        byte[] buf = new byte[1024];
        while ( bufferedInputStream.read(buf) != -1){
            bufferedOutputStream.write(buf);//如果文件打不开，这里可以写入指定长度。
        }

        //3 关闭
        bufferedOutputStream.close();
        bufferedInputStream.close();
}}
