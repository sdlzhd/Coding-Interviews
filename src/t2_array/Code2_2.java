package t2_array;

/**
 * 在一个长度为n+1的数组里的所有数字都在1～n的范围内，
 * 所以数组中至少有一个数字是重复的。请找出数组中任意
 * 一个重复的数字，但不能修改输入的数组。例如，如果输
 * 入长度为8的数组{2,3,5,4,3,2,6,7}，那么对应的输出
 * 是重复的数字2或者3。
 */
public class Code2_2 {
    public void findAnyDuplicateNum(int[] a) {
        if (a == null || a.length == 0) {
            System.out.printf("数组为空");
            return;
        }
        int start = 1;
        int end = a.length - 1;
        while (end >= start) {
            //(end - start) / 2 == (end - start) >> 1
            int middle = ((end - start) / 2) + start;
            int count = countRange(a, start, middle);
            if (end == start) {
                if (count > 1) {
                    System.out.println(start);
                    return;
                } else break;
            }
            if (count > (middle - start + 1))
                end = middle;
            else start = middle + 1;
        }
    }

    private int countRange(int[] a, int start, int end) {
        if (a == null) {
            System.out.printf("数组为空");
            return 0;
        }
        int count = 0;

        for (int i : a) {
            if (i >= start && i <= end)
                ++count;
        }

        return count;
    }
}
