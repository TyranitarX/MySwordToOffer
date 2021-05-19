/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/5/19 9:03
 **/
public class Offer22_getKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode pre = head;
        ListNode last = head;
        while (k > 0) {
            k--;
            last = last.next;
        }
        while (last != null) {
            pre = pre.next;
            last = last.next;
        }
        return pre;
    }
}
