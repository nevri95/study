package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Nevri on 2021/4/10
 * @Title:
 * @Description:
 */
public class AssertTest {
    @Test
    public  void assertAdd(){

        Assert.assertEquals(1,2);
        Assert.assertEquals(2,2);
    }



}
