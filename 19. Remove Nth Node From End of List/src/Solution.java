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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) return null;
        // 虚拟头节点，指向 head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // 快慢指针，起始位置在虚拟头节点
        ListNode fast = dummy;
        ListNode slow = dummy;

        // 让快指针走 n+1 次
        for (int i=0; i<n+1; i++)
            fast = fast.next;

        // 快慢一起走
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // 当快指针走到 null 的时候
        // 慢指针的下一位就是要删除的节点
        slow.next = slow.next.next;
        // 返回头节点
        return dummy.next;
    }
}