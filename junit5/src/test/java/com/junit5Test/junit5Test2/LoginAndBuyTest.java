package com.junit5Test.junit5Test2;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * @author Nevri on 2021/3/28
 * @Title:
 * @Description:
 */
public class LoginAndBuyTest {
    static HashMap<String,Object> hashMap=new HashMap<String, Object>();
    @Test
    void hasMapInput (){
        hashMap.put("登录","登录成功");
    }

    @Nested
    class BuyTest1{
        @Test
        void payTets(){
            if(hashMap.get("购买").equals("购买电脑")){
                System.out.println("购买物件");
                hashMap.put("给钱","$5000");
            }else{
                System.out.println("重新选物品");
            }
        }
    }

    @Nested
    class BuyTest {
        @Test
        void buyTets(){
            if(hashMap.get("登录").equals("登录成功")){
                System.out.println("购买物件");
                hashMap.put("购买","购买电脑");
            }else{
                System.out.println("重新登录");
            }
        }
    }






}
