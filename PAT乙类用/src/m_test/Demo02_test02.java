package m_test;

public class Demo02_test02 {
    public static void main(String[] args) {
        int val = 12345;
        int r_digit;
        //System.out.print("反转后的整数是：");
        while(val!=0){
            r_digit = val %10;
            System.out.print(r_digit);
            val = val /10;
        }
    }
}
