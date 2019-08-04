import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 *
 * https://leetcode-cn.com/problems/pascals-triangle/description/
 *
 * algorithms
 * Easy (59.22%)
 * Total Accepted:    19.8K
 * Total Submissions: 32.5K
 * Testcase Example:  '5'
 *
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 
 * 
 * 
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * 
 * 示例:
 * 
 * 输入: 5
 * 输出:
 * [
 * ⁠    [1],
 * ⁠   [1,1],
 * ⁠  [1,2,1],
 * ⁠ [1,3,3,1],
 * ⁠[1,4,6,4,1]
 * ]
 * 
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> rowArrayList = new ArrayList<Integer>();
        List<List<Integer>> triArrayList = new ArrayList<List<Integer>>();

        for (int i = 0; i < numRows; i++) {
            rowArrayList.add(0, 1);
            for (int j = 1; j < rowArrayList.size() - 1; j++) {
                rowArrayList.set(j, rowArrayList.get(j) + rowArrayList.get(j + 1));
            }
            triArrayList.add(new ArrayList<Integer>(rowArrayList));
        }
        return triArrayList;
    }
}

