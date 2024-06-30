package recursion.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3, 2, 1};
        sort(arr, 0, arr.length-1);

//        for(int ele : arr) {
//            System.out.println(ele);
//        }
        System.out.println(Arrays.toString(arr));
    }

    /*
    In quick sort we first choose the pivot element ( you can choose any element as a pivot
    we choose middle element as pivot )
    step.1: choose the pivot element
    step.2: move all the element pivot < element to the right and pivot > element to the left
    step.3: call the recursion for the other two half next
    Time complexity: best case O(NlogN), worst case O(N^2)
     */

    public static void sort(int[] arr, int low, int hi) {
        if(low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // now pivot is at the correct position, sort the two halves now
        sort(arr, low, e);
        sort(arr, s, hi);
    }

    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
