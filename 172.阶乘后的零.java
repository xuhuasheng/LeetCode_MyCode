/*
 * @lc app=leetcode.cn id=172 lang=java
 *
 * [172] 阶乘后的零
 */
class Solution {

    public int trailingZeroes(int n) {
        int r = 0;
        while (n > 0) {
            n /= 5;
            r += n;
        }
        return r;
    }
    
    public int trailingZeroes2(int n) {
        int res = factorial(n);
        int zero_cnt = 0;
        while (res%10 == 0) {
            zero_cnt++;
            res /= 10;
        }
        return zero_cnt;
    }

    public int factorial(int n) {
        int res = 1;
        while (n>0) {
            res *= n--;
        }
        return res;
    }
}

