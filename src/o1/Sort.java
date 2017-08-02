package o1;

public class Sort {
    /**
     * 选择排序
     *
     * @param a 要排序的数组
     */
    public void selecttionSort(int[] a) {
        if (a != null) {
            int temp = 0;
            int flag = 0;
            for (int i = 0; i < a.length; i++) {
                temp = a[i];
                flag = i;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] < temp) {
                        temp = a[j];
                        flag = j;
                    }
                }
                // 结束内层循环，如果存在最小数，交换最小数
                if (flag != i) {
                    a[flag] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    /**
     * 插入排序
     *
     * @param a 要排序的数组
     */
    public void inserttionSort(int[] a) {
        if (a != null) {
            for (int i = 1; i < a.length; i++) {
                int temp = a[i], j = i;
                if (a[j - 1] > temp) {
                    while (j >= 1 && a[j - 1] > temp) {
                        a[j] = a[j - 1];
                        j--;
                    }
                }
                a[j] = temp;
            }
        }
    }

    /**
     * 冒泡排序
     *
     * @param a 要排序的数组
     */
    public void bubbleSort(int[] a) {
        if (a != null) {
            int temp;
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = a.length - 1; j > i; --j) {
                    if (a[j] < a[j - 1]) {
                        temp = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = temp;
                    }
                }
            }
        }
    }

}