package t1_singleton;

import org.junit.Test;

import static org.junit.Assert.*;


public class Code1_4Test {
    @Test
    public void getInstance() {
        Code1_4Test.MyThread myThread1 = new Code1_4Test.MyThread();
        Code1_4Test.MyThread myThread2 = new Code1_4Test.MyThread();
        myThread1.start();
        myThread2.start();
    }

    /**
     * 循环 100 次所需时间 0.0025000002
     * 循环 1000 次所需时间 0.0095
     * 循环 10000 次所需时间 0.0546
     */
    @Test
    public void testTime10() {
        float avg = 0;
        int i = 0;
        while (i != 10) {
            avg += testTime(10000);
            i++;
        }
        avg = avg/10;
        System.out.printf(Float.toString(avg));
    }

    /**
     * @param num 测试执行的次数
     * @return 执行所需的秒数
     */
    private float testTime(int num) {
        int i = 0;
        // 获取当前时间戳
        long startTime = System.currentTimeMillis();
        while (i != num) {
            Code1_4Test.MyThread myThread = new Code1_4Test.MyThread();
            myThread.run();
            i++;
        }
        // 执行完毕，获取时间戳
        long endTime = System.currentTimeMillis();
        return (endTime - startTime) / 1000F;
    }

    class MyThread extends Thread {
        public void run() {
            Code1_4 instance = Code1_4.getInstance();
            System.out.printf(instance.toString() + "\n");
        }
    }

}