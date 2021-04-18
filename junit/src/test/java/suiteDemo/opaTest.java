package suiteDemo;

import org.junit.Test;

/**
 * @author Nevri on 2021/3/27
 * @Title:
 * @Description:
 */
public class opaTest extends  BaseTest{
    @Test
    public void fun(){
        if (datmap.get("login").equals("登录成功")){
            System.out.println("可以操作了");
            System.out.println(datmap);
        }else {
            System.out.println("未登录");
        }
    }
}
