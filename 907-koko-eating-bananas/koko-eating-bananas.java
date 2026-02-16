class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++){
            if(max<piles[i]){
                max=piles[i];
            }
        }
        int high=max,low=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            long ans=chcek(piles,mid);
            if(ans<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    private long chcek(int[] piles,int hour){
        long sum=0;
        for(int i=0;i<piles.length;i++){
            sum+=(int)Math.ceil((double)piles[i]/(double)hour);
        }
        return sum;
    }
}
