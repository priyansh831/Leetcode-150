class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode before= new ListNode(0);// creating an nodes to divide the list 
        ListNode after =new ListNode(0);
        ListNode slow=before;
        ListNode fast=after;

        while(head!=null){
            if(head.val<x){
                slow.next=head;
                slow=slow.next;
            }
            else{
                fast.next=head;
                fast=fast.next;
            }
            head=head.next;
        }
        fast.next=null;
        slow.next=after.next;

        return before.next;
    }
}