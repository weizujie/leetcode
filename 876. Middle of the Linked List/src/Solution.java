/**
 * @Author: weizujie
 * @Date: 2020/5/16
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        // 快慢指针
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            // 慢指针走一次，快指针走两次
            // 当快指针走到最后的时候，慢指针一定处在中间
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
}
