package demo0420;
//小米秋招软件开发方向第二场笔试

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zal
 * @date 2022/4/20 22:58
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if ((line.replaceAll("\\(", "")
                .replaceAll("\\)", "").length() != 0)) {
            System.out.println("NO");
            return;
        }
        while (true) {
            if (line.length() == 0) {
                System.out.println("YES");
                return;
            }
            if (line.indexOf("(") < line.indexOf(")")) {
                line = line.replaceFirst("\\(", "");
                line = line.replaceFirst("\\)","");
                //line = new StringBuilder(new StringBuilder(line).reverse().toString().replaceFirst("\\)", "")).reverse().toString();
            } else {
                System.out.println("NO");
                break;
            }
        }
    }
}
