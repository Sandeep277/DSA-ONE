package algorithms;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 3, 53};
        System.out.println(maxSum(arr, 2));
    }

    public static int maxSum(int[] arr, int n) {
        int currSum = 0;

        for (int i = 0; i < n; i++) {
            currSum += arr[i];
        }
        int largestSum = currSum;

        for (int i = 1; i <= arr.length-n; i++) {
            currSum = currSum - arr[i - 1] + arr[i + n - 1];
            largestSum = Math.max(currSum, largestSum);
        }

        return largestSum;
    }
}
