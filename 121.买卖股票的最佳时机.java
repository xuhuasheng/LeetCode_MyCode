/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 *
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/description/
 *
 * algorithms
 * Easy (47.48%)
 * Total Accepted:    38.6K
 * Total Submissions: 78.7K
 * Testcase Example:  '[7,1,5,3,6,4]'
 *
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * 
 * 注意你不能在买入股票前卖出股票。
 * 
 * 示例 1:
 * 
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * ⁠    注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * 
 * 
 * 示例 2:
 * 
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 * 
 * 
 */
class Solution {
    //暴力搜索
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int maxProfit_temp = prices[j] - prices[i];
                if (maxProfit_temp > maxProfit) {
                    maxProfit = maxProfit_temp;
                }
            }
        }
        return maxProfit; 
    }
    //动态规划
    int maxProfit2(int[] prices) {
        int ans=0;
        if(prices.length==0) return ans;
        int bought=prices[0];                                
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>bought)
            {
                if(ans<(prices[i]-bought)) ans=prices[i]-bought;
            }
            else
            {
                bought=prices[i];
            }
        }
    return ans;
    }
}



