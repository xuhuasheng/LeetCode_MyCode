import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 *
 * https://leetcode-cn.com/problems/pascals-triangle-ii/description/
 *
 * algorithms
 * Easy (53.25%)
 * Total Accepted:    12.2K
 * Total Submissions: 22.5K
 * Testcase Example:  '3'
 *
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 
 * 
 * 
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * 
 * 示例:
 * 
 * 输入: 3
 * 输出: [1,3,3,1]
 * 
 * 
 * 进阶：
 * 
 * 你可以优化你的算法到 O(k) 空间复杂度吗？
 * 
 */
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> rowArrayList = new ArrayList<Integer>();

        for (int i = 0; i < rowIndex + 1; i++) {
            rowArrayList.add(0, 1);
            for (int j = 1; j < rowArrayList.size() - 1; j++) {
                rowArrayList.set(j, rowArrayList.get(j) + rowArrayList.get(j + 1));
            }
        }
        return rowArrayList;
    }
}

