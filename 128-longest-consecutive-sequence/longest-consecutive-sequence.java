class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int longg=0;
        for(int num : set){
            if(!set.contains(num-1)){
                int current=num;
                int length=1;
                while(set.contains(current+1)){
                    current++;
                    length++;
                    
                }
                longg=Math.max(length,longg);
            }
            
        }
        return longg;
    }
}