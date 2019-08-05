/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */
class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        if (length == 1) return;
        int j = k;
        while (j > 0) {
            int temp = nums[length-1];
            for (int i = length-1; i > 0; i--) {
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
            j--;
        }
    }
}

