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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        int n=1;
        ListNode last = head;
        while(last.next!=null){
            n++;
            last = last.next;
        }

        k = k%n;
        if(k==0) return head;

        int c = n-k;
        ListNode temp = head;
        int count=1;
        while(temp!=null){
            if(count==c) break;
            count++;
            temp = temp.next;
        }

        last.next = head;
        ListNode res = temp.next;
        temp.next = null;

        return res;
    }
}