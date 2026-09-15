/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> ar=new ArrayList<>();
        ListNode temp=head;
    
        while(temp!=null){
            ar.add(temp.val);
            temp=temp.next;
        }
       int right=0;
       int left=ar.size()-1;
       while(right<left){
        if(ar.get(right)!=ar.get(left)){
            return false;
        }
        right++;
        left--;
       }
       return true;
    }
}