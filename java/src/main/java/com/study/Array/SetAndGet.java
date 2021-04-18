package com.study.Array;

import com.extend.Person;

/**
 * @author Nevri on 2021/4/5
 * @Title:
 * @Description:
 */
public class SetAndGet {


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private int age;
    private String  name;
    private String sex;

    //作为属性时要么在调用前赋值 Person newperson=new Person() ; setAndGet.setPerson( newperson)
    //要么直接实例化  private Person person = new Person()
    private Person person;
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    public static void test01(Person person) {
        person.getAge();
    }



}
