package Interface;

public interface InterfaceNewAdd {
    //jdk1.8+ 静态方法  实现类中无法重写
    public  static   void fun(){
        System.out.println("default  fun");
    };
//
//    class Impl implements InterfaceNewAdd{
//        //重写 几口中非抽象方法
//        public  void  fun(){
//            //接口非抽象方法 在实现类中的使用
//            fun1();
//            //重写后 实现类中自身调用
//            fun();
//            //接口实现中fun()方法的调用
//            InterfaceNewAdd.super.fun();
//            System.out.println("overrides fun");
//        }
//    }
}
