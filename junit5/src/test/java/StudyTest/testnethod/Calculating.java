package StudyTest.testnethod;

/**
 * @author Nevri on 2021/4/10
 * @Title:
 * @Description:
 */
public class Calculating {
    static int  cou =0;
    public synchronized   static  int  count(int x){
        cou=cou+x;
        System.out.println("统计");
        return  cou;
    }

    public static int add(int x ,int y ) throws InterruptedException {
        cou = x+y;
        System.out.println("加法");
        Thread.sleep(1000);
        return cou;
    }


}
