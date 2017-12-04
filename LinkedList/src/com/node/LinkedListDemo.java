package com.node;

import java.util.Scanner;

public class LinkedListDemo {
	
	private static boolean flag = true;
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
				
		while(flag) {
			System.out.println("1 - insert head");
			System.out.println("2 - serach item");
			System.out.println("3 - insert node");
			System.out.println("4 - find length of list");
			System.out.println("5 - delete head");
			System.out.println("6 - view the list");
			System.out.println("0 - quit");
			System.out.print("Enter what you want to do : ");
			
			
			switch (input.nextLine()) {
			case "1":
				System.out.print("Enter the data you want to input : ");
				list.insertAtHead(input.nextInt());
				input.nextLine();
				break;

			case "2":
				System.out.print("Enter the search item  : ");
				System.out.println(list.searchItem(input.nextInt()));
				input.nextLine();
				break;
				
			case "3":
				System.out.println(list);
				if (list.length() > 4) {
					System.out.print("Enter the node value between two nodes item  : ");
					list.insertNode(input.nextInt());
					input.nextLine();
				} else {
					System.out.println("minimum number of list length should be 5");
				}
				break;
				
			case "4":
				System.out.println(list.length());
				break;
				
			case "5":
				System.out.println(list);
				list.deleteHead();
				System.out.println(list);
				break;
				
			case "6":
				System.out.println(list);
				break;
				
			case "0":
				flag = false;
				break;
			}
		}
		
		
	}
}
