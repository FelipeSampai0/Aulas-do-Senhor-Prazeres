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
			while (j > 0 && input[j-1] > temp) {
				input[j] = input[j-1];
				j--;
			}
			input[j] = temp;
			
		}
	}

}
