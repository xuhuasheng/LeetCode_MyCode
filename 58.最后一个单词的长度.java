/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 *
 * https://leetcode-cn.com/problems/length-of-last-word/description/
 *
 * algorithms
 * Easy (28.48%)
 * Total Accepted:    17.5K
 * Total Submissions: 60.8K
 * Testcase Example:  '"Hello World"'
 *
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 
 * 如果不存在最后一个单词，请返回 0 。
 * 
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * 
 * 示例:
 * 
 * 输入: "Hello World"
 * 输出: 5
 * 
 * 
 */
class Solution {
    public int lengthOfLastWord(String s) {
        char[] lastWordArray = s.toCharArray();
        int lastWordLength = 0;
        boolean word_falg = false;
         
        if (lastWordArray.length == 0) return 0;
        
        for (int i = lastWordArray.length - 1; i >= 0; i--) {
            if (lastWordArray[i] != ' ') {
                word_falg = true;
                lastWordLength++;
            }
            if ((lastWordArray[i] == ' ' || i == 0) && word_falg == true) {
                break;
            }
        }

        if (word_falg == false)
            return 0;      
        else
            return lastWordLength;
    }
}

