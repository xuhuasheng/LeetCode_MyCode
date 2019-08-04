import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 求众数
 */
class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = 0;
        int halfLength = nums.length/2;
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!numsMap.containsKey(num)) {
                numsMap.put(num, 1);
            } else {
                numsMap.put(num, numsMap.get(num)+1);
            }
            if (numsMap.get(num) > halfLength) {
                majorityElement = num;
                break;
            }
        }
        return majorityElement;
    }
}

