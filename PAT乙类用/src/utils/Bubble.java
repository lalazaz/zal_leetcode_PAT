package utils;

//需要整理
public class Bubble {
    public static int[] bubble(int[] ints2) {
        for (int i = 0; i < ints2.length - 1; i++) {
            for (int j = 0; j < ints2.length - 1 - i; j++) {
                if (ints2[j] < ints2[j + 1]) {
                    int temp = ints2[j];
                    ints2[j] = ints2[j + 1];
                    ints2[j + 1] = temp;
                }
            }
        }
        return ints2;
    }
}

