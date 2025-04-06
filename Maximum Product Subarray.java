class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
         int n = arr.length;
        if (n == 0) {
            return 0;
        }

        int maxSoFar = arr[0];
        int minSoFar = arr[0];
        int result = maxSoFar;

        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int tempMax = Math.max(current, Math.max(maxSoFar * current, minSoFar * current));
            minSoFar = Math.min(current, Math.min(maxSoFar * current, minSoFar * current));

            maxSoFar = tempMax;

            result = Math.max(result, maxSoFar);
        }

        return result;
    }
}
