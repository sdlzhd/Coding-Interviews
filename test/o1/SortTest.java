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

        int[] a = initArray(100);

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
        int[] a = initArray(500);

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
        int[] a = initArray(20);

        System.out.printf("排序前：");
        printArray(a);
        System.out.printf("\n");

        System.out.printf("排序后：");
        sort.bubbleSort(a);
        printArray(a);
    }

    /**
     * 测试快速排序
     */
    @Test
    public void mergeSort() throws Exception {
        int[] a = initArray(100);

        System.out.printf("排序前：");
        printArray(a);
        System.out.printf("\n");

        System.out.printf("排序后：");
        sort.mergeSort(a, 0, a.length - 1);
        printArray(a);
    }

    /**
     * 测试快速排序
     */
    @Test
    public void quickSort() throws Exception {
        int[] a = initArray(100);

        System.out.printf("排序前：");
        printArray(a);
        System.out.printf("\n");

        System.out.printf("排序后：");
        sort.quickSort(a);
        printArray(a);
    }

    /**
     * 测试希尔排序
     */
    @Test
    public void shellSort() throws Exception {
        int[] a = initArray(100);

        System.out.printf("排序前：");
        printArray(a);
        System.out.printf("\n");

        System.out.printf("排序后：");
        sort.shellSort(a);
        printArray(a);
    }

    /**
     * 测试堆排序
     */
    @Test
    public void minHeapSort() throws Exception {
        int[] a = initArray(100);

        System.out.printf("排序前：");
        printArray(a);
        System.out.printf("\n");

        System.out.printf("排序后：");
        sort.minHeapSort(a);
        printArray(a);
    }

    /**
     * 随机生成长度为10，范围在[0,max)的数组
     *
     * @param max 随机数的上限
     * @return 长度为10的数组
     */
    private int[] initArray(int max) {
        int[] a = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            // 生成[0,10)集合中的整数，不包括10
            a[i] = random.nextInt(max);
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