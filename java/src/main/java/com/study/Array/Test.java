package com.study.Array;

/**
 * @author Nevri on 2021/4/4
 * @Title:
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        SetAndGet per = new SetAndGet();
        per.setAge(15);
        per.setName("徐广");
        per.setSex("男");
        System.out.println("年龄:"+per.getAge()+"姓名:"+per.getName()+"性别:"+per.getSex());
    }
}
