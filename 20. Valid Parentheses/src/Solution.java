import java.util.Stack;

/**
 * @Author: weizujie
 * @Date: 2020/5/12
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */
public class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (Character c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
