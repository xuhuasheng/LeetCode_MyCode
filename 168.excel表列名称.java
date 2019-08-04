/*
 * @lc app=leetcode.cn id=168 lang=java
 *
 * [168] Excel表列名称
 */
class Solution {
    public String convertToTitle(int n) {
        // 大佬的代码一行搞定
        return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
    }
}

