
package chapter06trees;

import java.util.List;
import java.util.Stack;

public class PostorderTree {
	public void postOrderRecursive(Node root) {
		if (root != null) {
			postOrderRecursive(root.left);
			postOrderRecursive(root.right);
			System.out.print(root.data + " ");
		}
	}

	public void preorderIteration(Node root) {
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		// push the root node into first stack.
		s1.push(root);
		while (s1.isEmpty() == false) {
			// take out the root and insert into second stack.
			Node temp = s1.pop();
			s2.push(temp);
			// now we have the root, push the left and right child of root into
			// the first stack.
			if (temp.left != null) {
				s1.push(temp.left);
			}
			if (temp.right != null) {
				s1.push(temp.right);
			}
		}
		// once the all node are traversed, take out the nodes from second stack
		// and print it.
		System.out.println("Preorder Traversal: ");
		while (s2.isEmpty() == false) {
			System.out.print(s2.pop().data + " ");
		}
	}

	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode(1);
		root.left = new BinaryTreeNode(2);
		root.right = new BinaryTreeNode(3);
		root.left.left = new BinaryTreeNode(4);
		root.left.right = new BinaryTreeNode(5);
		root.right.left = new BinaryTreeNode(6);
		root.right.right = new BinaryTreeNode(7);
		/*
		 * PostorderTree i = new PostorderTree(); i.postOrderRecursive(root);
		 * System.out.println(); i.preorderIteration(root);
		 */

		PostOrderIterative po = new PostOrderIterative();
		List lis = po.postorderTraversal(root);
		System.out.println(lis);
	}
}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}
}