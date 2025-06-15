package a02dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {

    public static Star createProxy(BigStar bigStar){

        //创建代理的实例对象
        Star star = (Star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),//参数1：类加载
                new Class[]{Star.class}, //参数2：接口-方法
                new InvocationHandler() {//参数3：创建代理实例
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        //1 根据不同的方法，添加不同的逻辑
                        if ("sing".equals(method.getName())) {
                            System.out.println("准备话筒，收钱");
                        } else if ("dance".equals(method.getName())) {
                            System.out.println("准备场地，收钱");
                        }

                        //2 调用方法
                        return method.invoke(bigStar, args);//调用方法，还有返回值 ！
                    }
                }

        );

        return star;
    };

}