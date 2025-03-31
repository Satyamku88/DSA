class Solution {
    void nextPermutation(int[] arr) {
        // Step 1: Find the first pair from right where arr[i] < arr[i+1]
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        
        // If no such pair found, reverse the entire array
        if (i < 0) {
            reverse(arr, 0, arr.length - 1);
            return;
        }
        
        // Step 2: Find the number just larger than arr[i]
        int j = arr.length - 1;
        while (j >= 0 && arr[j] <= arr[i]) {
            j--;
        }
        
        // Step 3: Swap the two numbers
        swap(arr, i, j);
        
        // Step 4: Reverse the subarray after index i
        reverse(arr, i + 1, arr.length - 1);
    }
    
    // Helper method to swap two elements in array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    // Helper method to reverse a portion of array
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }
}
