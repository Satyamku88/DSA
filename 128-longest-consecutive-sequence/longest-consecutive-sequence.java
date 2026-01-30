class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);
       int n = nums.length;
       int lastsmall=Integer.MIN_VALUE;
        long max = 0;
        int count=0;
        for (int i = 0; i < n; i++) {
            if(nums[i]-1==lastsmall){
                count+=1;
                lastsmall=nums[i];
            }
            else if(nums[i]!=lastsmall){
                count=1;
                lastsmall=nums[i];
            }
            max = Math.max(max, count);
        }

        return (int)max;
    }
}