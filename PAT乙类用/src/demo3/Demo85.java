package demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/**
 * @Date 2022/4/5 12:41
 * 1085 PAT单位排行 (25 分)
 * 2022/04/05 15:03:34
 * 部分正确
 * 	18	编程题	Java (javac)	435 ms
 * 	一个错了，两个超内存   麻烦的题目
 **/
public class Demo85 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int N = (int)st.nval;
        //用hashmap来存学校人数和加权分，其中key为学校，value为加权分和人数
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st.nextToken();String ID = st.sval;
            st.nextToken();int score = (int)st.nval;
            if (ID.charAt(0) == 'A') ;
                else if (ID.charAt(0)=='B') score = (int)(score/1.5);
                else score = (int)(score*1.5);
            st.nextToken();String school = st.sval;
            school = school.toLowerCase(Locale.ROOT);
            //System.out.println(ID+" "+score+" "+school);
            if (!map.containsKey(school)){
                map.put(school,score+" "+1);
            }else {
                String value = map.get(school);
                int sc = Integer.parseInt(value.substring(value.length()-1));
                sc+=1;
                int score_temp = score+Integer.parseInt(value.substring(0,value.length()-2));
                value = score_temp +" "+sc;
                map.put(school,value);
            }
        }
        String[] res = new String[map.size()];
        int i = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            res[i++] = next.getKey()+"="+next.getValue();
        }
/*        for (int j = 0; j < res.length; j++) {
            System.out.println(res[j]);
        }*/
        //按照题目需求排序
        for (int j = 0; j < res.length-1; j++) {
            for (int k = 0; k < res.length-1; k++) {
                //分多的在前
                if (Integer.parseInt(res[k].substring(res[k].indexOf("=")+1, res[k].indexOf(" ")))
                        < Integer.parseInt(res[k + 1].substring(res[k + 1].indexOf("=")+1, res[k + 1].indexOf(" ")))){
                    String temp = res[k+1];
                    res[k+1] = res[k];
                    res[k] = temp;
                }else if (Integer.parseInt(res[k].substring(res[k].indexOf("=")+1, res[k].indexOf(" ")))
                        == Integer.parseInt(res[k + 1].substring(res[k + 1].indexOf("=")+1, res[k + 1].indexOf(" ")))){
                    //相等就再判断最后一位，人少的在前
                    if (Integer.parseInt(res[k].substring(res[k].length()-1))
                            > Integer.parseInt(res[k + 1].substring(res[k+1].length()-1))){
                        String temp = res[k+1];
                        res[k+1] = res[k];
                        res[k] = temp;
                    }
                }
            }
        }
        int temp = 1;
        System.out.println(res.length);
        for (int j = 0; j < res.length; j++) {
            //暂存的名次，加权分相等就输出这个
            if (j>=1){
                if (Integer.parseInt(res[j].substring(res[j].indexOf("=")+1, res[j].indexOf(" ")))
                        ==Integer.parseInt(res[j-1].substring(res[j-1].indexOf("=")+1, res[j-1].indexOf(" ")))){
                    System.out.println(j+" "+res[j].replace("="," "));
                }else {
                    System.out.println(j+1+" "+res[j].replace("="," "));
                }
            }else {
                temp +=j;
                System.out.println(temp+" "+res[j].replace("="," "));
            }
        }
    }
}
