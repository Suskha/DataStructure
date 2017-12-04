package com.sorting;

public class MergeSort {

	public MergeSort() {
	}
	
	public int[] mergeSort(int[] dataArray) {
		if (dataArray.length > 1) {
			int[] m1 = new int[dataArray.length / 2];
			int[] m2 = new int[(dataArray.length-(dataArray.length / 2))];
						
			for (int i  =0 ; i<dataArray.length / 2 ; i++) {
				m1[i] = dataArray[i];
			}
			for (int i = 0 ; i<(dataArray.length-(dataArray.length / 2)) ; i++) {
				m2[i] = dataArray[i+(dataArray.length/2)];
			}
			mergeSort(m1);
			mergeSort(m2);
			System.arraycopy(mergeSortStep(m1, m2), 0, dataArray, 0, dataArray.length);
			
		}
		return dataArray;
	}
	
	public int[] mergeSortStep(int[] array1, int[] array2) {
		int[] a = new int[array1.length + array2.length];

		int indexOfArray1 = 0;
		int indexOfArray2 = 0;

		for (int i = indexOfArray1; i < array1.length; ++i) {

			for (int j = indexOfArray2; j < array2.length; ++j) {

				if (array1[i] < array2[j]) {
					a[indexOfArray1 + indexOfArray2] = array1[i];
					indexOfArray1++;
					break;
				} else if (array1[i] >= array2[j]) {
					a[indexOfArray1 + indexOfArray2] = array2[j];
					indexOfArray2++;
				}
			}
		}

		if (indexOfArray1 < array1.length) {
			for (int i = indexOfArray1; i < array1.length; i++) {
				a[i + indexOfArray2] = array1[i];
			}
		} else if (indexOfArray2 < array2.length) {
			for (int i = indexOfArray2; i < array2.length; i++) {
				a[i + indexOfArray1] = array2[i];
			}
		}
		return a;
	}
	
	public int find(int data, int[] dataArray, int start, int end) {

		if (start != end) {
			if (data != dataArray[start]) {
				return find(data, dataArray, start + 1, end);
			} else {
				return dataArray[start];
			}
		}
		return 0;
	}
	
}
