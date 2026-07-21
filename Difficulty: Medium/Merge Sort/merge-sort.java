class Solution {
    public void merg(int arr[],int left,int midd,int right){
        int n1=midd-left+1;
        int n2=right-midd;
        int temp1[]=new int[n1];
        int temp2[]=new int[n2];
        for(int i=0;i<n1;i++){
            temp1[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            temp2[j]=arr[midd+1+j];
        }
        int i=0;
        int j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(temp1[i]<temp2[j]){
                arr[k]=temp1[i];
                i++;
            }else{
                arr[k]=temp2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=temp1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=temp2[j];
            j++;
            k++;
        }
    }
    public void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merg(arr,l,mid,r);
    }
}