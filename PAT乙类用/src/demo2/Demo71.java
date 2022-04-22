package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/4/1 12:43
 * 1071 小赌怡情 (15 分)
 * 2022/04/01 13:01:59
 * 答案正确
 * 	15	编程题	Java (javac)	135 ms
 **/
public class Demo71 {
    public static void main(String[] args) throws IOException {
        int money = 0,times = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        money = Integer.parseInt(line.split("\\s+")[0]);times = Integer.parseInt(line.split("\\s+")[1]);
        int n1 = 0;
        int flag = -1;
        int chouma = 0;
        int n2 = 0;
        for (int i = 0; i < times; i++) {
            String temp = br.readLine();
            String[] split = temp.split("\\s+");
            n1 = Integer.parseInt(split[0]);
            flag = Integer.parseInt(split[1]);
            chouma = Integer.parseInt(split[2]);
            n2 = Integer.parseInt(split[3]);

            if (chouma > money){
                System.out.printf("Not enough tokens.  Total = %d.",money);
                System.out.println("");
            }else {

            //判断输赢
            if (flag==0&&n2<n1||flag==1&&n2>n1){
                money+=chouma;
                System.out.printf("Win %d!  Total = %d.",chouma,money);
                System.out.println("");
            }else {
                money-=chouma;
                System.out.printf("Lose %d.  Total = %d.",chouma,money);
                System.out.println("");
            }
            }

            //钱等于0，game over
            if (money==0) {
                System.out.println("Game Over.");
                break;
            }

        }
        br.close();
    }
}
