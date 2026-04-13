class Solution {
    public static int largest(int[] arr) {
        // code here
        int n=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>n){
                n=arr[i];
            }
        }
        return n;
       
    }
}
