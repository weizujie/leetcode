/**
 * @Author: weizujie
 * @Date: 2020/5/16
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int kthToLast(ListNode head, int k) {

        // 第一次遍历，得到链表长度
        int length = 0;
        ListNode currentNode = head;
        while (currentNode.next != null) {
            length++;
            currentNode = currentNode.next;
        }

        // 第二次遍历，得到倒数第k个节点
        currentNode = head;
        for (int i = 0; i < length - k + 1; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.val;


    }
}