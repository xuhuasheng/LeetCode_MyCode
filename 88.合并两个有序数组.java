import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 *
 * https://leetcode-cn.com/problems/merge-sorted-array/description/
 *
 * algorithms
 * Easy (42.18%)
 * Total Accepted:    29.7K
 * Total Submissions: 69.3K
 * Testcase Example:  '[1,2,3,0,0,0]\n3\n[2,5,6]\n3'
 *
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * 
 * 说明:
 * 
 * 
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 
 * 
 * 示例:
 * 
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * 
 * 输出: [1,2,2,3,5,6]
 * 
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
 
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        } else if (nums2.length != 0) {
            int index1 = 0;
            int index2 = 0;
            boolean fullFlag1 = false;
            boolean fullFlag2 = false;

            int[] nums1_temp = new int[m];
            for (int i = 0; i < m; i++) {
                nums1_temp[i] = nums1[i];
            }
            // nums1_temp = Arrays.copyOf(nums1, m);
            // nums1_temp = (int[])nums1.clone();


            for (int i=0; i < m+n; i++) {
                if (fullFlag1 == true) {
                    nums1[i] = nums2[index2++];
                } else if (fullFlag2 == true) {
                    nums1[i] = nums1_temp[index1++];
                } else {
                    if (nums1_temp[index1] < nums2[index2]) {
                        nums1[i] = nums1_temp[index1];
                        index1++;
                        if (index1 == m) {
                            fullFlag1 =true;
                        }
                    } else {
                        nums1[i] = nums2[index2];
                        index2++;
                        if (index2 == n) {
                            fullFlag2 =true;
                        }
                    }
                }    
            }
        }
        
    }
}

