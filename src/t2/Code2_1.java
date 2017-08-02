package t2;

/**
 * 找出数组中的重复数字
 * 在一个长度为n的数组里的所有数字都在0～n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复的次数。
 * 请找出数组中任意一个重复的数字。
 * 例如，如果长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是重复的数字2或者3
 */
public class Code2_1 {

    private int a[] = {2, 3, 1, 0, 2, 5, 3};

    /**
     * 先把数组排序，然后从头到尾扫描
     */
    public void method1() {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int k = 1; k < a.length - 1; k++) {

        }

    }
}
