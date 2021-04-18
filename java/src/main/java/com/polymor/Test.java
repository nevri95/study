package com.polymor;

/**
 * @author Nevri on 2021/4/8
 * @Title:
 * @Description:
 */
//4.有3.的存在   类必须是一个抽象类
public abstract class Test {
    //1.当一个父类中的一个方法永远满足所继承的子类,即无需重写的时候 直接使用
    public  static void  fun1(){
        System.out.println("fun1");
    }
    //2.对立于 1. 一个父类中的方法 永远无法满足 子类  即需要重写
    //3.对于2. 情况 我们常 将修饰为 abstract方法  无需方法体({ })  方法体在子类中实现
    public abstract  void  fun2();
    public abstract  void  fun3();
}

class abclass extends  Test{
    @Override
    public void fun2() {

    }
    @Override
    public void fun3() {

    }
}
class  newclass {
    abclass a=new abclass();
}