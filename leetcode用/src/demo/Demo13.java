package demo;

/**
 * @Date 2022/4/2 8:42
 * 13. 罗马数字转整数
 * 执行结果：
 * 通过
 * 执行用时：2 ms, 在所有 Java 提交中击败了100.00% 的用户
 * 内存消耗：41.6 MB, 在所有 Java 提交中击败了35.07% 的用户
 * 通过测试用例：3999 / 3999
 **/
public class Demo13 {
    public static void main(String[] args) {
/*        String test = "MCMXCIV";
        String x = "M";
        System.out.println(test.indexOf(x));*/
        String s = "LVIII";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        //String[] strings = {"I", "V", "X", "L", "C", "D", "M"};
        String strings = "IVXLCDM";
        int[] ints = {1, 5, 10, 50, 100, 500, 1000};
        char[] chars = s.toCharArray();
        int i = 0;
        int x = 0;
        int y = 0;
        for (; i < chars.length - 1; i++) {
            x = strings.indexOf(chars[i]);
            y = strings.indexOf(chars[i + 1]);
            //如果是两个有关系的两个一起算，且下标移动两个
            if (ints[x] < ints[y]) {
                sum += ints[y] - ints[x];
                i++;
            } else {
                //两个没有关系的，只算一个
                sum += ints[x];
            }
        }
        if (i == chars.length-1){
            sum += ints[strings.indexOf(chars[i])];
        }
        return sum;
    }
}
