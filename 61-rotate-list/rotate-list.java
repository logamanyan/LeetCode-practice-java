class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        ListNode temp = head;
        int l = 1;

     
        while (temp.next != null) {
            temp = temp.next;
            l++;
        }

        k = k % l;
        if (k == 0)
            return head;  

       
        temp.next = head;

       
        for (int i = 0; i < l - k; i++) {
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;

        return head;
    }
}
