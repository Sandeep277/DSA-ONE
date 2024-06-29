package recursion;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        printHelloNTimes(n);
        System.out.println("Sum: " + sum(n));
        System.out.println("Factorial: " + factorial(n));
        System.out.println("Count of zeros: " + countZeros(202020));
        System.out.println("Digit product: " + digitProduct(123));
        System.out.println("Digit sum: " + digitSum(123));
    }

    /*

    Definition of Recursion:
    Recursion is a method in which a function calls itself to solve a problem. Each recursive call aims to reduce the problem into smaller sub-problems until it reaches a base case, which stops further recursive calls.

    When to Use Recursion:

    Divide and Conquer: When a problem can be divided into similar sub-problems (e.g., merge sort, quicksort).
    Tree Traversals: When traversing structures like trees (e.g., binary tree traversals: pre-order, in-order, post-order).
    Mathematical Problems: When solving problems like factorial calculation, Fibonacci sequence, and combinatorial problems.
    Dynamic Programming: When solving problems that can be broken down into overlapping sub-problems (e.g., memoization and tabulation techniques).
    Example Problems for Recursion:

    Finding the Greatest Common Divisor (GCD): Using the Euclidean algorithm.
    Generating Permutations: Finding all possible permutations of a given string or list.
    Solving the Tower of Hanoi: A classic problem involving moving disks between pegs according to specific rules.

    */

    // How to identify and approach the problem
    /*
        1. When you can divide the problem into smaller sub-problems.
        2. Write the recurrence relation if needed.
        3. Draw the recursion tree to visualize the function calls and their stack behavior.
        4. Examine the left and right subtrees in the recursion tree.
        5. Trace the values and return types at each step.
        6. Ensure the function returns the correct result if it has a return type.

        Focus on: function arguments, return type, variables inside the function, and variables within the function body.
     */

    // Example 1: Print "Hello" n times
    public static void printHelloNTimes(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Hello");
        printHelloNTimes(n - 1);
    }

    // Example 2: Sum of first n natural numbers
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    // Example 3: Factorial of a number
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Example 4: Count zeros in a number
    public static int countZeros(int num) {
        return countZerosHelper(num, 0);
    }

    private static int countZerosHelper(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 10 == 0) {
            count++;
        }
        return countZerosHelper(num / 10, count);
    }

    // Example 5: Product of digits of a number
    public static int digitProduct(int n) {
        if (n == 0) {
            return 1;
        }
        return (n % 10) * digitProduct(n / 10);
    }

    // Example 6: Sum of digits of a number
    public static int digitSum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + digitSum(n / 10);
    }
}
