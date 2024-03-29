/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
 *
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/description/
 *
 * algorithms
 * Easy (43.30%)
 * Total Accepted:    17.5K
 * Total Submissions: 39.9K
 * Testcase Example:  '[1,1,2]'
 *
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * 
 * 示例 1:
 * 
 * 输入: 1->1->2
 * 输出: 1->2
 * 
 * 
 * 示例 2:
 * 
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 * 
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// Definition for singly-linked list.
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) { val = x; }
// }
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode nextNode = head.next;
        ListNode currNode = head;
        while (nextNode != null) {
            if (currNode.val != nextNode.val) {
                currNode.next = nextNode;
                currNode = nextNode;
            }
            nextNode = nextNode.next;
        }
        currNode.next = null;
        return head;
    }
}

