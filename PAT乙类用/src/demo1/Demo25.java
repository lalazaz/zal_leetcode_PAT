package demo1;

import java.util.Scanner;

//柳神代码     她用C++写的，一个reverse函数不知道怎么处理
public class Demo25 {
    public static void main(String[] args) {

        int first, k, n, temp;
        Scanner scanner = new Scanner(System.in);
        first = scanner.nextInt();
        n = scanner.nextInt();
        k = scanner.nextInt();
        int[] data = new int[100005];
        int[] next = new int[100005];
        int[] list = new int[100005];
        for (int i = 0; i < n; i++) {
            temp = scanner.nextInt();
            data[temp] = scanner.nextInt();
            next[temp] = scanner.nextInt();
        }
        int sum = 0;//不一定所有的输入的结点都是有用的，加个计数器
        while (first != -1) {
            list[sum++] = first;
            first = next[first];
        }
        /*for (int i = 0; i < (sum - sum % k); i += k)
            reverse(begin(list) + i, begin(list) + i + k);
        for (int i = 0; i < sum - 1; i++)
            printf("%05d %d %05d\n", list[i], data[list[i]], list[i + 1]);
        printf("%05d %d -1", list[sum - 1], data[list[sum - 1]]);*/
    }
}
