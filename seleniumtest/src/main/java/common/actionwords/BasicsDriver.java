package common.actionwords;

import com.sun.org.apache.bcel.internal.generic.NEW;
import common.publicConfig.PublicParameter;
import javafx.beans.property.SetProperty;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author Nevri on 2021/4/13
 * @Title:
 * @Description:
 */
public class BasicsDriver {

    //防止浏览器变化

//    public static void main(String[] args) {
//        getDriver();
//    }
    public static WebDriver getDriver(){
        //此处设置一个 入参环境变量 broswer
        String broswer  =Propertie.getvalue(PublicParameter.PROPERTIES_FILE,"broswerType");
        WebDriver driver ;
        if ("Chrome".equals(broswer)){
            System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/AppData/Local/Google/Chrome/Application/chromedriver.exe");
            driver =new ChromeDriver();
            initDriver(driver);
            return driver;
        }else if ("FireFox".equals(broswer)){
            System.setProperty("webdriver.chrome.driver","C:/Users/Administrator/AppData/Local/Google/Chrome/Application/chromedriver.exe");
            driver =new ChromeDriver();
            return driver;
        }
        return null;
      }


    public static   void initDriver(  WebDriver driver   ){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
