class Solution {

    public int circularSubarraySum(int arr[]) {
        int n = arr.length;

        // Step 1: Kadane’s algorithm to find max subarray sum (non-circular)
        int maxNormal = kadane(arr);

        // If all numbers are negative, return maxNormal
        if (maxNormal < 0)
            return maxNormal;

        // Step 2: Calculate total array sum
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            // Invert elements to find min subarray sum using Kadane
            arr[i] = -arr[i];
        }

        // Step 3: Apply Kadane to inverted array to find min subarray sum
        int maxInverted = kadane(arr);

        // Step 4: circular sum = totalSum - minSubarraySum
        int maxCircular = totalSum + maxInverted;

        // Step 5: Return the maximum of both cases
        return Math.max(maxNormal, maxCircular);
    }

    // Standard Kadane's Algorithm
    private int kadane(int[] arr) {
        int maxEndingHere = arr[0], maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
