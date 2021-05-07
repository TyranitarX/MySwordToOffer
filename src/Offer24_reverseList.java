class Offer24_reverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode pre = head;
        ListNode now = head.next;
        ListNode next;
        pre.next = null;
        while (true) {
            next = now.next;
            now.next = pre;
            pre = now;
            now = next;
            if (now == null)
                break;
            next = now.next;
        }
        return pre;
    }
}