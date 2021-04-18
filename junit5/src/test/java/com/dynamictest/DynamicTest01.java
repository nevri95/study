package com.dynamictest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.sun.org.apache.regexp.internal.RESyntaxException;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author Nevri on 2021/4/11
 * @Title:
 * @Description:
 */
public class DynamicTest01 {


    @TestFactory
    Collection<DynamicTest>  dynamicTestCollection(){
        return Arrays.asList(DynamicTest.dynamicTest("dynamictest001",()->Assertions.assertTrue(true))
        );
    }

    @Test
    public  void testDemo() throws IOException {
         ObjectMapper mapper = new ObjectMapper( new YAMLFactory());
        ResultList resultList;
        resultList=mapper.readValue(new File("D:\\JAVA\\idea\\workspace\\junit5\\src\\test\\resources\\user.yaml"),ResultList.class);
        System.out.println(resultList.toString());
    }

    //这个注解实际是接收方法 固定返回 Collection<DynamicTest> 的列表对象  实现测试任务的创建
    @TestFactory
    public   Collection<DynamicTest> factoryTestDemo() throws IOException {
         ArrayList<DynamicTest>  dynamicTests= new ArrayList<>();
         //java 反序列化
        ObjectMapper mapper = new ObjectMapper( new YAMLFactory());
        ResultList resultList=mapper.readValue(new File("D:\\JAVA\\idea\\workspace\\junit5\\src\\test\\resources\\user.yaml"),ResultList.class);
        System.out.println(resultList.toString());
        //此处遍历文件 根据文件数据生成对应的测试方法
        for (ShellResult shellResult:resultList.getResultList()){
            dynamicTests.add( DynamicTest.dynamicTest(shellResult.getCasename() ,()->{
                System.out.println("tastcasename:"+shellResult.getCasename());  Assertions.assertTrue(shellResult.isResult()); }));
        }
        return  dynamicTests;
    }
}
