import java.util.HashMap;
class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer, Integer> hs=new HashMap<>();
        int sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                max=i+1;
            }
            if(hs.containsKey(sum)){
                int len=i-hs.get(sum);
                max=Math.max(len,max);
            }else{
                hs.put(sum,i);
            }
        }
        return max;
    }
}