package medium;
//1823. 找出游戏的获胜者
//约瑟夫问题，用队列模拟，也可以直接使用数学结论

import java.util.LinkedList;

/**
 * @author zal
 * @date 2022/5/4 9:06
 */
public class Demo1823 {
    public static void main(String[] args) {
        System.out.println(findTheWinner(5, 2));
    }

    /**
     *     int p = 0;
     *         for (int i = 2; i <= n; i++) {
     *             p = (p + k) % i;
     *         }
     *         return p + 1;
     */
    public static int findTheWinner(int n, int k) {
        LinkedList<Integer> que = new LinkedList<>();
        for (int i = 1; i <= n; i++) que.add(i);
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < k; j++) que.add(que.poll());
            que.pop();
        }
        return que.poll();
    }
}