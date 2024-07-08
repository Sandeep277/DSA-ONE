package dynamicprogramming;

public class DP {
    public static void main(String[] args) {
        int n = 60;
        int[] arr = new int[n+1];
        System.out.println(fibo(n, arr));
    }

    // Fibonacci using memoization
    public static int fibo(int n, int[] arr) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        if (arr[n] != 0) {
            return arr[n];
        }

        arr[n] = fibo(n-1, arr) + fibo(n-2, arr);
        return arr[n];
    }
}
