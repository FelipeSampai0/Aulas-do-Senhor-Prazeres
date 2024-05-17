package ied007;

public class Sorter {

	public static int[] bubbleSort(int[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 0; j < input.length - 1 - i; j++) {
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		return input;
	}

	public static int[] selectionSort(int[] input) {

		return input;
	}

	public static int[] insertionSort(int[] input) {

		return input;
	}

}
