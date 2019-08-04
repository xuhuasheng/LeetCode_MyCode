
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层次遍历 II
 *
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/description/
 *
 * algorithms
 * Easy (58.21%)
 * Total Accepted:    12.1K
 * Total Submissions: 20.3K
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * 
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 * 
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 * 
 * 
 * 返回其自底向上的层次遍历为：
 * 
 * [
 * ⁠ [15,7],
 * ⁠ [9,20],
 * ⁠ [3]
 * ]
 * 
 * 
 */
// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> qTreeNodes = new LinkedList<TreeNode>();
        List<List<Integer>> answerList = new LinkedList<List<Integer>>();

        if (root == null) {
            return answerList;
        }
        qTreeNodes.offer(root);
        while (!qTreeNodes.isEmpty()) {
            int levelNum  = qTreeNodes.size();
            List<Integer> sublList = new LinkedList<Integer>();
            for (int i = 0; i < levelNum ; i++) {
                if (qTreeNodes.peek().left != null) qTreeNodes.offer(qTreeNodes.peek().left);
                if (qTreeNodes.peek().right != null) qTreeNodes.offer(qTreeNodes.peek().right);
                sublList.add(qTreeNodes.poll().val);
            }
            answerList.add(0, sublList);
        }
        return answerList;
    }
}

