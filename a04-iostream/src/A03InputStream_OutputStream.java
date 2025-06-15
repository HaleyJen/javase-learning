import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
    完成文件的复制
 */
public class A03InputStream_OutputStream {
    public static void main(String[] args) throws Exception {

        String filePath = "C:\\Users\\haley\\Desktop\\inbox\\other\\video.mp4";
        String filePathNew = "C:\\Users\\haley\\Desktop\\inbox\\other\\videoNew.mp4";

        //1 建立连接
        FileInputStream fileInputStream = new FileInputStream(filePath);
        FileOutputStream fileOutputStream = new FileOutputStream(filePathNew);

        //2 循环读取文件 利用字节数组
        byte [] buf = new byte[1024];
        while (fileInputStream.read(buf) != -1){
            fileOutputStream.write(buf);
        }

        //3 关闭刷新
        fileInputStream.close();
        fileOutputStream.close();


    }
}
