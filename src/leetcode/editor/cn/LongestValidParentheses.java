  //给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。 
//
// 
//
// 
// 
// 示例 1： 
//
// 
//输入：s = "(()"
//输出：2
//解释：最长有效括号子串是 "()"
// 
//
// 示例 2： 
//
// 
//输入：s = ")()())"
//输出：4
//解释：最长有效括号子串是 "()()"
// 
//
// 示例 3： 
//
// 
//输入：s = ""
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 3 * 104 
// s[i] 为 '(' 或 ')' 
// 
// 
// 
// Related Topics 字符串 动态规划 
// 👍 1166 👎 0

  
package leetcode.editor.cn;
public class LongestValidParentheses{
    public static void main(String[] args) {
        Solution solution = new LongestValidParentheses().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestValidParentheses(String s) {
        int[] dp = new int[s.length() + 1];
        for (int i = 1; i < s.length(); i++) {
            char si = s.charAt(i);

            if (si == ')') {

                char s2 = s.charAt(i-1);
                if (s2 == '(') {
                    dp[]
                }
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}