package ied007;

public class Sorter {

	public static void bubbleSort(int[] input) {

		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 0; j < input.length - 1 - i; j++) {
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
	}	

	public static void selectionSort(int[] input) {

		for (int i = 0; i < input.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < input.length; j++) {
				if (input[j] < input[minIndex])
					minIndex = j;
			}
			int temp = input[minIndex];
			input[minIndex] = input[i];
			input[i] = temp;
		}
	}	

	public static void insertionSort(int[] input) {

		for (int i = 1; i < input.length; i++) {
			int temp = input[i];
			int j = i;
			while (j > 0 && input[j - 1] > temp) {
				input[j] = input[j - 1];
				j--;
			}
			input[j] = temp;

		}
	}	

	public static void mergeSort(int[] input) {
		if (input.length <= 1)
			return;

		int[] left = new int[input.length / 2];
		System.arraycopy(input, 0, left, 0, left.length);
		
		int[] right = new int[input.length - left.length];
		System.arraycopy(input, left.length, right, 0, right.length);

		mergeSort(left);
		mergeSort(right);
		
		mergeUp(input, left, right);
	}

	private static void mergeUp(int[] input, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;
		
		while (i < left.length && j < right.length) {
			if(left[i] <= right[j]) {
				input[k] = left[i];
				i++;
			} else {
				input[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i < left.length) {	
			input[k] = left[i];
			i++;
			k++;
		}
		
		while (j < right.length) {
			input[k] = right[j];
			j++;
			k++;
		}
	}
}
