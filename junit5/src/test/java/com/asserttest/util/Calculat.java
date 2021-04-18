package com.asserttest.util;

/**
 * @author Nevri on 2021/4/11
 * @Title:
 * @Description:
 */
public class Calculat {
   public static  int cou=0;
    public static int add( int a,int b){
        int sum =a+b;
        return  sum;
}

    public static int count( int x) throws InterruptedException {
//        cou+=x; 此处不可用变量的自身加减 此行为 为原子性操作  无法达到并行看差异的效果
        int result =cou;
        Thread.sleep(1000);
        cou=result+x;
        System.out.println(cou);

        return  cou;
    }

}
