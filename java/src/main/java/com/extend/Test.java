package com.extend;

/**
 * @author Nevri on 2021/4/5
 * @Title:
 * @Description:
 */
public class Test {


    public static void main(String[] args) {
        ZhangSan zhangSan = new ZhangSan(1,2,3);
        ZhangSan zhangSan1 = new ZhangSan(1,2,3);
        //父类 Person  Object
        //instanceof 判断是 前者是否是后者的实例
        System.out.println(zhangSan1 instanceof  Object );//true
        System.out.println(zhangSan1 instanceof  Person );//true
        System.out.println(zhangSan1 instanceof ZhangSan  );//true
        System.out.println( zhangSan.getClass());
        System.out.println( Object.class);

    }

}
