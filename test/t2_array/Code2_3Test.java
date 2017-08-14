package t2_array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Code2_3Test {
    /**
     * 数字在数组中
     */
    @Test
    public void numInArray() throws Exception {
        Code2_3 code2_3 = new Code2_3();
        int[][] a = {{1, 2, 8, 9}, {2, 4, 9, 12}, {2, 4, 10, 13}, {6, 8, 11, 15}};
        boolean found = code2_3.isInArray(a, 13);
        System.out.println(found);
    }

    /**
     * 数字在数组中，且是最大数
     */
    @Test
    public void maxInArray() throws Exception {
        Code2_3 code2_3 = new Code2_3();
        int[][] a = {{1, 2, 8, 9}, {2, 4, 9, 12}, {2, 4, 10, 13}, {6, 8, 11, 15}};
        boolean found = code2_3.isInArray(a, 15);
        System.out.println(found);
    }

    /**
     * 数字在数组中，且是最小数
     */
    @Test
    public void minInArray() throws Exception {
        Code2_3 code2_3 = new Code2_3();
        int[][] a = {{1, 2, 8, 9}, {2, 4, 9, 12}, {2, 4, 10, 13}, {6, 8, 11, 15}};
        boolean found = code2_3.isInArray(a, 1);
        System.out.println(found);
    }

    /**
     * 数字不在数组中
     */
    @Test
    public void noInArray() throws Exception {
        Code2_3 code2_3 = new Code2_3();
        int[][] a = {{1, 2, 8, 9}, {2, 4, 9, 12}, {2, 4, 10, 13}, {6, 8, 11, 15}};
        boolean found = code2_3.isInArray(a, 7);
        System.out.println(found);
    }

    /**
     * 空数组
     */
    @Test
    public void nullArray() throws Exception {
        Code2_3 code2_3 = new Code2_3();
        int[][] a = {};
        boolean found = code2_3.isInArray(a, 13);
        System.out.println(found);

    }

}