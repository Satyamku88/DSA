public class Valid_Array {
    public static int minmumSwap(int[] arr){
        int n=arr.length;
        int minValue=arr[0],minIndex=0;
        for(int i=0;i<n;i++){
            if(arr[i]<minValue){
                minValue=arr[i];
                minIndex=i;
            }

        }
         int maxValue=arr[0],maxIndex=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=maxValue){
                maxValue=arr[i];
                maxIndex=i;
            }

        }
        int swap=minIndex+(n-1-maxIndex);
        if(minIndex>maxIndex){
            swap-=1;
        }
        return swap;

    }
    
    public static void main(String[] args) {
        int arr[]={3,4,5,5,3,1};
        int ans=minmumSwap(arr);
        System.out.println("The minimum swap required is: "+ans);
    }
}
