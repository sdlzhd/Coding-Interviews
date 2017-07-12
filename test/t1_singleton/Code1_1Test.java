package t1_singleton;

import org.junit.Test;

import static org.junit.Assert.*;


public class Code1_1Test {
    /**
     * 单线程下的测试
     */
    @Test
    public void getInstance() {
        Code1_1 instance1;
        Code1_1 instance2;

        instance1 = Code1_1.getInstance();
        instance2 = Code1_1.getInstance();

        System.out.printf(instance1.toString() + "\n");
        System.out.printf(instance2.toString() + "\n");

        assertEquals(instance1, instance2);
    }

    /**
     * 启动两个线程，输出不一样的 HashCode
     */
    @Test
    public void getInstanceOfMultiThread() {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();

    }

    class MyThread extends Thread {
        public void run() {
            Code1_1 instance = Code1_1.getInstance();
            System.out.printf(instance.toString() + "\n");
        }
    }

}