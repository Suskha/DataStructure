package com.stack;

import java.util.Arrays;
import java.util.Scanner;

public class Stack {

	private static int maxStack;
	private static Scanner input = new Scanner(System.in);
	private static boolean flag = true;

	public static void main(String[] args) {
		int top = -1;

		System.out.print("Enter the size of stack : ");
		maxStack = input.nextInt();
		input.nextLine();
		int[] a = new int[maxStack];
		Functions fn = new Functions(a, top);
		while (flag) {
			System.out.println("1 - push");
			System.out.println("2 - pop");
			System.out.println("3 - peek");
			System.out.println("0 - quit");
			System.out.print("What do you want to do : ");
			switch (input.nextLine()) {

			case "1":
				System.out.println("Enter the data : ");
				fn.push(input.nextInt());
				input.nextLine();
				break;

			case "2":
				System.out.println(Arrays.toString(fn.getA()));
				System.out.println(fn.pop());
				break;

			case "3":
				System.out.println(Arrays.toString(fn.getA()));
				System.out.println(fn.peek());
				break;

			case "0":
				flag = false;
				break;

			}
		}

	}

}
