package t2_array;

/**
 * 在一个长度为n的数组里的所有数字都在0～n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也
 * 不知道每个数字重复了几次。请找出数组中任意一个重复的
 * 数字。例如，如果输入长度为7的数组{2,3,3,0,2,5,3}，
 * 那么对应的输出是重复的数字2或者3。
 */
public class Code2_1 {
    public void findDuplicateNum(int[] a) {
        if (a == null || a.length == 0) {
            System.out.printf("数组为空");
            return;
        }
        for (int i : a) {
            if (i < 0 || i >= a.length) {
                System.out.printf("数字不在范围内");
                return;
            }
        }
        for (int i = 0; i < a.length; i++) {
            while (a[i] != i) {
                if (a[i] == a[a[i]]) {
                    System.out.println(a[i]);
                    break;
                } else {
                    // 交换a[i]和a[a[i]]
                    int temp = a[i];
                    a[i] = a[temp];
                    a[temp] = temp;
                }
            }

        }

    }

}
