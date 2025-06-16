class Solution {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true; // Found the pair
            }
            seen.add(num);
        }
        
        return false; // No such pair found
    }
