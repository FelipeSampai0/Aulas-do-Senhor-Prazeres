package ied007;

import java.util.Random;

public class Test {
	static Random random = new Random();

	public static void main(String[] args) {
		
		int[] testArray = randomArray(20, 100);
		
		int[] testArray2 = testArray;
		
		printArray(testArray);
		
		Sorter.mergeSort(testArray);
		Sorter.bubbleSort(testArray2);
		
		printArray(testArray);
		printArray(testArray2);

	}

	public static int[] randomArray(int size, int limit) {
		int[] output = new int[size];
		for (int i = 0; i < output.length; i++) {
			output[i] = random.nextInt(limit);
		}
		return output;
	}
	
	private static void printArray(int[] input) {
		for (int i : input) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
