package com.concurrency;

import com.asserttest.util.Calculat;
import org.junit.jupiter.api.RepeatedTest;

/**
 * @author Nevri on 2021/4/12
 * @Title:
 * @Description:
 */
public class ConcurrencyTest {

    @RepeatedTest(10)
    public synchronized void  Demo001Test()throws InterruptedException{
        Calculat.count(1);
    }
}
