/*
    string.split(分割符，limit)
        作用：将字符串分割。
        分割符：可以使用正则
        limit：限制分割次数。
            [a, b,c,d]
            a
            b,c,d

 */
import java.sql.Array;
import java.util.Arrays;

public class TestSplit {
    public static void main(String[] args) {
        String str = "a,b,c,d";

        //分割
        String[] parts = str.split(",");

        //显示
        System.out.println(Arrays.toString(parts));//字符数组转为字符串
        for(String part:parts){//遍历
            System.out.println(part);
        }


    }
}
