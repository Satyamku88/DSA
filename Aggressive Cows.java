import java.util.Arrays;

class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int low = 1; // minimum possible distance
        int high = stalls[stalls.length - 1] - stalls[0]; // maximum possible distance
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlaceCows(stalls, k, mid)) {
                result = mid;
                low = mid + 1; // try for a larger minimum distance
            } else {
                high = mid - 1; // try for a smaller distance
            }
        }

        return result;
    }

    private static boolean canPlaceCows(int[] stalls, int k, int minDist) {
        int cowsPlaced = 1; // first cow at the first stall
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= minDist) {
                cowsPlaced++;
                lastPos = stalls[i];
            }

            if (cowsPlaced == k) return true;
        }

        return false;
    }
}
