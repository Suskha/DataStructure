package com.queue;

import java.util.Arrays;
import java.util.Scanner;

public class Queue {

	private static Scanner input = new Scanner(System.in);
	private static boolean flag = true;

	public static void main(String[] args) {
		int top = -1;
		int base = -1;

		System.out.print("Enter the size of queue : ");
		int[] a = new int[input.nextInt()];
		input.nextLine();
		Functions fn = new Functions(a, top, base);

		while (flag) {
			System.out.println("1 - enqueue(insert)");
			System.out.println("2 - dequeue(delete)");
			System.out.println("3 - peek");
			System.out.println("0 - quit");
			System.out.print("Enter what you want to do : ");
			switch (input.nextLine()) {
			case "1":
				System.out.print("Enter the data : ");
				fn.enQueue(input.nextInt());
				input.nextLine();
				break;

			case "2":
				System.out.println(Arrays.toString(fn.getA()));
				System.out.println(fn.deQueue());
				break;
				
			case "3":
				System.out.println(fn.peek());
				System.out.println(Arrays.toString(fn.getA()));
				break;
				
			case "0":
				flag = false;
				break;
			}
		}

	}

}
