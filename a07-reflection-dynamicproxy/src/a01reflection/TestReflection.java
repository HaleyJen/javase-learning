package a01reflection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
    反射：OCP原则。
        1）变量——常量：我们只需要改变量的值，就可以显示。例如：只需要改name，显示自动改变。
             String name = "jen" ;System.out.println(name);
        2）对象——配置：在反射中，我们只需要改变配置文件的类和方法，就可以运行不同的类和方法！（便编程——软编码，更加灵活）
            传统
                Cat cat = new Cat();
                cat.hi();
            反射
                通过properties对象，方便获得配置文件的内容。
                通过Class，也及类加载。直接可以加载由”字符串“标识的类！
                后面还可以创建实例，运行方法！！


 */
public class TestReflection {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String path = "src/a06reflection/re.properties";
        //1 使用Properties类，读写配置文件
        Properties properties = new Properties();
        properties.load(new FileReader(path));

        //2 读取内容
//        System.out.println(properties.getProperty("classfullpath"));//getProperty(String key)，返回String。
//        System.out.println(properties.get("classfullpath"));//继承自 Hashtable，工作方式更通用 ，返回 Object
        String classfullpath = properties.getProperty("classfullpath");
        String method = properties.getProperty("method");


        //3 使用反射机制，加载类，运行方法
        //1）加载类
        Class cls = Class.forName(classfullpath);//加载classfullpath（字符串类型），类。
        //2）通过类，创建实例
        Object o = cls.newInstance(); //这里不需要强转
        //3）通过类，得到方法
        Method method1 = cls.getMethod(method); //method是字符串
        //4）指定对象，执行method1
        method1.invoke(o);
    }
}
