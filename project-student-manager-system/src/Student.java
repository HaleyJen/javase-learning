import java.io.Serializable;

/*
    定义一个模版，用来存储数据
 */
public class Student implements Serializable {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    String name;
    int age;
    int score;


}
