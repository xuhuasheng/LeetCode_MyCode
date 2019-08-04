

/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */
// 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

// 说明：

// 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

// 示例 1:

// 输入: [2,2,1]
// 输出: 1
// 示例 2:

// 输入: [4,1,2,1,2]
// 输出: 4

import java.util.HashMap;
class Solution {
    public int singleNumber(int[] nums) {
        int singleNum = nums[0];
        // 哈希表：键-值对
        HashMap<Integer, Integer> mem_map = new HashMap<Integer, Integer>();
        int cnt = 0;
        //存储键值对
        for (int i = 0; i < nums.length; i++) {
            if (mem_map.containsKey(nums[i])) {
                cnt = mem_map.get(nums[i]);
                mem_map.put(nums[i], ++cnt);
            } else {
                mem_map.put(nums[i], 0);
            }
        }
        //遍历哈希表中的键，找到键对应值为0的键
        for (int key : mem_map.keySet()) {
            if (mem_map.get(key) == 0) {
                singleNum = key;
                break;
            }
        }
        return singleNum;
    }
}

// trick A ^ B ^ A ^ C ^ C = B
class Solution2 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums) {
            result ^= i;
        }
        return result;
    }
}

