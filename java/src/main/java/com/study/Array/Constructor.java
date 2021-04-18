package com.study.Array;

/**
 * @author Nevri on 2021/4/4
 * @Title:
 * @Description:
 */
public class Constructor {
    int num;
    static String name;
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Constructor.name = name;
    }


    public void fun() {
        System.out.println(num);
    }
    public static void  funsec() {
        Constructor constructor = new Constructor();
        int nstatic=10;
        System.out.println(nstatic);
        //静态方法下实例化后非静态属性的调用
        System.out.println(constructor.num);
        //静态方法下实例化后非静态方法调用
        constructor.fun();
        System.out.println(name);
    }
}
