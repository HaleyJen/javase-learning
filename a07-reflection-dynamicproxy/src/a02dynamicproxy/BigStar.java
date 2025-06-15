package a02dynamicproxy;
/*
    明星需要做的事情
 */
public class BigStar implements Star{
    String name;

    public BigStar(String name){
        this.name = name;
    }

    @Override
    public void sing() {
        System.out.println(this.name + " sing....");
    }

    @Override
    public void dance() {
        System.out.println(this.name + "dance.....");
    }
}
