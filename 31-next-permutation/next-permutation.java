class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length-1;
        for(int i=n-1;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            int right=nums.length-1;
            int left=0;
              while (left < right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
        
    }return;
        }else{
            for(int i=n;i>=index;i--){
                if(nums[i]>nums[index]){
                    int temp=nums[i];
                    nums[i]=nums[index];
                    nums[index]=temp;
                    break;
                }
            }
        }
         int right=nums.length-1;
            int left=index+1;
              while (left < right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
              }
    }
}