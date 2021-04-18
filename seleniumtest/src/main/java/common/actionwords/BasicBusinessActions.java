package common.actionwords;

import com.PageElements.LoginPageElements;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import common.publicConfig.PublicParameter;
import org.openqa.selenium.Cookie;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Set;

/**
 * @Title:
 * @Description:
 */
public class BasicBusinessActions {
    private static FindElementsAW findElementsAW = new FindElementsAW();
    private static   String url=Propertie.getvalue(PublicParameter.PROPERTIES_FILE,PublicParameter.TEST_URL);

    public  static FindElementsAW  loginUrl (){
        findElementsAW.openUrl(url);
        findElementsAW.waitVisibility(LoginPageElements.LOGIN_MASK);
        loginScanMask();


        return   findElementsAW;
    }

    public  static void  loginScanMask(){
        System.out.println("请扫描二维码");
        try {
            findElementsAW.waitVisibility(LoginPageElements.LOGINDE_TITLE);
            Set<Cookie> cookies =findElementsAW.getCookoes();
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            mapper.writeValue( new File("src/main/resources/cookies.yaml"), cookies);
        }catch (Exception e){
            System.out.println("等待超时");
        }
    }

    public static void main(String[] args) {
//    public  static void  getFileTime (){
        try  {
//            String  path =getClass().getClassLoader().getResource("cookies.yaml");
            Process p = Runtime.getRuntime().exec( "cmd /C dir D:\\JAVA\\idea\\workspace\\seleniumtest\\src\\main\\resources\\cookies.yaml" );
            InputStream is = p.getInputStream();
            BufferedReader br =  new  BufferedReader( new  InputStreamReader(is));
            String str;
            int  i =  0 ;
            while  ((str = br.readLine()) !=  null ) {
                i++;
                if  (i ==  6 ) {
                    System.out.println(str.substring( 0 ,  17 ));
                }
            }
        }  catch  (java.io.IOException exc) {
            exc.printStackTrace();
        }
    }

}
