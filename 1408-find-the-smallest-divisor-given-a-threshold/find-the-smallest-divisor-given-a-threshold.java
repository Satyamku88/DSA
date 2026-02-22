class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
         int low = 1;
        int high = 0;

        // Find max element
        for (int num : nums) {
            high = Math.max(high, num);
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(nums, mid, threshold)) {
                high = mid - 1;   // try smaller divisor
            } else {
                low = mid + 1;    // need bigger divisor
            }
        }

        return low;
    }

    private boolean isPossible(int[] nums, int divisor, int threshold) {

        long sum = 0;

        for (int num : nums) {
            sum += (num + divisor - 1) / divisor;   // ceil division
            
            if (sum > threshold) return false; // early stop
        }

        return sum <= threshold;
    }
}