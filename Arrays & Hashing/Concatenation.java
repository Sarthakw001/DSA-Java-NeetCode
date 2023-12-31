/*
 * Given an integer array nums of length n, you want to create an array ans of length 2n 
 * where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * Specifically, ans is the concatenation of two nums arrays.
 */

public class Concatenation {
    public static int[] concatArray(int[] nums) {
        /*
         * T.C - O(n)
         */
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++)
            ans[i] = ans[i + nums.length] = nums[i];
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int[] ans = concatArray(nums);
        for (int i : ans)
            System.out.print(i + " ");
    }
}
