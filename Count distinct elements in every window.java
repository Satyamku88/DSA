class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
         ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count frequency of elements in the first window
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        result.add(map.size()); // Add distinct count of first window

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            // Remove the first element of the previous window
            int elementToRemove = arr[i - k];
            map.put(elementToRemove, map.get(elementToRemove) - 1);
            if (map.get(elementToRemove) == 0) {
                map.remove(elementToRemove);
            }

            // Add the new element
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            // Add the count of distinct elements in the current window
            result.add(map.size());
        }

        return result;
    }
}
