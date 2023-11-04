/*
 * You have a long flowerbed in which some of the plots are planted, and 
 * some are not. However, flowers cannot be planted in adjacent plots.
 * Given an integer array flowerbed containing 0's and 1's, where 0 means
 *  empty and 1 means not empty, and an integer n, 
 * return true if n new flowers can be planted in the flowerbed without 
 * violating the no-adjacent-flowers rule and false otherwise.
 */
public class CanPlaceFlower {
    public static boolean canPlaceFlower(int[] nums, int n) {
        /*
         * T.C - O(n)
         * S.C - O(1)
         */
        if (nums.length == 1) {
            if (nums[0] == 0 && (n == 1 || n == 0))
                return true;
            else if (nums[0] == 1 && n == 0)
                return true;
            else
                return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] == 0 && nums[i + 1] == 0) {
                    nums[i] = 1;
                    n--;
                }
            } else if (i == nums.length - 1) {
                if (nums[i] == 0 && nums[i - 1] == 0) {
                    nums[i] = 1;
                    n--;
                }
            } else if (nums[i] != 1 && nums[i - 1] == 0 && nums[i + 1] == 0) {
                nums[i] = 1;
                n--;
            }
        }
        if (n == 0)
            return true;
        return false;
    }
}
