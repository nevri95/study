package common.actionwords;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author Nevri on 2021/4/13
 * @Title:
 * @Description:
 */
public class FindElementsAW {
    //考虑到并行后期需要把动作都改为非 static  在pageAw 页面公共行为 页面中new pageElement 封装元素  公共方法存在BasicAw如登录抵达页面 (页面层级 由 pageElement 中定义的 self ,parent 返回 )
    public  WebDriver  driver = BasicsDriver.getDriver();
    public  WebDriverWait wait =new WebDriverWait(driver,10) ;

    public void  newDriver(){
        driver =BasicsDriver.getDriver();
         wait =new WebDriverWait(driver,20);
    }

    public  void openUrl(String url){
        driver.get(url);
    }
    public  void  quite(){
        driver.quit();
    }

    public  void  close(){
        driver.close();
    }

    public  void   sleep(long  time ) {
        try {
            Thread.sleep(time * 1000);
        }catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }

    private  By by(String xpath ){
        By by;
        if(true){
            by=By.xpath(xpath);
        }
        return  by;
}
    public void  waitElemnt(String xpath){
        WebDriverWait wait = new WebDriverWait( driver ,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by(xpath)));
    }

    public  WebElement  findElement(String  xpath){
        WebElement element= driver.findElement(by(xpath));
        return  element;
    }
    public  void  refresh(){
        driver.navigate().refresh();
    }
    public   Set<Cookie> getCookoes(){
         Set<Cookie> cookies = driver.manage().getCookies();
        return  cookies;
    }
    //刷新才生效
    public  void addCookies( Cookie cookie ){
            driver.manage().addCookie(cookie);
    }

    public  void clickElement (String xpath){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by(xpath)));
        element.click();
    }

    public  WebElement waitVisibility(String xpath){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by(xpath)));
        return  element;
    }

    public  WebElement waitInVisibility(String xpath){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by(xpath)));
        return  element;
    }

    public  void  waitForText(String xpath,String feild){
    wait.until(ExpectedConditions.textToBePresentInElementLocated(by(xpath), feild));
    }

    public  void SwitchToFrame (String xpath){
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by(xpath)));
    }

    //输入内容或者上传文件
    public  void sendKey (String xpath  , String sendkey){
        wait.until(ExpectedConditions.presenceOfElementLocated(by(xpath)));
       driver.findElement(by(xpath)).sendKeys(sendkey);
    }


    public  void executejs (String js , WebDriver... args){
         JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript(js, args);
    }
    public  String  getAlterText (String js , WebDriver... args){
        wait.until(ExpectedConditions.alertIsPresent());
        String  feild= driver.switchTo().alert().getText();
        return  feild;
    }

    public  void acceptAlter (String js , WebDriver... args){
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public  void dismissAlter (String js , WebDriver... args){
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().dismiss();
    }


}
