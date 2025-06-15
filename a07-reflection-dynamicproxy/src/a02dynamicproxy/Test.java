package a02dynamicproxy;

public class Test {
    public static void main(String[] args) {
        //1 获取代理对象
        BigStar bigStar = new BigStar("Haley");
        Star proxy = ProxyUtil.createProxy(bigStar);

        //2. 调用方法
        proxy.sing();
        proxy.dance();

    }
}
