/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> mp=new HashSet<>();
        int count=-1;
        ListNode temp=head;
        while(temp!=null){
            if(mp.contains(temp)){
                return temp;
            }
            mp.add(temp);
            temp=temp.next;
            count++;
        }
        return null;
    }
}