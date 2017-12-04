package com.queue;

public class Functions implements FuncInterface{

	private int[] a;
	private int top;
	private int base;

	public Functions() {

	}

	public Functions(int[] a, int top, int base) {
		super();
		this.a = a;
		this.top = top;
		this.base = base;
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

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	@Override
	public void enQueue(int data) {
		int[] b = getA();
		int top = getTop();
		if (top < b.length-1) {
			top = top + 1;
			b[top] = data;
			setA(b);
			setTop(top);
		} else{
			System.out.println("Out of Queue");
		}
	}
	
	@Override
	public String deQueue() {
		int[] b = getA();
		int top = getTop();
		
		if (top != -1) {
			int data = b[0];
			for (int i = 0 ;i < top ;i++) {
				b[i] = b[i+1];
			}
			b[top]= 0;
			top = top-1;
			setA(b);
			setTop(top);
			return "Data " + data;
		} 
		return "Queue is empty";
	}
	
	@Override
	public String peek() {
		int[] b = getA();
		int top = getTop();
		if (top != -1) {
			return "Data " + b[0];
		}
		return "Queue is empty";
	}

}
