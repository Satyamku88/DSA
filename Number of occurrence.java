class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int count=0;
        int n=target;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                count++;
            }
        }
        return count;
    }
}
