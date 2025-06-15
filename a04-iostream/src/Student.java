import java.io.Serializable;

public class Student implements Serializable {
      int age;
      String name;
     public Student(int age, String name){
          this.age = age;
          this.name = name;
     }
     public Student(){

     }
}
