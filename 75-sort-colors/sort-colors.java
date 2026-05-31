class Solution {
    public void sortColors(int[] nums) {
        int hight=nums.length-1;
        int count=0;
        int low=0;
        while(count<=hight){
            if(nums[count]==0){
                int temp=nums[count];
                nums[count]=nums[low];
                nums[low]=temp;
                low++;
                count++;
            }
            else if(nums[count]==1){
                  count++;
            }
            else {
                  int temp=nums[count];
                nums[count]=nums[hight];
                nums[hight]=temp;
                hight--;
                
            }
        }



    // for(int i=0;i<n-1;i++){
    //     for(int j=i;j<n;j++){
    //         if(nums[i]>nums[j]){
    //             int temp=nums[i];
    //             nums[i]=nums[j];
    //             nums[j]=temp;
    //         }
    //     }
    // }
    }
}