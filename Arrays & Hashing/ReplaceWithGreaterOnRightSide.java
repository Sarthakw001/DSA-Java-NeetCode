/*
 * Given an array arr, replace every element in that array with the greatest element among the 
 * elements to its right, and replace the last element with -1.
 * After doing so, return the array.
 */


class ReplaceWithGreaterOnRightSide {
    public int[] replaceElements(int[] arr) {
        // O(N)
        int mx = arr[arr.length-1];
        arr[arr.length-1] = -1;
        for(int i=arr.length-2;i>=0;i--){
            int temp = arr[i];
            arr[i] = mx;
            if(temp > mx)
                mx = temp; 
        }
        return arr;
    }
}