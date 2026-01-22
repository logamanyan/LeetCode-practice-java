class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        ListNode temp = head;
        int l = 1;

        // Find length
        while (temp.next != null) {
            temp = temp.next;
            l++;
        }

        k = k % l;
        if (k == 0)
            return head;   // ✅ no cycle created

        // Make circular
        temp.next = head;

        // Find new tail
        for (int i = 0; i < l - k; i++) {
            temp = temp.next;
        }

        // Break cycle
        head = temp.next;
        temp.next = null;

        return head;
    }
}
