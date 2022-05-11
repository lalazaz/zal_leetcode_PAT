package demo;
//@Date 2022/4/12 19:34
//8. 字符串转换整数 (atoi)
public class Demo08 {
    public static void main(String[] args) {
        System.out.println(myAtoi("++-1"));
        System.out.println(myAtoi("00000-42a1234"));
        System.out.println(myAtoi(" -42a1234"));
        System.out.println(myAtoi("   +11191657170"));
        System.out.println(myAtoi("   -34949013849030108148132948930"));
    }
    public static int  myAtoi(String s) {
        char[] chars = s.trim().toCharArray();
        if (chars.length==0)return 0;
        StringBuilder sb = new StringBuilder("");
        int i = 0,flag = 0;
        while (chars[i]==48&&i<chars.length-1) i++;
        if (!(chars[i]>48&&chars[i]<=57)&&i!=0) return 0;
        if ((chars[i]+"").equals("-")||(chars[i]+"").equals("+")) {
            sb.append(chars[i]);
            flag =1;//减号的是45所以flag就是1,后面我们换掉加号的
        }

        for (int j = i+flag; j < s.trim().length(); j++) {
            if (chars[j]>=48&&chars[j]<=57){
                sb.append(chars[j]);
            }else break;
        }
        if (sb.toString().equals("")||sb.toString().equals("+")||sb.toString().equals("-")) return 0;
        int res = 0;
        if ((chars[i]+"").equals("+")){
            flag=0;
        }
        try {
            res = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            res = flag==1?-2147483648:2147483647;
        }
        return res;
    }
}
