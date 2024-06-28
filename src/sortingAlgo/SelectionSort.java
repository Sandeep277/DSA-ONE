package sortingAlgo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 6, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // find the max item and swap with correct index
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIDX = getMax(arr, 0, last);

            // swap
            int temp = arr[maxIDX];
            arr[maxIDX] = arr[last];
            arr[last] = temp;
        }
    }

    public static int getMax(int[] arr, int s, int e){
        int max = s;
        for (int i = 0; i <= e; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
