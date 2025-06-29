package a01dynamicarray;

import java.lang.reflect.Array;

/*
    1、定义初始最大长度长度为10
 */
public class DynamicArray {
    int[] arr = new int[10];//初始长度为10
    int maxLength = 10;
    int length = 0;

    /**
     * 1、添加数据最末尾
     * 1）判断长度；2）添加数据到末尾
     */
    void addLast(int data) {
        if (length + 1 < maxLength) {
            arr[length] = data;
            System.out.println("添加末尾成功");
            length ++;
        }else {
            System.out.println("添加末尾失败");
        }
    }


    /**
     * 2、显示数据
     */
    void show() {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    /**
     * 3、添加指定位置
     *  1）数据后移动；2）空中位置就行
     */
    void insert(int location, int data){ //2的位置，插入4
        if (length + 1 < maxLength){
            //换位
            for (int i = length; i >= location; i--) {
                arr[i] = arr[i - 1];
            }

            //添加
            arr[location] = data;

            length ++;
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }





    }






}