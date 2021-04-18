package suiteDemo;

import org.junit.Test;

/**
 * @author Nevri on 2021/3/27
 * @Title:
 * @Description:
 */
public class loginTest  extends  BaseTest{
    @Test
    public void fun(){
        datmap.put("login","登录成功")  ;
            System.out.println("login"+datmap);

    }
}
