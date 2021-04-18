package inside;

/**
 * @author Nevri on 2021/4/9
 * @Title:
 * @Description:
 */
public class InsideClass {
    int age;
    public void method(){
    }
    public static void staticmethod(){
    }
     //成员内部类  直接在类下
    class Inside{
        //访问类下方法
         public void insideMethod(){
             System.out.println(age);
             method();
             staticmethod();
         }
     }
    //静态成员内部类  直接在类下
   static class StaticClass{
        //访问类下方法
        public void insideMethod(){
            //无法方位同类下非静态方法 跟变量
//            method();
            staticmethod();
        }
    }
     //局部内部类 即在方法中
     public static void run() {
        //在方法内  块内  构造器内下边
         class InsideMethod{
         }
     }
}

//其他类
class DemoTest {
    //创建外部类对象
    InsideClass insideclass= new InsideClass();
    //静态成员内部类类的实例化
    InsideClass.StaticClass staticclass= new  InsideClass.StaticClass();
    //非静态成员内部类 需实例化外部类后利用外部类对象new   内部类的实例化 需在外部了实例化的前提下
    //错误方法
    // InsideClass.Inside  inside= new InsideClass.Inside();
    InsideClass.Inside   inside=insideclass.new Inside();
}


