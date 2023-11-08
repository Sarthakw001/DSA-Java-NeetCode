/*
 * The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
 * You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
 *  For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.
 * Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
 */

import java.util.HashMap;

public class NextGreaterElement1 {
    public static int solve(int[] nums2, int idx) {
        int nextGreater = nums2[idx];
        for (int i = idx; i < nums2.length; i++) {
            if (nums2[i] > nextGreater) {
                nextGreater = nums2[i];
                break;
            }
        }
        if (nextGreater == nums2[idx])
            return -1;
        return nextGreater;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++)
            mp.put(nums2[i], i);

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = solve(nums2, mp.get(nums1[i]));
        }

        return ans;
    }
}
