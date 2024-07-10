package algorithms;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 3, 5};
        System.out.println(maxSumSubArray(arr, 2));
        System.out.println(smallestSubArray(7, arr));
    }

    public static int maxSumSubArray(int[] arr, int n) {
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

    public static int smallestSubArray(int targetSum, int[] arr) {
        int minWindowSize = Integer.MAX_VALUE;
        int currentWindowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            currentWindowSum += arr[windowEnd];

            while(currentWindowSum >= targetSum) {
                minWindowSize = Math.min(minWindowSize, windowEnd - windowStart + 1);
                currentWindowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return minWindowSize;
    }
}
