import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器已经启动");

        //1 创建套接字
        ServerSocket serverSocket = new ServerSocket(8080);

        //2 接受来自服务端的数据
        Socket socket = serverSocket.accept();

        //3 流
        InputStream inputStream = socket.getInputStream();
        DataInputStream dis = new DataInputStream(inputStream);

        //4 接受客户端的数据
        String str = dis.readUTF();
        System.out.println(str);
    }
}
