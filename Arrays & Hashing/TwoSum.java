/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */


import java.util.HashMap;

public class TwoSum {
    /*
     * T.C - O(n * n)
     * S.C - O(1)
     */
    public int[] twoSum1(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    /*
     * T.C - O(N)
     * S.C - O(N)
     */
    public int[] twoSum2(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(target - nums[i]) && i != mp.get(target - nums[i])) {
                ans[0] = i;
                ans[i] = mp.get(target - nums[i]);
            } else {
                mp.put(nums[i], i);
            }
        }
        return ans;
    }
}
