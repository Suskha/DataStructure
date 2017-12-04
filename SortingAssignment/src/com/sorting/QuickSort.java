package com.sorting;

public class QuickSort {

	public QuickSort() {
	}

	public int[] quickSort(int[] dataArray, int start, int end) {
		int pivot = 0;
		if (start < end) {
			pivot = partition(dataArray, start, end);
			quickSort(dataArray, start, pivot - 1);
			quickSort(dataArray, pivot + 1, end);

		}
		return dataArray;
	}

	public int partition(int[] dataArray, int start, int end) {
		int pivot = dataArray[end];
		int i = start;
		for (int j = start; j < end; j++) {
			if (dataArray[j] <= pivot) {
				int temp = dataArray[i];
				dataArray[i] = dataArray[j];
				dataArray[j] = temp;
				i = i + 1;
			}
		}
		int temp = dataArray[i];
		dataArray[i] = pivot;
		dataArray[end] = temp;
		return i;
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
