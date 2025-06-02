// User function Template for Java

class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
          int i = 0, j = 0, count = 0;
        int result = 0;
        
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result = a[i];
                i++;
            } else {
                result = b[j];
                j++;
            }
            count++;
            if (count == k) return result;
        }
        
        // If one array is exhausted
        while (i < a.length) {
            result = a[i];
            i++;
            count++;
            if (count == k) return result;
        }
        
        while (j < b.length) {
            result = b[j];
            j++;
            count++;
            if (count == k) return result;
        }
        
        return -1; 
    }
}
