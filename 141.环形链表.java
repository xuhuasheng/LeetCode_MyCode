import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */

// 给定一个链表，判断链表中是否有环。

// 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
// 如果 pos 是 -1，则在该链表中没有环。
// 示例 1：

// 输入：head = [3,2,0,-4], pos = 1
// 输出：true
// 解释：链表中有一个环，其尾部连接到第二个节点。
 

// 示例 2：

// 输入：head = [1,2], pos = 0
// 输出：true
// 解释：链表中有一个环，其尾部连接到第一个节点。


// 示例 3：

// 输入：head = [1], pos = -1
// 输出：false
// 解释：链表中没有环。



//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
//哈希表
class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        HashMap<ListNode, Integer> hashMap = new HashMap<ListNode, Integer>();
        hashMap.put(head, head.val);
        ListNode node = head;
        ListNode nextNode = node.next;
        while(nextNode != null) {
            if (hashMap.containsKey(nextNode)) {
                return true;
            } else {
                hashMap.put(nextNode, nextNode.val);
            }
            nextNode = nextNode.next;
        }
        return false;
    }
    
}

//递归
class HasCycleInLinkedList{
    public boolean hasCycle(ListNode head){
        if(head == null || head.next == null) return false;
        if(head.next == head) return true;
        ListNode nextNode = head.next; 
        head.next = head;
        boolean isCycle = hasCycle(nextNode);
        return isCycle;
    }
 }

 //双指针
 class HasCycle2{
    public boolean hasCycle(ListNode head){
        if(head == null || head.next == null) return false;
        ListNode pFast = head;
        ListNode pSlow = head;
        while (pFast != null && pFast.next != null) {
            pFast = pFast.next.next;
            pSlow = pSlow.next;
            if (pFast == pSlow) {
                return true;
            }
        }
        return false;
    }
 }
