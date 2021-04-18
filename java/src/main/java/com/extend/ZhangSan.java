package com.extend;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Objects;

/**
 * @author Nevri on 2021/4/5
 * @Title:
 * @Description:
 */
public class ZhangSan  extends Person {


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZhangSan zhangSan = (ZhangSan) o;
        return selfage == zhangSan.selfage &&
                Objects.equals(name, zhangSan.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(selfage, name);
    }

    int  selfage;
    String name;


    public ZhangSan() {
    }

    public ZhangSan(int age, int staticage, int privateage) {
        super(age, staticage, privateage);
    }

    @Override
    public void function() {
        super.function();
    }

    @Override
    public String toString() {
        return "ZhangSan{" +
                "age=" + age +
                '}';
    }



//    //对equals重写
//    @Override
//    public  boolean equals( Object object) {
//        //将obj装成 ZhangSan 为了调用类中方法获取参数
//        ZhangSan other=(ZhangSan) object;
//        //判断条件
//    if (this.age==other.getAge() && this.getPrivateage()==((ZhangSan) object).getPrivateage()  ){
//        return  true;
//    }
//        return  false;
//    }
}
