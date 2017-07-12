package t1_singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongdong on 17-7-12.
 */
public class Code1_4Test {
    @Test
    public void getInstance() throws Exception {
        Code1_4Test.MyThread myThread1 = new Code1_4Test.MyThread();
        Code1_4Test.MyThread myThread2 = new Code1_4Test.MyThread();
        myThread1.start();
        myThread2.start();
    }

    /**
     * 循环 100 次所需时间 0.004
     * 循环 1000 次所需时间 0.026
     * 循环 10000 次所需时间 0.081
     */
    @Test
    public void testTime() {
        int i = 0;
        // 获取当前时间戳
        long startTime = System.currentTimeMillis();
        while (i != 10000) {
            MyThread myThread = new MyThread();
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
            Code1_4 instance = Code1_4.getInstance();
            System.out.printf(instance.toString() + "\n");
        }
    }

}