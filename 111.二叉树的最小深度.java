import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
 *
 * https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/description/
 *
 * algorithms
 * Easy (36.51%)
 * Total Accepted:    13.8K
 * Total Submissions: 36.4K
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * 给定一个二叉树，找出其最小深度。
 * 
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * 
 * 说明: 叶子节点是指没有子节点的节点。
 * 
 * 示例:
 * 
 * 给定二叉树 [3,9,20,null,null,15,7],
 * 
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 * 
 * 返回它的最小深度  2.
 * 
 */
//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    public int minDepth(TreeNode root) {
        Queue<TreeNode> nodeQuere = new LinkedList<TreeNode>();
        int minDepth = 0;
        if (root == null) return minDepth;
        nodeQuere.offer(root);
        boolean minDepth_flag = false;
        while (!nodeQuere.isEmpty()) {
            int num = nodeQuere.size();
            minDepth++;
            for (int i = 0; i < num; i++) {
                if (nodeQuere.peek().left != null) {
                    nodeQuere.offer(nodeQuere.peek().left);
                } 
                if (nodeQuere.peek().right != null) {
                    nodeQuere.offer(nodeQuere.peek().right);
                } 
                if (nodeQuere.peek().left == null && nodeQuere.peek().right == null) {
                    minDepth_flag = true;
                }
                nodeQuere.poll();
            }
            if (minDepth_flag) break;
        }
        return minDepth;
    }
}

