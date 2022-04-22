package m_test;

public class Demo13_test {
    //打印出前20个素数（从2开始，到后面）
    public static void main(String[] args) {

        int N =20;
        System.out.print(2+"  ");

        for (int i = 3; true; i++) {

            //i是我们要进行判断的数字
            int j = 2;
            for (; j <= i; j++) {
                if (i % j == 0){
                    break;
                }
            }
            if (j == i){
                N--;
                System.out.print(i + "  ");
            }

            if (N == 1) break;
        }
    }
}
