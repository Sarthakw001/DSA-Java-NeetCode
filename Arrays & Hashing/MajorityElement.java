/*
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. 
 * You may assume that the majority element always exists in the array.
 */
public class MajorityElement {
    public static int majorityElement(int[] arr) {
        /*
         * T.C - O(n)
         * S.C - O(1)
         */
        int majorityEle = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0)
                majorityEle = arr[i];
            count += majorityEle == arr[i] ? 1 : -1;
        }
        return majorityEle;
    }
}
