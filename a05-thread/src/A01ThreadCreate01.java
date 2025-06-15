class A extends Thread{
    public void run(){ //必须要有public
        while (true){
            System.out.println("AAAAA");
        }
    }
}
public class A01ThreadCreate01 {
    public static void main(String[] args) {
        A a = new A();
        a.start();//a.run();只是执行普通的run()方法
        while (true){
            System.out.println("BBBB");
        }
    }
}
