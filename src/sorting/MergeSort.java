package sorting;

import java.util.Arrays;

public class MergeSort {
    //2,3,5,7  1,4,6,8
    private static void merge(int[] arr, int[] left, int[] right) {
        int k = 0, i = 0, j = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }

    //10,4,2,5,7,5,9
    public static void sort(int[] arr, int n) {
        if (n < 2)
            return;
        int m = n / 2;
        int[] left = new int[m];
        int[] right = new int[n - m];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[i + m];
        }
        sort(left, left.length);
        sort(right, right.length);
        merge(arr, left, right);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 1, 2, 6, 4, 7};
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
