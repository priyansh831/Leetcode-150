class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null|| left==right){//edge casee
            return head;
        }
        ListNode newnode= new ListNode(0);
        newnode.next=head;
        ListNode prev=newnode;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next;
        ListNode temp=null;
        for(int i=0;i<right-left;i++){
            temp=curr.next;
            curr.next=temp.next;
           temp.next=prev.next;
            prev.next=temp;
        }
       return newnode.next;
    }
}