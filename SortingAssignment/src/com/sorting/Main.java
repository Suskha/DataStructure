package com.sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.binaryTree.*;

public class Main {

	private static MergeSort merge = new MergeSort();
	private static QuickSort quick = new QuickSort();
	private static BinaryTree bt = new BinaryTree();
	private static Random rand = new Random();
	private static long startTime;
	private static long endTime;
	private static boolean flag = true;
	private static Scanner input = new Scanner(System.in);
	private static int[] a = new int[1000];
	private static int[] b;

	public static void main(String[] args) {

		int inputVariable;
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(1000);
		}

		
		while (flag) {
			System.out.println();
			System.out.println("Random Data available");
			System.out.println(Arrays.toString(a));
			System.out.println("1 - merge Sort");
			System.out.println("2 - quick Sort");
			System.out.println("3 - Binary Search");
			System.out.println("4 - Perform all");
			System.out.println("0 - quit");
			System.out.print("What you want to perform : ");
			inputVariable = input.nextInt();
			input.nextLine();
			switch (inputVariable) {
			case 1:
				mergeFunction();
				break;

			case 2:
				quickFunction();
				break;

			case 3:
				binarySearchFunction();
				break;

			case 4:
				System.out.println("Performing merge sort");
				mergeFunction();
				System.out.println();
				System.out.println("Performing quick sort");
				quickFunction();
				System.out.println();
				System.out.println("Performing Binary search");
				binarySearchFunction();
				break;

			case 0:
				flag = false;
				break;
			}
		}
	}

	public static void mergeFunction() {
		System.currentTimeMillis();
		b = Arrays.copyOf(a, a.length);
		startTime = System.currentTimeMillis();
		System.out.println(Arrays.toString(merge.mergeSort(b)));
		endTime = System.currentTimeMillis();
		System.out.printf("Time take to execute the merge sort is : %d ms", endTime - startTime);
		System.out.println();
	}

	public static void quickFunction() {
		b = Arrays.copyOf(a, a.length);
		startTime = System.currentTimeMillis();
		System.out.println(Arrays.toString(quick.quickSort(b, 0, b.length - 1)));
		endTime = System.currentTimeMillis();
		System.out.printf("Time take to execute the quick sort is : %d ms", endTime - startTime);
		System.out.println();
	}

	public static void binarySearchFunction() {
		b = Arrays.copyOf(a, a.length);
		startTime = System.currentTimeMillis();
		for (int i = 0; i < b.length; i++) {
			bt.insert(b[i]);
		}
		System.out.print("[");
		bt.inTravese();
		endTime = System.currentTimeMillis();
		System.out.printf("Time take to execute the Binary Search is : %d ms", endTime - startTime);
		System.out.println();
	}
	
}
