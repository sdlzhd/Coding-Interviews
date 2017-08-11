package o1;

/**
 * 常见的排序算法
 */
public class Sort {
    /**
     * 选择排序
     *
     * @param a 要排序的数组
     */
    public void selecttionSort(int[] a) {
        if (a == null) return;
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

    /**
     * 插入排序
     *
     * @param a 要排序的数组
     */
    public void inserttionSort(int[] a) {
        if (a == null) return;
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

    /**
     * 冒泡排序
     *
     * @param a 要排序的数组
     */
    public void bubbleSort(int[] a) {
        if (a == null) return;
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

    /**
     * 归并排序
     * 将两个（或两个以上）有序表合并成一个新的有序表 即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列
     *
     * @param a 待排序数组
     * @return 有序数组
     */
    public void mergeSort(int[] a, int low, int high) {
        if (a == null) return;
        int mid = (low + high) / 2;
        if (low < high) {
            // 左边
            mergeSort(a, low, mid);
            // 右边
            mergeSort(a, mid + 1, high);
            // 左右归并
            mergeArray(a, low, mid, high);
        }

    }

    private void mergeArray(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;// 左指针
        int j = mid + 1;// 右指针
        int k = 0;

        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = nums[j++];
        }

        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            nums[k2 + low] = temp[k2];
        }
    }

    /**
     * 快速排序（递归）
     *
     * @param a 要排序的数组
     */
    public void quickSort(int a[]) {
        subQuickSort(a, 0, a.length - 1);
    }

    /**
     * 一遍快速排序过程
     *
     * @param a    要拆分且排序数组
     * @param low  数组低位（分解、交换标识）
     * @param high 数组高位
     */
    private void subQuickSort(int a[], int low, int high) {
        if (low >= high) return;
        int i = low;
        int j = high;
        int index = a[i];
        while (i < j) {
            while (i < j && a[j] >= index)
                j--;
            if (i < j)
                a[i++] = a[j];
            while (i < j && a[i] < index)
                i++;
            if (i < j)
                a[j--] = a[i];
        }
        a[i] = index;
        subQuickSort(a, low, i - 1);
        subQuickSort(a, i + 1, high);
    }

    /**
     * 希尔排序
     *
     * @param a 待排序的数组
     */
    public void shellSort(int a[]) {
        if (a == null) return;
        int i, j, h, temp;
        int len = a.length;
        for (h = len / 2; h > 0; h = h / 2) {
            for (i = h; i < len; i++) {
                temp = a[i];
                for (j = i - h; j >= 0; j -= h) {
                    if (temp < a[j]) {
                        a[j + h] = a[j];
                    } else break;
                }
                a[j + h] = temp;
            }
        }
    }

    private void adjustMinHeap(int a[], int pos, int len) {
        int temp;
        int child = 0;
        for (temp = a[pos]; 2 * pos + 1 <= len; pos = child) {
            child = 2 * pos + 1;
            if (child < len && a[child] > a[child + 1]) {
                child++;
            }
            if (a[child] < temp) a[pos] = a[child];
            else break;
        }
        a[pos] = temp;
    }

    /**
     * 最小堆排序
     *
     * @param a 待排序的数组
     */
    public void minHeapSort(int a[]) {
        int i;
        int len = a.length;
        for (i = len / 2 - 1; i >= 0; i--) adjustMinHeap(a, i, len - 1);
        for (i = len - 1; i >= 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            adjustMinHeap(a, 0, i - 1);
        }
    }
}