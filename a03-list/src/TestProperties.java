import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) {
        Properties properties = new Properties();

//            添加数据:采用键值对，都不能为空。如果健重复，将替换。
        properties.put("Haley", 100);
        properties.put("jen", 100);
        properties.put("lic", 100);
        properties.put("lic", 88);

        System.out.println(properties);

        //获得元素：通过键，得到value
        System.out.println(properties.get("lic"));//88

        //删除
        properties.remove("lic");
        System.out.println(properties);

        //修改
        properties.put("jen", "清华大学");
        System.out.println(properties);

        //查找
        System.out.println(properties.getProperty("jen"));
        System.out.println(properties.get("jen"));

    }
}
