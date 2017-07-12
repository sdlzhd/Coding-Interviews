package t1_singleton;

import org.junit.Test;


public class Code1_2Test {
    @Test
    public void getInstance() {
        Code1_2Test.MyThread myThread1 = new Code1_2Test.MyThread();
        Code1_2Test.MyThread myThread2 = new Code1_2Test.MyThread();
        myThread1.start();
        myThread2.start();
    }

    /**
     * 循环 100 次所需时间 0.0029000002
     * 循环 1000 次所需时间 0.0089
     * 循环 10000 次所需时间 0.3820001(100次的平均值)
     */
    @Test
    public void testTime100() {
        float avg = 0;
        int i = 0;
        while (i != 100) {
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
            Code1_2Test.MyThread myThread = new Code1_2Test.MyThread();
            myThread.run();
            i++;
        }
        // 执行完毕，获取时间戳
        long endTime = System.currentTimeMillis();
        return (endTime - startTime) / 1000F;
    }

    class MyThread extends Thread {
        public void run() {
            Code1_2 instance = Code1_2.getInstance();
            System.out.printf(instance.toString() + "\n");
        }
    }

}