public class A07StandardStream {
    public static void main(String[] args) {
        // getClass方法
        Student student = new Student();
        System.out.println(student.getClass());//Student类


        // System.in,键盘
        // 运行：BufferedInputStream
        //代码：public final static InputStream in = null;
        System.out.println(System.in.getClass());

        // System.out， 显示器
        // 运行：PrintStream
        //代码：public final static PrintStream out = null;
        System.out.println(System.out.getClass());

    }
}
