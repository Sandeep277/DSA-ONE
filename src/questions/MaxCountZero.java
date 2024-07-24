package questions;

public class MaxCountZero {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxcount = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            }
            if (nums[i] == 0) {
                maxcount = Math.max(maxcount, count);
                count = 0;
            }
        }
        return Math.max(maxcount, count);
    }
}
