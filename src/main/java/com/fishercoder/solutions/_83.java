package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

/**
 * 83. Remove Duplicates from Sorted List
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

 For example,
 Given 1->1->2, return 1->2.
 Given 1->1->2->3->3, return 1->2->3.
 */
public class _83 {
	public static class Solution1 {
		public ListNode deleteDuplicates(ListNode head) {
			ListNode point = head;
			while (point != null && point.next != null) {
				if (point.val == point.next.val) {
					point.next = point.next.next;
				} else {
					point = point.next;
				}
			}
			return head;
		}
	}
}
