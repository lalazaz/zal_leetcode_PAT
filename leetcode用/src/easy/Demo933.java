package easy;
//933. 最近的请求次数

import java.util.LinkedList;

/**
 * @author zal
 * @date 2022/5/6 11:13
 */
public class Demo933 {
    public static void main(String[] args) {

    }

    public Demo933() {

    }

    static LinkedList<Integer> que = new LinkedList<>();

    public static int ping(int t) {
        while (!que.isEmpty()) {
            if (que.peek() < t - 3000) {
                que.poll();
            } else break;
        }
        que.push(t);
        return que.size();
    }
}
