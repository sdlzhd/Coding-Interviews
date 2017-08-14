package t2_array;


/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序
 * 排序，每一列都按照从上到下递增的顺序排序。请完成
 * 一个函数，输入这样的一个二维数组和一个整数，判断
 * 数组中是否含有该整数。
 */
public class Code2_3 {
    public boolean isInArray(int[][] a, int num) {
        boolean flag = false;

        if (a == null || a.length == 0 || a[0].length == 0) return false;

        // 获取数组的行数和列数
        int rows = a.length;
        int cols = a[0].length;

        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            if (a[row][col] == num) {
                flag = true;
                break;
            } else if (a[row][col] > num) {
                --col;
            } else
                ++row;
        }

        return flag;
    }
}
