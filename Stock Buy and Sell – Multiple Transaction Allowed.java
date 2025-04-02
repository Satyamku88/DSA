// User function Template for Java
class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int ans=0;
        int n=.length;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                ans=ans+(prices[i]-prices[i-1]);
            }
        }
        return ans;
    }
}
