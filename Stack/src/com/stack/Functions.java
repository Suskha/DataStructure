package com.stack;

public class Functions implements FuncDefination {

	private int[] a;
	private int top;

	public Functions() {

	}

	public Functions(int[] a, int top) {
		super();
		this.a = a;
		this.top = top;
	}

	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	@Override
	public void push(int data) {
		int top = getTop();
		int[] b = getA();
		if (top < b.length - 1) {
			top = top + 1;
			b[top] = data;
			setA(b);
			setTop(top);
		} else {
			System.out.println("Out of Stack");
		}
	}

	@Override
	public String pop() {
		int[] b = getA();
		int top = getTop();
		if (top != -1) {
			int data = b[top];
			b[top] = 0;
			top = top - 1;
			setA(b);
			setTop(top);
			return "Data " + data;
		}
		return "Stack is empty";

	}

	@Override
	public String peek() {
		if (top != -1) {
			int[] b = getA();
			int top = getTop();
			return "Data "+ b[top];
		}
		return "Stack is empty";
	}

}
