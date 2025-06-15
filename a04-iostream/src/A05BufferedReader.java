import java.io.*;

/*
    使用缓冲流，文件的复制
 */
public class A05BufferedReader {
    public static void main(String[] args) throws IOException {
        String filePathPre =  "C:\\Users\\haley\\Desktop\\inbox\\other\\book.txt";
        String filePathNew =  "C:\\Users\\haley\\Desktop\\inbox\\other\\bookNewBuf.txt";

        //1 创建连接
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePathPre));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePathNew));

        //2 循环
        String line;
        while ((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();//插入一行，否则乱码
        }

        //3 关闭刷新
        bufferedReader.close();
        bufferedWriter.close();

    }
}
