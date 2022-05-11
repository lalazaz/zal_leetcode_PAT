package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Date 2022/4/13 21:16
//49. 字母异位词分组
public class Demo49 {
    public static void main(String[] args) {
        //ArrayList<char[]> characters = new ArrayList<>();
        /*for (int i = 0; i < strings.length; i++) {
            char[] chars = strings[i].toCharArray();
            Arrays.sort(chars);
            characters.add(chars);
        }

        System.out.println(Arrays.toString(characters.get(0)));
        System.out.println(Arrays.toString(characters.get(1)));
*/
        //System.out.println(Arrays.toString(Arrays.stream(strings).sorted().toArray()));

        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(strings);
        System.out.println(lists);
    }


    /**
     * 真的捞的方法，写半天思路逐渐崩塌，然后还没写出来！
     * @param strs
     * @return
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<char[]> characters = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            characters.add(chars);
        }
        List<List<String>> res = new ArrayList<>();
        //

        ArrayList<String> temp_list = new ArrayList<>();
        for (int i = 0; i < characters.size(); ) {
            String temp = Arrays.toString(characters.get(i));
            //temp_list.add(temp);
            for (int j = i; j < characters.size(); j++) {
                if (temp.equals(Arrays.toString(characters.get(j)))) {
                    temp_list.add(temp);
                    characters.remove(j);
                    j--;
                }
            }
            res.add(temp_list);
            temp_list = new ArrayList<>();
        }

        return res;
    }
}
