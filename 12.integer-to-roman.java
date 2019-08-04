/*
 * @lc app=leetcode.cn id=12 lang=java
 *
 * [12] 整数转罗马数字
 *
 * https://leetcode-cn.com/problems/integer-to-roman/description/
 *
 * algorithms
 * Medium (56.96%)
 * Total Accepted:    14.4K
 * Total Submissions: 25.3K
 * Testcase Example:  '3'
 *
 * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
 * 
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V +
 * II 。
 * 
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数
 * 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * 
 * 
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 
 * 
 * 给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
 * 
 * 示例 1:
 * 
 * 输入: 3
 * 输出: "III"
 * 
 * 示例 2:
 * 
 * 输入: 4
 * 输出: "IV"
 * 
 * 示例 3:
 * 
 * 输入: 9
 * 输出: "IX"
 * 
 * 示例 4:
 * 
 * 输入: 58
 * 输出: "LVIII"
 * 解释: L = 50, V = 5, III = 3.
 * 
 * 
 * 示例 5:
 * 
 * 输入: 1994
 * 输出: "MCMXCIV"
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 * 
 */
class Solution {
    public String intToRoman(int num) {
        StringBuffer roman = new StringBuffer();
        
        int thousand, hundred, decade, single;
        int[] digital =new int[4];

        if (num > 3999) num = 3999;  
        if (num < 0)  num = 0;
        
        for (int i = 0; num != 0; i++) {
            digital[i] = num % 10;
            num /= 10;
        }
        single = digital[0];
        decade = digital[1];
        hundred = digital[2];
        thousand = digital[3];

        // 千位
        for (int k = 0; k < thousand; k++) {
            roman.append('M');
        }
        // 百位
        if (hundred == 5) roman.append('D');
        else if (hundred == 9) roman.append("CM");
        else if (hundred == 4) roman.append("CD");
        else if (hundred > 5) {
            roman.append('D');
            for (int k = 0; k < hundred - 5; k++) {
                roman.append('C');
            }
        }
        else if (hundred > 0) {
            for (int k = 0; k < hundred; k++) {
                roman.append('C');
            }
        }
        // 十位
        if (decade == 5) roman.append('L');
        else if (decade == 9) roman.append("XC");
        else if (decade == 4) roman.append("XL");
        else if (decade > 5) {
            roman.append('L');
            for (int k = 0; k < decade - 5; k++) {
                roman.append('X');
            }
        }
        else if (decade > 0) {
            for (int k = 0; k < decade; k++) {
                roman.append('X');
            }
        }
        // 个位
        if (single == 5) roman.append('V');
        else if (single == 9) roman.append("IX");
        else if (single == 4) roman.append("IV");
        else if (single > 5) {
            roman.append('V');
            for (int k = 0; k < single - 5; k++) {
                roman.append('I');
            }
        }
        else if (single > 0) {
            for (int k = 0; k < single; k++) {
                roman.append('I');
            }
        }
        
        return roman.toString();
    }
}
