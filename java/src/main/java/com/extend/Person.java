package com.extend;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author Nevri on 2021/4/5
 * @Title:
 * @Description:
 */
public class Person {

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getStaticage() {
        return staticage;
    }

    public static void setStaticage(int staticage) {
        Person.staticage = staticage;
    }


    public int getPrivateage() {
        return  privateage ;
    }


    public void setPrivateage(int privateage) {
        this.privateage = privateage;
    }



    int age;
    static int  staticage;
    private int privateage;

    public Person() {
    }

    public Person(int age,int  staticage,int privateage) {
        setAge(age);
        setStaticage(staticage);
        setPrivateage(privateage);
    }

    public void function() {
        System.out.println("this is Father function");
    }




}
