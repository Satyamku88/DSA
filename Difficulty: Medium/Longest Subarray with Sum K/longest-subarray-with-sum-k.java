// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
       int prefixsum=0;
       int maxlenth=0;
    map.put(0,-1);
       for(int i=0;i<arr.length;i++){
        prefixsum+=arr[i];
       
        if(map.containsKey(prefixsum-k)){
            int len=i-map.get(prefixsum-k);
            maxlenth=Math.max(maxlenth,len);
        }
         map.putIfAbsent(prefixsum,i);
       }
       return maxlenth;
    }
}
