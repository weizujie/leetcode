/**
 * @Author: weizujie
 * @Date: 2020/5/14
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */
public class Solution {

    public int getDecimalValue(ListNode head) {
        StringBuilder builder = new StringBuilder();
        while (head != null) {
            builder.append(head.val);
            head = head.next;
        }
        return Integer.valueOf(builder.toString(), 2);
    }

}
