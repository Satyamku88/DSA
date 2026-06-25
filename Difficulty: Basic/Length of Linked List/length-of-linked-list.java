/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) {
        // code here
        int count=1;
        Node temp=head;
        while(temp.next!=null){
            count++;
          temp=temp.next;
          
        }
        return count;
    }
}