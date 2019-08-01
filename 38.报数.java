/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 报数
 *
 * https://leetcode-cn.com/problems/count-and-say/description/
 *
 * algorithms
 * Easy (47.62%)
 * Total Accepted:    20.8K
 * Total Submissions: 43.4K
 * Testcase Example:  '1'
 *
 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * 
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 
 * 
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * 
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 * 
 * 注意：整数顺序将表示为一个字符串。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 输入: 1
 * 输出: "1"
 * 
 * 
 * 示例 2:
 * 
 * 输入: 4
 * 输出: "1211"
 * 
 * 
 */
class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        if (n == 2) return "11";

        StringBuffer preResult = new StringBuffer("11");
        StringBuffer result = new StringBuffer("");
        for (int i = 3; i <= n; i++) {
            result = new StringBuffer("");
            int len = preResult.length();
            int pretempNum = preResult.toString().toCharArray()[0];
            int tempCount = 0;

            for (int k = 0; i < len; k++) {
                int tempNum = preResult.toString().toCharArray()[k];
                if (pretempNum == tempNum) {
                    tempCount++;
                } else {
                    result.append(String.valueOf(tempCount));
                    result.append(String.valueOf(pretempNum));
                    tempCount = 1;
                }
                pretempNum = tempNum;    
            }

            if (preResult.toString().toCharArray()[len - 1] == preResult.toString().toCharArray()[len - 2]) {
                result.append(String.valueOf(tempCount));
                result.append(String.valueOf(pretempNum));
            } else {
                result.append("1");
                result.append(String.valueOf(preResult.toString().toCharArray()[len - 1]));
            }
            preResult = result;
        }

        return result.toString();
    }
}

