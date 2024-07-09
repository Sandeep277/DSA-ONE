package dynamicprogramming;

import java.util.Arrays;

public class NonAdjacentSum {
    public static void main(String[] args) {
        int[] arr = {29, 4, 5, 12, 7};
        int[] memo = new int[arr.length];
        Arrays.fill(memo, -1);
        System.out.println(sum(arr, 0, memo));
    }

    public static int sum(int[] arr, int i, int[] memo) {
        if (i >= arr.length) {
            return 0;
        }

        if (memo[i] != -1) {
            return memo[i];
        }
        memo[i] = Math.max(arr[i] + sum(arr, i+2, memo), sum(arr, i+1, memo));
        return memo[i];
    }
}
