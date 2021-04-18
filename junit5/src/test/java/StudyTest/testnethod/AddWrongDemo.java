package StudyTest.testnethod;

/**
 * @author Nevri on 2021/4/12
 * @Title:
 * @Description:
 */
public class AddWrongDemo {
    static int i = 0;
    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j < 1000; j++) {
            new Thread(() -> {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }).start();

        }

        Thread.sleep(3000);

        System.out.println("循环 1000 后，i 的值 = " + i);
    }
}
