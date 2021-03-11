package JavaSE.leetcode;

/**
 * @author zheng
 */
public class Question_765 {
    /**
     * Question_765 情侣牵手
     * URL：https://leetcode-cn.com/problems/couples-holding-hands/
     * */
    public static int minSwapsCouples(int[] row) {
        // 贪心算法 反向索引
        int n = row.length;
        // 反向索引表，row[i] = num => index[num] = i
        int[] indexMap = new int[n];
        for (int i = 0; i < n; i++) {
            indexMap[row[i]] = i;
        }
        int count = 0;
        for (int i = 0; i < n - 1; i += 2) {
            int p1 = row[i];
            // p1的情侣
            int p2 = (p1 & 1) == 0 ? p1 + 1 : p1 - 1;
            // p1和p2正好挨着，无需交换这一对
            if (row[i + 1] == p2) {
                continue;
            }
            // p2的位置
            int p2Index = indexMap[p2];
            // 交换 p2 <=> [i+1]
            swap(row, indexMap, i + 1, p2Index);
            count++;
        }
        return count;
    }

    private static void swap(int[] row, int[] indexMap, int i, int j) {
        int tmp = row[i];
        row[i] = row[j];
        row[j] = tmp;
        indexMap[row[i]] = i;
        indexMap[row[j]] = j;
    }
}
