package m_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/13 19:25
 *  别人的代码
 **/
public class Demo40_test {

    static long sum = 0;
    static long p_before = 0;
    static long cur = 0;
    public static void main(String[] args) throws Exception{
        //  Auto-generated method stub
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        char[] letters = bfr.readLine().toCharArray();

        // 先找到最后一个T
        int index = 0;
        for(int i = letters.length - 1;i >= 0;i--) {
            // 将最后一个T的下标赋予index
            if(letters[i] == 'T') {
                index = i;
                break;
            }
        }

        // 若最后一个 T 的位置在2(下标)之前，则该字符串不可能形成PAT
        if(index < 2) {
            System.out.print(0);
            return;
        }

        for(int i = 0;i <= index;i++) {
            // 碰到'P'，p_before++,表示如果以后遇到了 'A',则当前这个 'A'之前有p_before个 'P'，即能形成p_before种PA
            if(letters[i] == 'P') {
                p_before++;
            }
            // 碰到'A',cur += p_before,记录当前能形成 cur 种PA
            if(letters[i] == 'A') {
                cur += p_before;
            }
            // 碰到'T', sum += cur,记录 当前 T 前面有多少种 PA（能与之组成PAT）
            if(letters[i] == 'T') {
                sum += cur;
            }
        }
        //System.out.println(index);
        System.out.println(sum % 1000000007);
        System.out.println(sum);
        System.out.println(index);
    }

}
