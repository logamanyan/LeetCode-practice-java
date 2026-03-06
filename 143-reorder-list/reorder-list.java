
class Solution {
    public void reorderList(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode temp=slow.next;
     
        ListNode curr=temp,prev=null,next=null;
        slow.next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        } 

       ListNode head1=head;
        ListNode head2=prev;
        while(head1!=null&&head2!=null)
        
        {
    ListNode next1=head1.next;
    ListNode next2=head2.next;
        head1.next=head2;
        head2.next=next1;
        head1=next1;
        head2=next2;

        }
     

       

    }
}