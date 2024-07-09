package dynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class DP {
    public static void main(String[] args) {
        int n = 96;
//        int[] arr = new int[n+1];
//        System.out.println(fibo(n, arr));
//        System.out.println(tribo(n, new HashMap<>()));

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
//        System.out.println(sum(101, list, new HashMap<>()));

        List<Integer> coins = Arrays.asList(1, 2, 5);
        int amount = 11;
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, -2); // Fill with a value that can't be a valid result (-2 indicates not computed)
        int result = coinRequire(amount, coins, memo);
        System.out.println("Minimum coins required: " + result);
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

    // Tribonacci
    public static int tribo(int n, HashMap<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = tribo(n-1, memo) + tribo(n-2, memo) + tribo(n-3, memo);
        memo.put(n, result);
        return result;
    }

    // sum possible
    public static boolean sum(int ammount, List<Integer> list, HashMap<Integer, Boolean> memo) {
        if (ammount == 0) {
            return true;
        }

        if (ammount < 0) {
            return false;
        }

        if (memo.containsKey(ammount)) {
            return memo.get(ammount);
        }

        for (int i = 0; i < list.size(); i++) {
            int currSum = ammount - list.get(i);
            if (sum(currSum, list, memo)) {
                memo.put(ammount, true);
                return true;
            }
        }
        memo.put(ammount, false);
        return false;
    }

    // Minimum coins required
    public static int coinRequire(int amount, List<Integer> coins, int[] memo) {
        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return -1;
        }

        if (memo[amount] != -2) {
            return memo[amount];
        }

        int minCoin = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subAmount = amount - coin;
            int subCoins = coinRequire(subAmount, coins, memo);
            if (subCoins != -1) {
                int numCoin = subCoins + 1;
                if (numCoin < minCoin) {
                    minCoin = numCoin;
                }
            }
        }

        memo[amount] = (minCoin == Integer.MAX_VALUE) ? -1 : minCoin;
        return memo[amount];
    }
}
