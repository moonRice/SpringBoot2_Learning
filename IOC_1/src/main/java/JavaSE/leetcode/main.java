package JavaSE.leetcode;

/**
 * @author zheng
 */
public class main {
    public static void main(String[] args) {
        // Question_765 情侣牵手
        // URL：https://leetcode-cn.com/problems/couples-holding-hands/
        int[] row1 = new int[]{0, 11, 1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
        int[] row2 = new int[]{0, 7, 9, 5, 4, 1, 3, 2, 8, 6};
        int[] row3 = new int[]{0, 2, 1, 3};
        System.out.println(Question_765.minSwapsCouples(row1));
        System.out.println(Question_765.minSwapsCouples(row2));
        System.out.println(Question_765.minSwapsCouples(row3));
    }
}
