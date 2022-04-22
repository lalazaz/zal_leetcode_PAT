package m_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo04_test {
    public static void main(String[] args) throws IOException {

//        String line = new Scanner(System.in).next();
//        System.out.println("结果"+line);


//        String line2 = new Scanner(System.in).nextLine();
//        System.out.println(line2);
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        while (bufferedReader != null){
            System.out.println(bufferedReader);
        }

    }
}
