package demo;
//@Date 2022/4/11 17:58
//58. 最后一个单词的长度
public class Demo58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("fdjaslk fdalfda  f      fjdklajfadkjakfj    "));
    }
    public static int lengthOfLastWord(String s) {
        String[] split = s.trim().split("\\s+");
        return split[split.length-1].length();
    }
}
