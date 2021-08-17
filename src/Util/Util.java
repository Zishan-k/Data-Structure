package Util;

import java.util.ArrayList;

public class Util {
    public static int max(int[] arr) {
        int maxVal = Integer.MIN_VALUE;
        for (int i : arr) if (maxVal < i) maxVal = i;
        return maxVal;
    }

    public static String swap(String str, int i, int j){
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }

    public static int sum(ArrayList<Integer> al){
        int sum = 0;
        for (int temp :
                al) {
            sum += temp;
        }
        return sum;
    }
}
