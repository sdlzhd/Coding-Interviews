package t2_array;

import org.junit.Test;

public class Code2_1Test {
    Code2_1 code2_1 = new Code2_1();

    /**
     * 没有重复数字
     */
    @Test
    public void noDuplicateNum() throws Exception {
        int[] a = {4, 1, 6, 0, 2, 5, 3};
        code2_1.findDuplicateNum(a);

    }

    /**
     * 一个重复数字
     */
    @Test
    public void oneDuplicateNum() throws Exception {
        int[] a = {4, 1, 6, 4, 2, 5, 3};
        code2_1.findDuplicateNum(a);

    }

    /**
     * 多个重复数字
     */
    @Test
    public void DuplicateNum() throws Exception {
        int[] a = {3, 1, 4, 3, 2, 1, 3};
        code2_1.findDuplicateNum(a);

    }

    /**
     * 空数组
     */
    @Test
    public void nullNum() throws Exception {
        int[] a = {};
        code2_1.findDuplicateNum(a);

    }

    /**
     * 数字不在0~n-1的范围内
     */
    @Test
    public void outNum() throws Exception {
        int[] a = {4, 1, 6, 7, 2, 5, 3};
        code2_1.findDuplicateNum(a);

    }

}