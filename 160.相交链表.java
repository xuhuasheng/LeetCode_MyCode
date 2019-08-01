import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */
//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        if (headA == headB) return headA;
    
        HashMap<ListNode, Integer> hashMap = new HashMap<ListNode, Integer>();
        hashMap.put(headA, headA.val);
        hashMap.put(headB, headB.val);
        ListNode nextA = headA.next;
        ListNode nextB = headB.next;
        while (nextA != null && nextB != null) {
            if (!hashMap.containsKey(nextA)) {
                hashMap.put(nextA, nextA.val);
            } else {
                return nextA;
            }
            if (!hashMap.containsKey(nextB)) {
                hashMap.put(nextB, nextB.val);
            } else {
                return nextB;
            }

            nextA = nextA.next;
            nextB = nextB.next;
        }
        while (nextA != null) {
            if (!hashMap.containsKey(nextA)) {
                hashMap.put(nextA, nextA.val);
            } else {
                return nextA;
            }
            nextA = nextA.next;
        }
        while (nextB != null) {
            if (!hashMap.containsKey(nextB)) {
                hashMap.put(nextB, nextB.val);
            } else {
                return nextB;
            }
            nextB = nextB.next;
        }
        return null;
    }
}

