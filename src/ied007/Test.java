package ied007;

import java.util.Random;

import ied007.Sorter;

public class Test {
	static Random random = new Random();

	public static void main(String[] args) {

	}

	public static int[] randomArray(int size, int limit) {
		int[] output = new int[size];
		for (int i = 0; i < output.length; i++) {
			output[i] = random.nextInt();
		}
		return output;
	}

}
