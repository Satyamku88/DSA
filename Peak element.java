class Solution {

    public int peakElement(int[] arr) {
        // code here
          int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            boolean left = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean right = (mid == n - 1) || (arr[mid] > arr[mid + 1]);

            if (left && right) {
                return mid; // Found peak
            } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1; // Move left
            } else {
                low = mid + 1; // Move right
            }
        }

        return -1; // Should never reach here
    }
}
