package demo;

//@Date 2022/4/10 15:48
//7. 整数反转
public class Demo07 {
    public static void main(String[] args) {
        System.out.println(reverse(321));
        System.out.println(reverse(-321));
        System.out.println(reverse(0));
        System.out.println(reverse(2147483641));
        System.out.println(reverse(214748369));
        System.out.println(reverse(-2147483647));
    }
    public static int reverse(int x) {
        if (x>=0){
            try {
                StringBuilder sb = new StringBuilder(x + "");
                StringBuilder reverse = sb.reverse();
                return Integer.parseInt(reverse.toString());
            } catch (NumberFormatException e) {
                return 0;
            }
        }else {
            int reverse = 0;
            try {
                reverse = reverse(x * -1);
            } catch (StackOverflowError e) {
                return 0;
            }
            return -reverse;
        }
    }
}
