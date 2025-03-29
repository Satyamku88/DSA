class Solution {
    public int getSecondLargest(int[] arr) {
        int largest=-1;
        int secondlargest=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            
            if(largest<arr[i]){
                secondlargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }
}
