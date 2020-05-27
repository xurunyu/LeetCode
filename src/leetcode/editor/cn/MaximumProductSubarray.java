  //给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。 
//
// 
//
// 示例 1: 
//
// 输入: [2,3,-2,4]
//输出: 6
//解释: 子数组 [2,3] 有最大乘积 6。
// 
//
// 示例 2: 
//
// 输入: [-2,0,-1]
//输出: 0
//解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。 
// Related Topics 数组 动态规划

  
  package leetcode.editor.cn;
  public class MaximumProductSubarray{
      public static void main(String[] args) {
           Solution solution = new MaximumProductSubarray().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProduct(int[] nums) {
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        dp1[0] = nums[0];
        dp2[0] = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp1[i] = Math.max(nums[i], Math.max(dp1[i-1]*nums[i], dp2[i-1]*nums[i]));
            dp2[i] = Math.min(nums[i], Math.min(dp2[i-1]*nums[i], dp1[i-1]*nums[i]));
            result = Math.max(result, dp1[i]);
        }
        return result;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }