import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManage {
    //存储
    List<Student> students = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    //添加数据
    void add(){

        //输入数据
        System.out.println("请输入姓名：");
        String name = (new Scanner(System.in) ).nextLine();
        System.out.println("请输入年龄：");
        int age = (new Scanner(System.in)).nextInt();
        System.out.println("请输入分数：");
        int score = (new Scanner(System.in)).nextInt();

        //添加数据
        students.add(new Student(name, age, score));

    }

    //显示数据
    void show(){
        System.out.println(students);
    }

    //删除数据(按名字删除)
    void delete(){
        System.out.println("请输入你要删除的名字：");
        String name = (new Scanner(System.in) ).nextLine();
        boolean flag = false;

        //查找后删除(显示成功或失败)
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).name.equals(name)){
                students.remove(i);
                flag = true;
            }
        }

        if (flag){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败，没有找到数据");
        }

    }

    //保存数据
    void save() throws IOException {

        //1 读取文件
        String path = "/Users/kelly/Desktop/object.txt";

        //2 建立连接
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));

        //3 将对象写入
        objectOutputStream.writeObject(students);

        //3 关闭连接
        objectOutputStream.close();

        System.out.println("保存成功");

    }

    //读取数据
    void load() throws IOException, ClassNotFoundException {

        //1 读取文件
        String path = "/Users/kelly/Desktop/object.txt";

        //2 建立连接
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));

        //3 将对象读取
        students = (List<Student>)objectInputStream.readObject();

        //3 关闭连接
        objectInputStream.close();

    }


    //修改数据
    //删除数据(按名字删除)
    void upData(){
        System.out.println("请输入你要修改的名字：");
        String name = (new Scanner(System.in) ).nextLine();
        boolean flag = false;

        //查找后修改(显示成功或失败)
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).name.equals(name)){

                //输入数据
                System.out.println("请重新输入名字：");
                String newName = (new Scanner(System.in) ).nextLine();

                System.out.println("请重新输入年龄：");
                int age = (new Scanner(System.in)).nextInt();

                System.out.println("请重新输入分数：");
                int score = (new Scanner(System.in)).nextInt();

                students.set(i, new Student(newName, age, score));

                flag = true;
            }
        }

        if (flag){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败，没有找到数据");
        }

    }






}
