package com.binaryTree;

public class TreeNode {

	private Integer data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	private boolean isDeleted= false;

	public TreeNode() {

	}

	public TreeNode(Integer data, TreeNode leftChild, TreeNode rightChild) {
		this.data = data;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public TreeNode(Integer data) {
		this.data = data;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public void setIsDelete() {
		this.isDeleted = true;
	}
	
	public boolean getIsDelete() {
		return isDeleted;
	}
	
	public TreeNode find(Integer data) {
		if (this.getData() == data /*&& !isDeleted*/) {
			return this;
		} else if (this.getData() > data && leftChild != null) {
			return this.leftChild.find(data);
		} else if (this.getData() < data && rightChild != null) {
			return this.rightChild.find(data);
		}
		return null;
	}

	public void insert(Integer data) {
		if (this.data > data) {
			if (this.leftChild == null)
				this.leftChild = new TreeNode(data);
			else
				this.leftChild.insert(data);
		} else if (this.data <= data) {
			if (this.rightChild == null)
				this.rightChild = new TreeNode(data);
			else
				this.rightChild.insert(data);
		}
	}
	
	public void inTravese() {
		if (this.leftChild != null)
			this.leftChild.inTravese();
		System.out.print(this + ", ");
		if (this.rightChild != null)
			this.rightChild.inTravese();
	}
	
	
	
	public Integer findMin() {
		if (this.getLeftChild() == null ) {
			return this.data;
		}
		return this.getLeftChild().findMin();
	}
	
	public Integer findMax() {
		if (this.getRightChild() == null ) {
			return this.data;
		}
		return this.getRightChild().findMax();
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.data);
	}
}
