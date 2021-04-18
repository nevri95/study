package Parameter;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author Nevri on 2021/3/28
 * @Title:
 * @Description:
 */
public class parmeterTest {

//    @ParameterizedTest
//    @ValueSource( strings = {  "strings","strings2"})
//    void valueSource( String parameter, String parameter2 ){
//        System.out.println(parameter);
//
//    }

//    @ParameterizedTest
//    @CsvFileSource(resources = "/testcsv.csv",numLinesToSkip = 1)
//    void test01(String enumFeil ,int  num) {
//            System.out.println(enumFeil);
//        System.out.println(num);
//    }


//    @ParameterizedTest
//    @CsvSource(    value={ "name,234", "String,24546"  })
//    void test01(String enumFeil ,int  num) {
//            System.out.println(enumFeil);
//        System.out.println(num);
//    }

//__________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________
//数据参数转换
    @ParameterizedTest
    @MethodSource
    void testWithMultiArgMethodSource(User user) {
      System.out.println(user.name);
    }


    static List<User>  testWithMultiArgMethodSource () throws  IOException{
        ObjectMapper mapper=new  ObjectMapper();
        System.out.println(parmeterTest.class.getResource("/user.json"));
        TypeReference typeReference =new TypeReference<List<User>>() {
        } ;
         List<User> users= mapper.readValue( parmeterTest.class.getResourceAsStream("/user.json"),typeReference);
         return users;
    }

//    static List<User> testWithMultiArgMethodSource ()  throws IOException {
//            ObjectMapper mapper= new ObjectMapper(new YAMLFactory());
//        User user1= new User();
//        TypeReference typeReference =new TypeReference <List<User>>(){ };
//        System.out.println(parmeterTest.class.getResource("/user.yaml"));
//        System.out.println(parmeterTest.class.getResource("/"));
//        System.out.println(parmeterTest.class.getResource(""));
//        System.out.println( parmeterTest.class.getResourceAsStream("/user.yaml").toString());
//    List<User> users= mapper.readValue(
//            parmeterTest.class.getResourceAsStream("/user.yaml"),typeReference
//    );
//                List<User> users= mapper.readValue(
//                        new File("//src/test/resources/user.yaml"),typeReference
//        );
//        System.out.println(users);
//        return  users;
//    }

    //  ______________________________________   ______________________________________________________________________________________________________________________________________________________________________________________________
//    //此处为流多次传参
//    @ParameterizedTest
//    @MethodSource("stringIntAndListProvider")
//    void testWithMultiArgMethodSource(String str, int num, List<String> list) {
//      System.out.println(str);
//        System.out.println(num);
//        System.out.println(list);
//    }

//    static Stream<Arguments> stringIntAndListProvider() {
//        return Stream.of(
//                Arguments.of("foo", 1, Arrays.asList("a", "b")),
//                Arguments.of("bar", 2, Arrays.asList("x", "y"))
//        );
//    }
// ______________________________________________________________________________________________________________________________________________________________________________________________
//    @ParameterizedTest
//    @ArgumentsSource( MyArgumentsSource.class)
//    void argumentOutput( String feild){
//        System.out.println(feild);
//    }




//    @ParameterizedTest
//    @EnumSource(EnumFeil.class)
//    void test01(EnumFeil enumFeil) {
//        if (EnumFeil.Frs.equals(enumFeil)) {
//            System.out.println("true");
//        } else if (EnumFeil.Sec.equals(enumFeil)) {
//            System.out.println("false");
//        }
//
//    }


//    static String  test01(){
//         String  param="parameter1";
//         return param;
//    }


}
