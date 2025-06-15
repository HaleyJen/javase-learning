import java.io.*;

/*
    对象流，用来“保存和恢复“对象。
 */
public class A06ObjectStream {
    public static void main(String[] args) throws Exception {
        String filePath =  "C:\\Users\\haley\\Desktop\\inbox\\other\\object.txt";
        //1 创建对象
        Student student = new Student(23, "haley");

        //2 建立对象流
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));

        //3 写入数据
        outputStream.writeObject(student);//注，要想序列化，必须实现Serializable接口

        //4 读取数据
        Student student1 = (Student) objectInputStream.readObject();
        System.out.println(student1.name);

        //4 关闭
        outputStream.close();
        objectInputStream.close();

    }
}
