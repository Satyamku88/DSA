class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
         int n = arr.length;
        
        // Step 1: Place each element at its correct position if possible
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                // Swap arr[i] with arr[arr[i] - 1]
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }

        // Step 2: Find the first missing positive number
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // If all positions are correct, smallest missing is n + 1
        return n + 1;
    }
}
