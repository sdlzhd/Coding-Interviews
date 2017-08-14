package t2_array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Code2_2Test {
    Code2_2 code2_2 = new Code2_2();

    /**
     * 没有重复数字
     */
    @Test
    public void noDuplicateNum() throws Exception {
        int[] a = {2, 3, 5, 4, 1, 6, 7};
        code2_2.findAnyDuplicateNum(a);
    }

    /**
     * 一个重复数字
     */
    @Test
    public void oneDuplicateNum() throws Exception {
        int[] a = {2, 3, 5, 4, 7, 2, 6, 1};
        code2_2.findAnyDuplicateNum(a);
    }

    /**
     * 多个重复数字
     */
    @Test
    public void DuplicateNum() throws Exception {
        int[] a = {2, 3, 5, 4, 3, 2, 6, 7};
        code2_2.findAnyDuplicateNum(a);
    }

    /**
     * 空数组
     */
    @Test
    public void nullNum() throws Exception {
        int[] a = {};
        code2_2.findAnyDuplicateNum(a);
    }

}