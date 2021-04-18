package com.junit5Test.junit5Test1;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * @author Nevri on 2021/3/28
 * @Title:
 * @Description:
 */

public class Junit5Demo1Test {
    @Test

    void test2(){
        String classname =Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("Sec"+classname);
    }

}
