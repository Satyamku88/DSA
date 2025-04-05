class Solution {
    int maxSubarraySum(int[] arr) {
        int maxx = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
       
            maxx = Math.max(maxx, currentMax);
        }

        return maxx;
    }
}
