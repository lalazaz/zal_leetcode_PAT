package demo;
//@Date 2022/4/14 15:28
//191. 位1的个数
public class Demo191 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }
    public static int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int res = 0;
        while (s.contains("1")){
            s = s.replaceFirst("1","");
            res++;
        }
        return res;
    }
}
