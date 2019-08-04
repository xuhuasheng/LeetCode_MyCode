/*
 * @lc app=leetcode.cn id=38 lang=cpp
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
    public: string count(string s){ 
        string s1=""; 
        int length=s.size(); 
        int i=0; 
        for(int j=1;j<length;j++) { 
            if(s[i]!=s[j]) { 
                s1 += (char)((j-i) + '0'); 
                s1+=s[i]; 
                i=j; 
            } 
        } 
        s1 += (char)((length-i) + '0'); 
        s1+=s[i];
        return s1; 
    } 
    string countAndSay(int n) { 
        if(n==1) return "1"; 
        if(n==2) return "11";
        else 
            return count(countAndSay(n-1)); 
    } 
};

