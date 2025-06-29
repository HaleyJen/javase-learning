import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) throws Exception {

        StudentManage studentManage = new StudentManage();

        while (true){
            System.out.println("请输入你要执行的操作：");
            System.out.println("1-添加；2-删除；3-修改；4-查询；5-保存；6-加载；7-退出");
            Scanner sc  = new Scanner(System.in);
            int judge = sc.nextInt();

            if (judge == 7 ) break;//退出循环

            switch (judge){
                case 1:
                    studentManage.add();
                    break;
                case 2:
                    studentManage.delete();
                    break;
                case 3:
                    studentManage.upData();
                    break;
                case 4:
                    studentManage.show();
                    break;
                case 5:
                    studentManage.save();
                    break;
                case 6:
                    studentManage.load();
                    break;
            }


        }



    }
}
