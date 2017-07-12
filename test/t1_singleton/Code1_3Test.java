package t1_singleton;

import org.junit.Test;


public class Code1_3Test {
    @Test
    public void getInstance() throws Exception {
        Code1_3Test.MyThread myThread1 = new Code1_3Test.MyThread();
        Code1_3Test.MyThread myThread2 = new Code1_3Test.MyThread();
        myThread1.start();
        myThread2.start();
    }

    /**
     * 循环 100 次所需时间 0.004
     * 循环 1000 次所需时间 0.03
     * 循环 10000 次所需时间 0.09
     */
    @Test
    public void testTime() {
        int i = 0;
        // 获取当前时间戳
        long startTime = System.currentTimeMillis();
        while (i != 10000) {
            Code1_3Test.MyThread myThread = new Code1_3Test.MyThread();
            myThread.run();
            i++;
        }
        // 执行完毕，获取时间戳
        long endTime = System.currentTimeMillis();
        float seconds = (endTime - startTime) / 1000F;
        System.out.printf(Float.toString(seconds));
    }

    class MyThread extends Thread {
        public void run() {
            Code1_3 instance = Code1_3.getInstance();
            System.out.printf(instance.toString() + "\n");
        }
    }

}