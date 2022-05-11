package demo;
//383. 赎金信
/**
 * @author zal
 * @date 2022/4/16 22:47
 */
public class Demo383 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aaa", "abaa"));
        System.out.println(canConstruct("aa", "aa"));
        System.out.println(canConstruct("aaaa", "aa"));
        System.out.println(canConstruct("aafs", "faas"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] chars = ransomNote.toCharArray();
        int i = 0;
        for (; i < chars.length; i++) {
            if (magazine.contains(chars[i]+"")){
                magazine = magazine.replaceFirst(chars[i]+"","");
            }else break;
        }
        return i == chars.length;
    }
}
