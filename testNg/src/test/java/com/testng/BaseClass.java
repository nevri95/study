package com.testng;

/**
 * @author Nevri on 2021/3/28
 * @Title:
 * @Description:
 */
public class BaseClass {

    public static String getMethodName (){
        String methodName =Thread.currentThread().getStackTrace()[1].getMethodName();
//        String allname =methodName +"ThreadID:" + Thread.currentThread().getId();
        return  methodName ;
    }
}
