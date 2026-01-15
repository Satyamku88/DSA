class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int high=0;
        int sechigh=0;
        for(int i=0;i<n;i++){
            if(arr[i]>high){
               
                sechigh=high;
                 high=arr[i];
            }
            else if(arr[i]<high && arr[i]>sechigh){
                sechigh=arr[i];
            }
        }
        if(sechigh==0){
            return -1;
        }
        return sechigh;
    }
}