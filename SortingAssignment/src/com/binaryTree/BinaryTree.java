package com.binaryTree;

public class BinaryTree {

	private TreeNode root;

	public void insert(Integer data) {
		if (root == null) {
			this.root = new TreeNode(data);
		} else {
			root.insert(data);
		}
	}

	public TreeNode find(Integer data) {
		if (root != null) {
			return root.find(data);
		}
		return null;
	}

	public void delete(Integer data) {

		TreeNode current = this.root;
		TreeNode parent = this.root;
		boolean isLeftChild = false;

		if (current == null)
			return;

		while (current != null && current.getData() != data) {
			parent = current;

			if (data < current.getData()) {
				current = current.getLeftChild();
				isLeftChild = true;
			} else {
				current = current.getRightChild();
				isLeftChild = false;
			}
		}

		if (current == null)
			return;

		if (current.getLeftChild() == null && current.getRightChild() == null) {
			if (current == root) {
				root = null;
			} else {
				if (isLeftChild) {
					parent.setLeftChild(null);
				} else {
					parent.setRightChild(null);
				}
			}
		} else if (current.getLeftChild() != null && current.getRightChild() == null) {
			if (current == root) {
				root = current.getLeftChild();
			} else if (isLeftChild) {
				parent.setLeftChild(current.getLeftChild());
			} else {
				parent.setRightChild(current.getLeftChild());
			}

		} else if (current.getRightChild() != null && current.getLeftChild() == null) {
			if (current == root) {
				root = current.getRightChild();
			} else if (isLeftChild) {
				parent.setLeftChild(current.getRightChild());
			} else {
				parent.setRightChild(current.getRightChild());
			}
		} else if (current.getRightChild() != null && current.getRightChild() != null) {
			TreeNode successor = getSuccessor(current);
			if (current == root)
				root = successor;
			else if (isLeftChild) {
				parent.setLeftChild(successor);
			} else {
				parent.setRightChild(successor);
			}
			successor.setLeftChild(current.getLeftChild());
		}

	}

	private TreeNode getSuccessor(TreeNode node) {
		TreeNode parentOfSuccessor = node;
		TreeNode successor = node;
		TreeNode current = node.getRightChild();
		while (current != null) {
			parentOfSuccessor = successor;
			successor = current;
			current = current.getLeftChild();
		}
		if (successor != node.getRightChild()) {
			parentOfSuccessor.setLeftChild(successor.getRightChild());
			successor.setRightChild(node.getRightChild());
		}
		return successor;
	}

	public void softDelete(Integer data) {
		TreeNode toDel = find(data);
		toDel.setIsDelete();
	}

	public Integer findMin() {
		if (root != null)
			return root.findMin();
		return null;
	}
	
	public Integer findMax() {
		if (root != null)
			return root.findMax();
		return null;
	}

	public void inTravese() {
		if (this.root != null)
			this.root.inTravese();
		System.out.println();	
	}
	

}
