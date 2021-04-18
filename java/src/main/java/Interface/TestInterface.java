package Interface;

//申请  interface 同位与 class
public interface TestInterface {
    // JDK 1.8 之前 常亮固定写法 灰色修饰关键字部分可省略 默认补全
       public static final  int num =1;
    //JDK 1.8 之前 抽象方法固定写法  (灰色修饰关键字部分可省略 默认补全):
        public abstract void  abstractfun();

    public static void main(String[] args) {
        //接口是无法创建对象的  但可以穿件实现类对象
        TestInterfaceFrs inter=  new Imple();
        System.out.println(Imple.frs);
    }
}

interface  TestInterfaceFrs{
    int frs=10;
    void abstractfunFrs();
}
interface  TestInterfaceSec{
    void abstractfunSec();
}
/**
 1.类实现 接口 关键字 implements
 2.一个类实现一个或多个接口,那么实现类要重写接口中的所有的抽象方
 3.如果实现类没有重写 接口中的所有抽象方法 可将此类变为抽象类
 4.Java有单继承 还有多实现(继承只可以继承一个父类,但实现却可以实现多个接口)
 */
class Imple  implements TestInterfaceFrs,TestInterfaceSec {
    @Override
    public void abstractfunFrs() {
    }
    @Override
    public void abstractfunSec() {
    }
}


