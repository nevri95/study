package com.asserttest;

import com.asserttest.util.Calculat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Arrays;

import  static org.junit.jupiter.api.Assertions.*;
/**
 * @author Nevri on 2021/4/11
 * @Title:
 * @Description:
 */
public class junit5AssertDemo {
    @Test
    public void assert1(){
        //直接断言
       assertEquals(1,1);
        assertEquals(1,2);
        assertEquals(1,1);
    }
    @Test
    public void assert2(){
        //软断言  断言所有 即使其中有错误的也能
                assertAll( "这是一个软断言", ()->{
                            System.out.println("断言1");
                  assertEquals(1,1);},
                        ()->{
                            System.out.println("断言1");
                 assertEquals(1,2);
                        },
                        ()->{
                            System.out.println("断言1");
                       assertEquals(1,1);
                        });
    }
    @Test
    public void assert3(){
        //此处为静态导入方法的使用
        assertEquals("a","o","不符合");
    }

    @Test
    public void testAdd() throws InterruptedException {
        Arrays.asList();
        int sum =Calculat.add(1,2);

        int sum01 =Calculat.add(1,2);

        int sum02 =Calculat.add(1,3);

  /*      Executable exImpl1=new Executable() {
            @Override
            public void execute() throws Throwable {
                assertEquals(3,sum);
            }
        };

        Executable exImpl2=new Executable() {
            @Override
            public void execute() throws Throwable {
                assertEquals(3,sum01);
            }
        };
        Executable exImpl3=new Executable() {
            @Override
            public void execute() throws Throwable {
                assertEquals(3,sum02);
            }
        };*/
        assertAll("非lamad", new Executable[]{() -> assertEquals(3, sum), () -> assertEquals(3, sum01), () -> assertEquals(3, sum02)});
        assertAll("非lamad", new Executable[]{() -> assertEquals(3, sum), () -> assertEquals(3, sum01)});




    }


    @Test
    public void testAdd1()  throws InterruptedException {
        ArrayList<Executable> arrys = new ArrayList<>();
        int sum =Calculat.add(1,2);
        arrys.add( ()-> assertEquals(3,sum));
        int sum01 =Calculat.add(1,2);
        int sum02 =Calculat.add(1,3);
        arrys.add( ()-> {System.out.println("02");
            assertEquals(3,sum02);});
        arrys.add( ()-> {
            System.out.println("01");assertEquals(3,sum01);});
        assertAll("非lamad", arrys);
    }


}
