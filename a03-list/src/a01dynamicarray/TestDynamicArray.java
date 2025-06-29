package a01dynamicarray;

/*
    1、添加数据到末尾
    2、遍历所有数据
    3、添加数据到任意位置
    4、删除元素（按值）
 */

public class TestDynamicArray {
    public static void main(String[] args) {
        DynamicArray myArray = new DynamicArray();

        // 1、添加数据
        myArray.addLast(1);
        myArray.addLast(2);
        myArray.addLast(3);

        //2、遍历数据
        myArray.show();

        //3、插入数据 2和3之间插入4
        myArray.insert(2, 4);
        myArray.show();

        //4、删除元素（按值）





    }

}
