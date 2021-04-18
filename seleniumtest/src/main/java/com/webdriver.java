package com;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import common.actionwords.BasicBusinessActions;
import common.actionwords.FindElementsAW;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


/**
 * @author Nevri on 2021/4/13
 * @Title:
 * @Description:
 */

public class webdriver {
    private FindElementsAW findElementsAW = new FindElementsAW();

@BeforeAll
public static void  setup(){

}

@Test
public void test() throws InterruptedException, IOException {
    findElementsAW.openUrl("https://mail.qq.com/");
    findElementsAW.SwitchToFrame("//iframe [@id='login_frame']");
    findElementsAW.waitVisibility("//a[@id='switcher_qlogin']").click();
    findElementsAW.waitVisibility("//input[@id='pp']");
//    findElementsAW.clickElement("//input[@class='login_button']");
//    findElementsAW.waitForText("//b[@id='useralias']","年轻");
    Set<Cookie> cookies= findElementsAW.getCookoes();
    cookies.forEach(cookie -> System.out.println( cookie.getName()+"和"+cookie.getValue()));
    //忽略写yaml的时候的三杆
    ObjectMapper mapper = new ObjectMapper(new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER));
    mapper.writeValue(new File("src/main/resources/cookies.yaml"), cookies);
    findElementsAW.close();
    findElementsAW.sleep(5);
    findElementsAW.newDriver();
    //序列化
    findElementsAW.openUrl("https://mail.qq.com/");
    findElementsAW.SwitchToFrame("//iframe [@id='login_frame']");
    findElementsAW.waitVisibility("//a[@id='switcher_qlogin']").click();
//    System.out.println("可以输入密码了");
    TypeReference<List<HashMap<String,Object> >> recookies=new TypeReference<List<HashMap<String, Object>>>() {};
    List<HashMap<String,Object> >  rtcookies = mapper.readValue(new File("src/main/resources/cookies.yaml"), recookies);
    rtcookies.forEach( rtcookie ->findElementsAW.addCookies( new Cookie( rtcookie.get("name").toString(),  rtcookie.get("value").toString() ) ));
    Set<Cookie> result =findElementsAW.getCookoes();
    System.out.println(result.toString());
    findElementsAW.refresh();
    findElementsAW.waitVisibility("//input[@id='pp']");
    findElementsAW.quite();
}

@Test
public void  testSend() {
    findElementsAW.openUrl("https://work.weixin.qq.com/wework_admin/frame");
    findElementsAW.clickElement("//span[@class='soutu-btn']");
    findElementsAW.sendKey( "//input[@class='upload-pic']","E:\\学习文件\\个人学习以及面试\\面试\\白底录肩照.jpg" );
    findElementsAW.sleep(5);
}


    @Test
    public void  logIn() {
        BasicBusinessActions.loginUrl();
    }


@AfterAll
public static void  teardown(){

}
}
