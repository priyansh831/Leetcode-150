class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);//Creating an new node name(dummy)
        dummy.next=head;
        ListNode slow=dummy;//using two pointers to get the node previous to deleting node
        ListNode fast=dummy;
        for(int i=0;i<n;i++){
            fast=fast.next;

        }
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}