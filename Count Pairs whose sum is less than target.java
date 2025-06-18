class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
         Arrays.sort(arr); // Step 1: Sort the array
        int count = 0;
        int left = 0, right = arr.length - 1;

        // Step 2: Use two pointers
        while (left < right) {
            if (arr[left] + arr[right] < target) {
                count += (right - left); // all elements between left and right are valid pairs
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}
