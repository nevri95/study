package common.actionwords;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Properties;


/**
 * @author Nevri on 2021/4/16
 * @Title:
 * @Description:
 */
public  class Propertie extends  Properties {


    private  static Logger logger= LoggerFactory.getLogger(Propertie.class);
//    public static String  getvalue ( String fileName , String key ) throws  IOException{ Properties properties = new Properties();
//        InputStream inputStream =  Propertie.class.getResourceAsStream(fileName);
//        properties.load(new InputStreamReader( inputStream,"UTF-8" ) );
//        String value = properties.getProperty(key);
//        return  value;
//    }

    //读取其他文件
//    public static void main(String[] args)throws  IOException {
//        Properties properties = new Properties();
//        Reader reader =new FileReader("src/main/resources/test.txt");
//        properties.load(reader );
//        properties.setProperty("testset","123465");
//        System.out.println(properties);
//    }

//    //写入文件
//    public static void main(String[] args)throws  IOException {
//        Properties properties = new Properties();
//        logger.debug("testdebug");
//        logger.info("testinfo");
//        logger.error("testerror");
////        properties.setProperty("testset","123465");
////        Writer writer =new FileWriter("src/main/resources/test.txt");
////        properties.store(writer,null );
////        //所有read  write都要关闭
////        writer.close();
//    }
    //读取 *.properties 文件
    public static String  getvalue ( String fileName , String key )  {
            Properties properties = new Properties();
        Reader reader = null;
        try {
            reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String value = properties.getProperty(key);
            return value;
    }





}

