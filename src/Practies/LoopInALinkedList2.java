package Practies;

import chapter03linkedlists.ListNode;

public class LoopInALinkedList2 {

	public static void findLoop(ListNode head) {
		ListNode slowpt = head;
		ListNode fastpt = head;

		boolean loopfound = false;
		while (fastpt != null && fastpt.next != null) {
			fastpt = fastpt.next.next;
			slowpt = slowpt.next;
			if (fastpt == slowpt) {
				loopfound = true;
				break;
			}

		}
		if (loopfound) {
			slowpt = head;
			while (slowpt != fastpt) {
				slowpt = slowpt.next;
				fastpt = fastpt.next;
			}
		}
	}

}
