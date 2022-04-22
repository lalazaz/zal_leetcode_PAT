package demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @Date 2022/4/4 20:03
 * 1082 射击比赛 (20 分)
 *
 * 2022/04/04 20:27:33
 * 答案正确
 * 	20	编程题	Java (javac)	130 ms
 *
 * 	用StreamTokenizer来单个接受数字又要比BufferedReader接受一行再分开快的多
 **/
public class Demo82 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int n = (int)st.nval;
        //int n = Integer.parseInt(br.readLine());
        int max = 0, min = 100000;
        int max_res = 0, min_res = 0;
        for (int i = 0; i < n; i++) {
            /*String temp = br.readLine();
            String[] split1 = temp.split("\\s+");
            int juli = (Math.abs(Integer.parseInt(split1[1]))*Math.abs(Integer.parseInt(split1[1]))+
                    Math.abs(Integer.parseInt(split1[2]))*Math.abs(Integer.parseInt(split1[2])));*/
            st.nextToken();
            int ID = (int)st.nval;
            st.nextToken();
            int x = (int)st.nval;
            st.nextToken();
            int y = (int)st.nval;
            int juli = Math.abs(x)*Math.abs(x)+
                    Math.abs(y)*Math.abs(y);
            if (juli>max){
                max = juli;
                max_res = ID;
            }
            if (juli<min){
                min = juli;
                min_res = ID;
            }
        }
        br.close();
        System.out.printf("%04d %04d",min_res,max_res);
    }
}
