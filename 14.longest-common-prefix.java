/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 *
 * https://leetcode-cn.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (31.53%)
 * Total Accepted:    49.1K
 * Total Submissions: 155K
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 
 * 如果不存在公共前缀，返回空字符串 ""。
 * 
 * 示例 1:
 * 
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 
 * 
 * 示例 2:
 * 
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 
 * 
 * 说明:
 * 
 * 所有输入只包含小写字母 a-z 。
 * 
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuffer longestCommonString = new StringBuffer("");
        if (strs.length > 0) {  
            for (String word : strs) {
                if (word == "") {
                    return longestCommonString.toString();
                }
            }

            int n_min = strs[0].length();
            char cTemp;

            for (String word : strs) {
                if (n_min > word.length())  n_min = word.length();
            }

            for (int n = 0; n < n_min; n++) {
                cTemp = strs[0].toCharArray()[n];
                for (int i = 1; i < strs.length; i++) {
                    if (cTemp == strs[i].toCharArray()[n])
                        continue;
                    else
                        return longestCommonString.toString();
                }
                longestCommonString.append(cTemp);
            }     
        }
        return longestCommonString.toString();
    }      
}

