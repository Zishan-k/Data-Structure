package sorting;


import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;
        int index = partition(arr, start, end);
        quickSort(arr, start, index - 1);
        quickSort(arr, index + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end], partitionIndex = start;
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                swap(arr, j, partitionIndex);
                partitionIndex++;
            }
        }
        swap(arr, partitionIndex, end);
        return partitionIndex;
    }

    private static void swap(int[] arr, int j, int pivIndex) {
        int temp = arr[j];
        arr[j] = arr[pivIndex];
        arr[pivIndex] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
