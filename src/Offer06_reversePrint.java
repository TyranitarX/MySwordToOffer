/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/5/8 8:51
 **/
public class Offer06_reversePrint {
    public int[] reversePrint(ListNode head) {
        int len = 0;
        ListNode root = head;
        while (root != null) {
            len++;
            root = root.next;
        }
        int[] res = new int[len];
        while (head != null) {
            res[len - 1] = head.val;
            head = head.next;
            len--;
        }
        return res;
    }
}
