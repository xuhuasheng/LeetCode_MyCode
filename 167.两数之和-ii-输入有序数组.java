/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */
// 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。

// 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。

// 说明:

// 返回的下标值（index1 和 index2）不是从零开始的。
// 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
// 示例:

// 输入: numbers = [2, 7, 11, 15], target = 9
// 输出: [1,2]
// 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ansIndex = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int temp1 = numbers[i];
            int temp2 = target - temp1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (temp2 == numbers[j]) {
                    ansIndex[0] = i+1;
                    ansIndex[1] = j+1;
                }
            }
        }
        return ansIndex;
    }

    // public int[] twoSum(int[] numbers, int target) {
    //     int l = 0, r = numbers.length - 1;
    //     while (numbers[l] + numbers[r] != target) {
    //         if (numbers[l] + numbers[r] > target) r--;
    //         else l++;
    //     }
    //     return new int[]{l + 1, r + 1};
    // }
}



