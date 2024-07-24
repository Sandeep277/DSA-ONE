package recursion.backtraking;
import java.util.List;
import java.util.ArrayList;

public class Permutation {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutations = permute(nums);
        for (List<Integer> perm : permutations) {
            System.out.println(perm);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);
        return result;
    }

    private static void backtrack(int[] nums, int start, List<List<Integer>> result) {
        if (start == nums.length) {
            // Add the current permutation to the result
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : nums) {
                currentPermutation.add(num);
            }
            result.add(currentPermutation);
        } else {
            for (int i = start; i < nums.length; i++) {
                // Swap the current element with the start element
                swap(nums, start, i);
                // Recur to permute the remaining elements
                backtrack(nums, start + 1, result);
                // Backtrack: undo the swap
                swap(nums, start, i);
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
