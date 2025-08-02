class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;
        while(curr!=null){
            Boolean isDup=false;
            while(curr.next!=null&& curr.val==curr.next.val){
                curr=curr.next;
                isDup=true;
            }
            if(isDup==true){
                prev.next=curr.next;
            }
            else if(isDup==false){
                prev=prev.next;
            }
            curr=curr.next;
        }
return dummy.next;
    }
}