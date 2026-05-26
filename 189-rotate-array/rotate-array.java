class Solution {
    public void rot(int[] nums,int n,int m){
         while(n<m){
            int temp=nums[n];
            nums[n]=nums[m];
            nums[m]=temp;
            n++;
            m--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rot(nums,0,nums.length-1);
        rot(nums,0,k-1);
        rot(nums,k,nums.length-1);
    }
}