package demo;

//@Date 2022/4/14 13:41
//1672. 最富有客户的资产总量
public class Demo1672 {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
        System.out.println(maximumWealth(new int[][]{{1, 5}, {7, 3},{3,5}}));
        System.out.println(maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int total = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                total += accounts[i][j];
            }
            max = Math.max(max, total);
        }
        return max;
    }
}
