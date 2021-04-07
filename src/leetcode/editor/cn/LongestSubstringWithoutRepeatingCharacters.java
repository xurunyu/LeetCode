  //给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 示例 4: 
//
// 
//输入: s = ""
//输出: 0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 104 
// s 由英文字母、数字、符号和空格组成 
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window 
// 👍 5256 👎 0

  
  package leetcode.editor.cn;

  import java.util.HashMap;
  import java.util.Map;

  public class LongestSubstringWithoutRepeatingCharacters{
      public static void main(String[] args) {
           Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
           System.out.println(solution.lengthOfLongestSubstring("abba"));
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> alphMap = new HashMap<>();
        int  result = 0;
        int left = 0, right = 0;
        while (right < s.length()) {
            if (alphMap.containsKey(s.charAt(right))) {
                left =  Math.max(left, alphMap.get(s.charAt(right)) + 1);
            }
            alphMap.put(s.charAt(right), right);
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }