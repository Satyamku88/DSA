class Solution {
    void pushZerosToEnd(int[] arr) {
        int n=arr.length;
      int m=0;
        for(int i=0;i<n;i++){
           if(arr[i]!=0){
               arr[m]=arr[i];
               m++;
           }
        }
        for(int j=m;j<n;j++){
            arr[j]=0;
        }
        
    }
}
