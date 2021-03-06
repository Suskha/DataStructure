package com.binaryTree;

import java.util.Scanner;

public class Main {

	private static boolean flag = true;
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		BinaryTree bt = new BinaryTree();
		
		while (flag) {
			System.out.println("1 - insert data");
			System.out.println("2 - delete data");
			System.out.println("3 - find data");
			System.out.println("4 - view data in intravese format");
			System.out.println("5 - find max value");
			System.out.println("6 - find min value");
			System.out.println("0 - quit");
			System.out.print("Enter what you want to do : ");
			
			switch (input.nextLine()) {
			case "1":
				System.out.print("Enter the data : ");
				bt.insert(input.nextInt());
				input.nextLine();
				bt.inTravese();
				System.out.println();
				break;

			case "2":
				bt.inTravese();
				System.out.println();
				System.out.print("Enter the data : ");
				bt.delete(input.nextInt());
				input.nextLine();
				bt.inTravese();
				System.out.println();
				break;
				
			case "3":
				System.out.print("Enter the data : ");
				System.out.println(bt.find(input.nextInt()));
				input.nextLine();
				break;
				
			case "4":
				bt.inTravese();
				System.out.println();
				break;
				
			case "5":
				System.out.println(bt.findMax());
				break;
				
			case "6":
				System.out.println(bt.findMin());
				break;
				
			case "0":
				flag = false;
				break;

			}

		}

	}

}
