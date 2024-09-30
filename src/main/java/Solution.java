class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode pointer = head;

        while (pointer != null) {
            ListNode next = pointer.next;
            while (next != null && next.val == val) next = next.next;
            pointer.next = next;
            pointer = next;
        }

        return head;
    }
}