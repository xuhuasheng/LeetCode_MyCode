import java.util.HashMap;
/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 *
 * https://leetcode-cn.com/problems/climbing-stairs/description/
 *
 * algorithms
 * Easy (43.63%)
 * Total Accepted:    32K
 * Total Submissions: 72.3K
 * Testcase Example:  '2'
 *
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 
 * 注意：给定 n 是一个正整数。
 * 
 * 示例 1：
 * 
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 
 * 示例 2：
 * 
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 * 
 * 
 */
// 递归算法 时间复杂度O(2^N)
class Solution1 {
    public int climbStairs(int n) {
        if (n<=0) return 0;
        if (n==1) return 1;
        if (n==2) return 2;
        return climbStairs(n-1) + climbStairs(n-2);
    }
}
// 备忘录算法（利用了哈希表存储已经计算过的值）存了N-2个值，时间复杂度O(N)，空间复杂度O(N)
class Solution2 {
    public int climbStairs(int n) {
        if (n<=0) return 0;
        if (n==1) return 1;
        if (n==2) return 2;
        HashMap<Integer, Integer> mem_map = new HashMap<Integer, Integer>();
        if (mem_map.containsKey(n)) {
            return mem_map.get(n);
        } else {
            int val = climbStairs(n-1) + climbStairs(n-2);
            mem_map.put(n, val);
            return val;
        } 
    }
}
// 自底向上递推 时间复杂度O(N)，空间复杂度O(1)
class Solution {
    public int climbStairs(int n) {
        if (n<=0) return 0;
        if (n==1) return 1;
        if (n==2) return 2;
        int a = 1;
        int b = 2;
        int temp = 0;
        for (int i = 3; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
        
    }
}

