/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package chapter03linkedlists;

public class ReverseALinkedList {
	public static void reverseLinkedListRecursive(ListNode current, ListNode[] head) {
		if (current == null) {
			return;
		}
		// base case
		ListNode next = current.getNext();
		if (next == null) {
			head[0] = current;
			return;
		}
		reverseLinkedListRecursive(next, head);
		// Make next node points to current node
		next.setNext(current);
		// Remove existing link
		current.setNext(null);
	}

	public static ListNode reverseListIterative(ListNode head) {
		
		
		// initially Current is head
		ListNode current = head;
		// initially previous is null
		ListNode prev = null;
		while (current != null) {
			// Save the next node
			ListNode next = current.getNext();
			// Make current node points to the previous
			current.setNext(prev);
			// update previous
			prev = current;
			// update current
			current = next;
		}
		return prev;
	}

	public static void main(String[] args) {
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(14);

		ListNode n4 = new ListNode(13);
		ListNode n5 = new ListNode(44);
		ListNode n6 = new ListNode(5);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		ListNode node=reverseListIterative(n1);
		System.out.println(node);

	}
}
