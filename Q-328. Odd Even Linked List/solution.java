class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode node_1=new ListNode(0);
        ListNode node_2=new ListNode(0);
        ListNode first=node_1;
        ListNode second=node_2;
 
        int index=1;
        while(head!=null){
            
            if(index%2!=0){
               first.next=head;
               first=first.next;

            }
            else if(index %2==0){
                second.next=head;
                second=second.next;

            }
            index++;
            head=head.next;
        }
        second.next=null;
        first.next=node_2.next;

     return node_1.next;
    }
}