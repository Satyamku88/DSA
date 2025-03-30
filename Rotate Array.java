class Solution {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        // Handle edge cases
        if (n == 0 || d == 0) {
            return;
        }
        // Normalize d
        d = d % n;
        if (d == 0) {
            return;
        }
        
        // Temporary array to store first d elements
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        
        // Shift remaining elements left by d positions
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        
        // Place the first d elements at the end
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }
}
