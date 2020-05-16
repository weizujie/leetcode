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
    public ListNode deleteNode(ListNode head, int val) {
        ListNode node = head;
        // 删除头节点时，head 指向原来头节点的下一个节点
        if (node.val == val) {
            return head.next;
        }
        // 删除非头节点
        // 遍历，如果 val 不等于节点中的值时一直找
        while (node.next.val != val) {
            node = node.next;
        }

        // 删除节点
        node.next = node.next.next;
        return head;
    }
}
