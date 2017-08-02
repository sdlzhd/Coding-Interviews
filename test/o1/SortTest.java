package o1;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class SortTest {

    Sort sort = new Sort();

    /**
     * 测试选择排序
     */
    @Test
    public void selecttionSort() throws Exception {

        int[] a = initArray();

        System.out.printf("排序前：");
        printArray(a);
        System.out.printf("\n");

        System.out.printf("排序后：");
        sort.selecttionSort(a);
        printArray(a);

    }

    /**
     * 测试插入排序
     */
    @Test
    public void inserttionSort() throws Exception {
        int[] a = initArray();

        System.out.printf("排序前：");
        printArray(a);
        System.out.printf("\n");

        System.out.printf("排序后：");
        sort.inserttionSort(a);
        printArray(a);
    }

    /**
     * 测试冒泡排序
     */
    @Test
    public void bubbleSort() throws Exception {
        int[] a = initArray();

        System.out.printf("排序前：");
        printArray(a);
        System.out.printf("\n");

        System.out.printf("排序后：");
        sort.bubbleSort(a);
        printArray(a);
    }


    /**
     * 随机生成长度为10，范围在[0,10)的数组
     *
     * @return 长度为10的数组
     */
    private int[] initArray() {
        int[] a = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            // 生成[0,10)集合中的整数，不包括10
            a[i] = random.nextInt(10);
        }
        return a;
    }

    /**
     * 打印数组内容
     *
     * @param a 要打印的数组
     */
    private void printArray(int[] a) {
        for (int i :
                a) {
            System.out.print(i + " ");
        }
    }

}