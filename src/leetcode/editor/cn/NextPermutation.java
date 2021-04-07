  //实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。 
//
// 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。 
//
// 必须 原地 修改，只允许使用额外常数空间。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：[1,3,2]
// 
//
// 示例 2： 
//
// 
//输入：nums = [3,2,1]
//输出：[1,2,3]
// 
//
// 示例 3： 
//
// 
//输入：nums = [1,1,5]
//输出：[1,5,1]
// 
//
// 示例 4： 
//
// 
//输入：nums = [1]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 100 
// 0 <= nums[i] <= 100 
// 
// Related Topics 数组 
// 👍 928 👎 0

  
package leetcode.editor.cn;
public class NextPermutation{
    public static void main(String[] args) {
        Solution solution = new NextPermutation().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void nextPermutation(int[] nums) {
        int pointer1 = - 1;
        for (int i = nums.length -1; i > 0; i--) {
            if (nums[i] > nums[i-1]) {
                pointer1 = i - 1;
                break;
            }
        }

        if (pointer1 != -1) {
            int pointer2 = -1;
            for (int j = nums.length -1; j > pointer1; j--) {
                if (nums[j] > nums[pointer1]) {
                    pointer2 = j;
                    break;
                }
            }

            if (pointer2 != -1) {
                swap(nums, pointer1, pointer2);
            }

            reverse(nums, pointer1 + 1);
        } else {
            reverse(nums, 0);
        }
    }

    public void swap(int[] nums, int pointer1, int pointer2) {
        int temp = nums[pointer1];
        nums[pointer1] = nums[pointer2];
        nums[pointer2] = temp;
    }

    public void reverse(int[] nums, int pointer1) {
        int start = pointer1;
        int end = nums.length-1;
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}