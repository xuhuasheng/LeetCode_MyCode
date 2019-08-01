/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 *
 * https://leetcode-cn.com/problems/palindrome-number/description/
 *
 * algorithms
 * Easy (55.85%)
 * Total Accepted:    65.9K
 * Total Submissions: 118K
 * Testcase Example:  '121'
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 
 * 示例 1:
 * 
 * 输入: 121
 * 输出: true
 * 
 * 
 * 示例 2:
 * 
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 
 * 
 * 示例 3:
 * 
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 
 * 
 * 进阶:
 * 
 * 你能不将整数转为字符串来解决这个问题吗？
 * 
 */
class Solution {
    public boolean isPalindrome(int x) {        
        if (x < 0) {
            return false;   //位数为偶数或数字小于0
        }

        int temp_x = x;
        int digs = 0;   //位数
        while (temp_x != 0) {
            temp_x /= 10;
            digs += 1;
        }
        if (digs == 1) return true;

        temp_x = x;
        while (digs != 0) {
            int head = 0;
            int tail = 0;
            head = temp_x / (int)Math.pow(10, digs-1);
            tail = temp_x % 10;
            temp_x = (temp_x - head * (int)Math.pow(10, digs-1) - tail) / 10;
            digs -= 2;
            if (head != tail) {
                return false;
            }
            if (digs == 1) break;
        }
        return true; 
    }
}
