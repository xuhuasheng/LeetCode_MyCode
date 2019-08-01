/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 *
 * https://leetcode-cn.com/problems/sqrtx/description/
 *
 * algorithms
 * Easy (34.16%)
 * Total Accepted:    24K
 * Total Submissions: 69.3K
 * Testcase Example:  '4'
 *
 * 实现 int sqrt(int x) 函数。
 * 
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * 
 * 示例 1:
 * 
 * 输入: 4
 * 输出: 2
 * 
 * 
 * 示例 2:
 * 
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842..., 
 * 由于返回类型是整数，小数部分将被舍去。
 * 
 * 
 */
class Solution {
    public int mySqrt(int x) {
        // int r = x;
        // while(r > x/r) {
        //     r = (r + x/r)/2;
        // }
        // return (int)r;
        for (int i = 0; i < 46340; i++) {
            if (i*i <= x && (i+1)*(i+1) > x)
            return i;
        }
        return 46340;
        // return (int)Math.sqrt(x);
    }
}

