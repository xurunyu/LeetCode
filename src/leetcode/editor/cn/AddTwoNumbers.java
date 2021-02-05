  //给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学

  
  package leetcode.editor.cn;

  import leetcode.editor.cn.structure.ListNode;

  public class AddTwoNumbers{
      public static void main(String[] args) {
           Solution solution = new AddTwoNumbers().new Solution();
          /**
           * [2,4,3]
           * [5,6,4]
           */
          ListNode n1 = new ListNode(2);
          ListNode n2 = new ListNode(4);
          ListNode n3 = new ListNode(3);
          ListNode n4 = new ListNode(5);
          ListNode n5 = new ListNode(6);
          ListNode n6 = new ListNode(4);
          n1.next = n2;
          n2.next = n3;
          n3.next = null;
          n4.next = n5;
          n5.next = n6;
          n6.next = null;
          solution.addTwoNumbers(n1,n4);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int addOne = 0;
        ListNode dummy = new ListNode(0);
        ListNode point = dummy;
        while (l1 != null || l2 != null) {
            int num1, num2;
            if (l1 != null) {
                num1 = l1.val;
            } else {
                num1 = 0;
            }
            if (l2 != null) {
                num2 = l2.val;
            } else {
                num2 = 0;
            }

            int temp = num1 + num2 + addOne;
            addOne = temp / 10;
            point.next = new ListNode(temp % 10);
            point = point.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (addOne == 1) {
            point.next = new ListNode(1);
        }
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }