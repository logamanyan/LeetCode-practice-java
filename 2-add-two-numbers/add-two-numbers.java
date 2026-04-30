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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode();
        ListNode head=l3;
        int c=0;
        while(l1!=null||l2!=null||c!=0)
        {
            int v1= (l1!=null)?l1.val:0;
            int v2=(l2!=null)?l2.val:0;
            int sum= v1+v2+c;
            c=sum/10;
            int d=sum%10;
            l3.next=new ListNode(d);
            l3=l3.next;
            l1= (l1!=null)?l1.next:null;
            l2=(l2!=null)?l2.next:null;
        }
        return head.next;
    }
}