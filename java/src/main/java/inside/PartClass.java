package inside;

/**
 * @author Nevri on 2021/4/9
 * @Title:
 * @Description:
 */
public class PartClass {
    //1.
    public void method (){
        //需要定义为final 使其无法重新赋值
        final  int age =10;
         class a{
             public void insidemethod(){
                 /*age=20;报错  无法重新赋值 age*/
                 System.out.println(age);
             }
         }
        }
    public  Comparable  method1() {
        class Impl implements Comparable {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
            return  new Impl();
        }
    }

}
