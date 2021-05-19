class Offer24_reverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;
        ListNode pre = head;
        ListNode now = head.next;
        pre.next = null;
        while (now != null) {
            ListNode next = now.next;
            now.next = pre;
            pre = now;
            now = next;
        }
        return pre;
    }
}