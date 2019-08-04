/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 *
 * https://leetcode-cn.com/problems/add-binary/description/
 *
 * algorithms
 * Easy (45.86%)
 * Total Accepted:    16.7K
 * Total Submissions: 35.9K
 * Testcase Example:  '"11"\n"1"'
 *
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * 
 * 输入为非空字符串且只包含数字 1 和 0。
 * 
 * 示例 1:
 * 
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 
 * 示例 2:
 * 
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 * 
 */
class Solution {
    public String addBinary(String a, String b) {
        int aNum = a.length();
        int bNum = b.length();
        boolean carryFlag = false;
        StringBuffer sum = new StringBuffer();
        
        while (aNum > 0 && bNum > 0) {
            aNum--;
            bNum--;
            if (a.charAt(aNum) == '0' && b.charAt(bNum) == '0') {
                if (carryFlag == false) {
                    sum.insert(0, "0");
                    carryFlag = false;
                } else {
                    sum.insert(0, "1");
                    carryFlag = false;
                }
            } else if (a.charAt(aNum) == '1' && b.charAt(bNum) == '1') {
                if (carryFlag == false) {
                    sum.insert(0, "0");
                    carryFlag = true;
                } else {
                    sum.insert(0, "1");
                    carryFlag = true;
                }
            } else {
                if (carryFlag == false) {
                    sum.insert(0, "1");
                    carryFlag = false;
                } else {
                    sum.insert(0, "0");
                    carryFlag = true;
                }
            } 
        }
        if (aNum > 0) {
            while (aNum > 0) {
                aNum--;
                if (a.charAt(aNum) == '0') {
                    if (carryFlag == false) {
                        sum.insert(0, "0");
                        carryFlag = false;
                    } else {
                        sum.insert(0, "1");
                        carryFlag = false;
                    }
                } else {
                    if (carryFlag == false) {
                        sum.insert(0, "1");
                        carryFlag = false;
                    } else {
                        sum.insert(0, "0");
                        carryFlag = true;
                    }
                }
            }
        }
        if (bNum > 0) {
            while (bNum > 0) {
                bNum--;
                if (b.charAt(bNum) == '0') {
                    if (carryFlag == false) {
                        sum.insert(0, "0");
                        carryFlag = false;
                    } else {
                        sum.insert(0, "1");
                        carryFlag = false;
                    }
                } else {
                    if (carryFlag == false) {
                        sum.insert(0, "1");
                        carryFlag = false;
                    } else {
                        sum.insert(0, "0");
                        carryFlag = true;
                    }
                }
            }
        }
        if (carryFlag == true) {
            sum.insert(0, "1");
            carryFlag = false;
        }
        return sum.toString();
    }
}

