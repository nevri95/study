package com.junit5Test.junit5Test2;

import org.junit.jupiter.api.*;

/**
 * @author Nevri on 2021/3/28
 * @Title:
 * @Description:
 */
@DisplayName("junit5ClassName")
@Tag("group2")
public class Junit5Demo1Test {
    void Junit5Demo1Test(){
        System.out.println("class mehtod" );
    }
    @BeforeAll
     static void beforeAll(){
        String classname =Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(classname);
    }



    @BeforeEach
    void beforeEach(){
        String classname =Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(classname);
    }

    @BeforeEach
    void beforeEach1(){
        String classname =Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(classname);
    }


    @Test
//    @Tag("group1")
    void test2(){
        String classname =Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(classname);
    }

    @Test
//    @Tag("group2")
    void test3(){
        String classname =Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(classname);
    }

    @Test
//    @Tag("group1")
    void test1(){
        String classname =Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(classname);
    }


    @AfterEach
    void afterEach(){
        String classname =Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(classname);
    }

    @AfterAll
    @Disabled
    static  void afterAll(){
        String classname =Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(classname);
    }

}
