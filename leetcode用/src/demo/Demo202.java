package demo;

//@Date 2022/4/15 11:38
//202. 快乐数
public class Demo202 {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        boolean flag = false;
        long l = 0;
        while (l < 1000) {
            l++;
            if (n == 1) return true;
            else if (n == 4) return false;
            else {
                char[] chars = (n + "").toCharArray();
                int sum = 0;
                for (int i = 0; i < chars.length; i++) {
                    sum += (chars[i]-48) * (chars[i]-48);
                }
                n = sum;
            }
        }
        return flag;
    }
}
