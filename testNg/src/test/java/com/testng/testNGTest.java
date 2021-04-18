package com.testng;

import org.testng.annotations.*;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Nevri on 2021/3/28
 * @Title:
 * @Description:
 */
public class testNGTest {


    @DataProvider(name = "putInList")
    public Object[][] putInList() {
        Object[][] objects;
        return  objects = new Object[][]{
                {"list1", 1, 2, 3},
                {"list2", 1, 2, 3},
        };
    }


    @BeforeClass
    public void beforeClass(){
        String methodName=BaseClass.getMethodName();
        System.out.println("methodName : "+methodName);
    }

    @BeforeTest
    public void beforeTest(){
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("methodName : "+methodName);
    }

    @BeforeMethod
    public void beforeMethod(){
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("methodName : "+methodName);
    }
    @Test
    public void test(){
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("methodName : "+methodName);
    }
    @Test(groups={"group1" },dataProvider = "putInList",threadPoolSize=3,invocationCount=3)
    public void test2( String listname  ,int value1 ,int value2 ,int value3){
        System.out.println( listname );
        System.out.println( value1 );
        System.out.println( value2 );
        String methodName=BaseClass.getMethodName();
        System.out.println("methodName : "+methodName);

    }

    @Test(groups={"group2" })
    public void test3(){
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("methodName : "+methodName);
    }
    @Test(groups={"group1","group2" })
    public void test4(){
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("methodName : "+methodName);
    }
    @AfterMethod
    public void afterMethod(){
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("methodName : "+methodName);
    }

    @BeforeSuite
    public void BeforeSuite2(){
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("methodName : "+methodName);
    }

    @BeforeSuite
    public void BeforeSuite(){
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("methodName : "+methodName);
    }



    @AfterSuite
    public void AfterSuite(){
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("methodName : "+methodName);
    }

    @AfterTest
    public void afterTest(){
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("methodName : "+methodName);
    }

    @AfterClass
    public void afterClass(){
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("methodName : "+methodName);
    }




}
