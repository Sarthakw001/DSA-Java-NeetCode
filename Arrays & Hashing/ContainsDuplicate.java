// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.HashSet;

class ContainsDuplicate {

    /*
     * Brute Force - Using nested for loop and searching linearly for every element
     * T.C - O(n*n), S.C - O(1)
     */

    public static boolean containsDuplicate(int[] num) {
        /*
         * optimized approach using hashset(internally hashmap in java)
         * T.C - O(n) - due to traversing only the length of array
         * S.C - O(n) - due to usage of hashset i.e in worst case
         */
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            if (hs.contains(num[i])) {
                return true;
            } else {
                hs.add(num[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) { // MAIN METHOD
        int[] num = { 1, 2, 3, 4, 5, 6, 2 };
        System.out.println(containsDuplicate(num));
    }
}