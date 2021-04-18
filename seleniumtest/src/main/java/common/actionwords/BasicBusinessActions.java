package common.actionwords;

import com.PageElements.LoginPageElements;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import common.publicConfig.PublicParameter;
import org.openqa.selenium.Cookie;
import sun.util.resources.ga.LocaleNames_ga;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * @Title:
 * @Description:
 */
public class BasicBusinessActions {
    private static FindElementsAW findElementsAW = new FindElementsAW();
    private static   String url = Propertie.getvalue(PublicParameter.PROPERTIES_FILE,PublicParameter.TEST_URL);

    public  static FindElementsAW  loginUrl (){
        findElementsAW.openUrl(url);
        findElementsAW.waitVisibility(LoginPageElements.LOGIN_MASK);
        if(subTime()>30){
            //大于三十九重新扫码  时间算出来不怎么准确 暂时按三十算吧
            loginScanMask();
        }
        TypeReference <List<HashMap<String,Object>>> cookies = new  TypeReference <List<HashMap<String,Object>>>(){};
        ObjectMapper mapper = new ObjectMapper( new YAMLFactory());
        try {
           List<HashMap<String,Object>>  recookies=mapper.readValue(new File("src/main/resources/cookies.yaml") , cookies ) ;
            recookies.forEach(cookie->findElementsAW.addCookies(new Cookie(cookie.get("name").toString(),cookie.get("value").toString() )) );
            findElementsAW.refresh();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return   findElementsAW;
    }

    public  static void  loginScanMask(){
        System.out.println("请扫描二维码");
        try {
            findElementsAW.waitVisibility(LoginPageElements.LOGINDE_TITLE);
            Set<Cookie> cookies =findElementsAW.getCookoes();
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            mapper.writeValue( new File("src/main/resources/cookies.yaml"), cookies);
            System.out.println("重写了cookies.yaml");
        }catch (Exception e){
            System.out.println("等待超时");
        }
    }





    public  static String getCookiesPath(){
//public static void main(String[] args) {
        String path= System.getProperty("user.dir").toString();
        path=path+"\\src\\main\\resources\\cookies.yaml";
        System.out.println(path);
        return  path;
    }

    public  static long subTime( ){
//public static void main(String[] args) {
        long nd = 1000 * 24 * 60 * 60;
        long nh = 1000 * 60 * 60;
        long nm = 1000 * 60;
        SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd hh:mm");
        Date date = new Date();
        try {
            Date filedate=(Date)format.parse(getFileTime());
            long diff = date.getTime()- filedate.getTime() ;
            long min = diff % nd % nh / nm;
            return min;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return Long.parseLong(null);
    }

    public  static String  getFileTime (){
            try  {
            Process p = Runtime.getRuntime().exec( "cmd /C dir "+getCookiesPath() );
            InputStream is = p.getInputStream();
            BufferedReader br =  new  BufferedReader( new  InputStreamReader(is));
            String str;
            int  i =  0 ;
            while  ((str = br.readLine()) !=  null ) {
                i++;
                if  (i ==  6 ) {
                    return  str.substring( 0 ,  17 );
                }
            }
        }  catch  (java.io.IOException exc) {
            exc.printStackTrace();
        }
        return  null;
    }
}
