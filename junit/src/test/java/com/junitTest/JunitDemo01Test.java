package com.junitTest;

import org.junit.*;

/**
 * @author Nevri on 2021/3/27
 * @Title:
 * @Description:
 */
public class JunitDemo01Test {

    @BeforeClass
    public static void beforeclass() {
        System.out.println("beforeclass");
    }
    @Before
    public  void befor() {
        System.out.println(" befor");
    }

    @After
    public void after() {
        System.out.println(" after");
    }

    @Test
    public void fun1() {
        System.out.println(" fun1");
    }

    @Test
    public void fun2() {
        System.out.println(" fun2");
    }


    @Test
    @Ignore
    public void fun3() {
        System.out.println("fun3");
    }


    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass");
    }
}
