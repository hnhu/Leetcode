package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

/**
 * 141. Linked List Cycle
 *
 * Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
 *
 */
public class _141 {

	public static class Solution {
		public boolean hasCycle(ListNode head) {
			ListNode slow = head;
			ListNode fast = head;
			do {
				if (slow == null || fast == null || fast.next == null) {
					return false;
				}
				slow = slow.next;
				fast = fast.next.next;

			} while (slow != fast);

			return true;
		}
	}
}
