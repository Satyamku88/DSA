class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
List<int[]> result = new ArrayList<>();

        if (arr == null || arr.length == 0) {
            return result;
        }

        // Step 1: Sort intervals by starting time
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Initialize the first interval
        int[] current = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Check if intervals overlap
            if (arr[i][0] <= current[1]) {
                // Merge intervals
                current[1] = Math.max(current[1], arr[i][1]);
            } else {
                // Add the non-overlapping interval to result
                result.add(current);
                current = arr[i];
            }
        }

        // Add the last interval
        result.add(current);

        return result;

    }
}
