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
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        // 遍历链表A，存入 list 中
        ListNode curA = headA;
        List<ListNode> list = new LinkedList<>();
        while (curA != null) {
            list.add(curA);
            curA = curA.next;
        }

        // 遍历链表B，判断是否存在链表A中
        ListNode curB = headB;
        while (curB != null) {
            if (list.contains(curB)) {
                return curB;
            }
            curB = curB.next;
        }
        return null;
    }
}