/**
 * @Author: weizujie
 * @Date: 2020/4/28
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */
class Solution {
    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i=0; i<guess.length; i++) {
            if (guess[i] == answer[i]) {
                count++;
            }
        }
        return count;
    }
}
