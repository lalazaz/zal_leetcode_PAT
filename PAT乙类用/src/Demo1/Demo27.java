package Demo1;


//2022/03/03 16:54:29	答案正确	20	编程题	Java (javac)	102 ms
//写了好久...也想了好多方法，然后发现最初求最大值的过程中就含有沙漏数字
//以及代码超级乱
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Demo27 {
    //1027 打印沙漏 (20 分)
    //1.接受数字  N 与符号
    //2. 1是特殊情况      后面加2还是奇数，然后减1乘2 ，找到比N小的最大一个
    //3.用符号按照特定方式打印，且打印出多余的数字
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] split = line.split("\\s+");
        int N = Integer.parseInt(split[0]);
        String fuhao = split[1];
        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();


        int i = 1;
        if (N == i) {
            System.out.println(fuhao);
            System.out.println(0);
        } else {
            int temp1 = i;
            int temp2 = 0;
            while (true) {
                res.add(i);
                i += 2;
                if (temp1 > N) {
                    break;
                } else {
                    temp2 = temp1;
                    //这里temp2就是结果
                    ints.add(temp2);
                }
                temp1 = i * 2 + temp1;
            }
            //System.out.println(res);
            int[] res2 = new int[res.size()-1];int p = 0;
            /*for (Integer integer : res) {
                res2[p++] = integer;
            }*/
            int l = res.size()-1;
            for (int j = 0; j < res.size()-1; j++) {
                res2[l-1] = res.get(j);
                l--;
            }
            //int[] ints1 = new int[res.size()];

            //System.out.println(res);
            /*int l1 = 0;
            for (Integer integer : res) {
                ints1[l1++] = integer;
            }*/

            /*for (Integer integer : res2) {
                System.out.print(integer+"  ");
            }*/


            //打印沙漏
            for (int j = 0; j < res2.length; j++) {
                //根据他的下标打印空格
                int temp3 = j;
                while (temp3 != 0){
                    System.out.print(" ");
                    temp3--;
                }
                //然后根据他的值打印符号
                int temp4 = res2[j];
                while (temp4 != 0){
                    System.out.print(fuhao);
                    temp4--;
                }
                System.out.println("");
            }

            //反向的
            for (int j = res2.length-1; j != -1; j--) {
                //根据他的下标打印空格   1不打印
                if (res2[j] != 1){
                    int temp6 = j;
                    while (temp6 != 0){
                        System.out.print(" ");
                        temp6--;
                    }
                    //然后根据他的值打印符号
                    int temp7 = res2[j];
                    while (temp7 != 0){
                        System.out.print(fuhao);
                        temp7--;
                    }
                    System.out.println("");
                }
            }


            System.out.println(N - temp2);
            //System.out.println(ints);













            /*//得到最后的结果
            int test = 0;
            for (int j = ints.size() - 1; j != -1; j--) {
                //此时的j就是ints的最外一层
                //System.out.println("最外一层:"+ints.get(j));
                //减去除j外的剩下层
                int temp = ints.get(j)/2;
                for (int k = 0; k < j; k++) {
                    //System.out.print("剩下层:"+ints.get(k));
                    temp -= ints.get(k)/2;

                }//用东西装
                if (temp == 0){
                    res.add(1);
                }else {
                    res.add(temp);
                }
                //System.out.println("");
            }System.out.println(res);*/
        }
    }
}
