/*
    客户端
        1、接受服务器的信息
 */
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TestClient {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端已启动：");
        //1 指定Socket
        Socket socket = new Socket("127.0.0.1", 8898);
        
        //2 建立流连接
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        //3 写入数据
        dos.writeUTF("你好，这是客户端！");

        //4 关闭，倒着关
        dos.close();
        socket.close();


    }
}
