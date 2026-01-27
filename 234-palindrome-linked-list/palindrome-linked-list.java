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
    public ListNode rev(ListNode head)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
return head;
    }
    public boolean isPalindrome(ListNode head)
    {
        ListNode slow =head;
        ListNode fast= head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            slow =slow.next;
            fast=fast.next.next;
        }
        ListNode newhead=rev(slow.next);
        ListNode first = head;
        ListNode second =newhead;
        while(second!=null)
        {
            if(first.val!=second.val)
            {
                rev(newhead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
       
        
    }


       

    
}