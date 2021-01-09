package easy.algorithms;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CutTheSticks {

	static int minSkipNulls(int[] arr) {
		int firstNotNullMin;
		try {
			firstNotNullMin = Arrays.stream(arr).filter(e -> e != 0).findFirst().getAsInt();
		} catch (NoSuchElementException e) { // if all elements are 0
			firstNotNullMin = 0;
		}
		return firstNotNullMin;
	}

	static int[] cutTheSticks(int[] arr) {
		Arrays.sort(arr);
		int result = 0;
		int[] results = new int[arr.length];

		int sum = 1;
		int cuts = 0;
		while (sum != 0) {
			int min = minSkipNulls(arr);
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {
					cuts++;
					arr[i] -= min;
				}
			}
			results[result] = cuts;
			System.out.println("result: " + result);
			result++;
			System.out.println("cuts: " + cuts);
			cuts = 0;
			sum = Arrays.stream(arr).sum();
		}
		int[] noNulls = Arrays.stream(results).filter(e -> e != 0).toArray();
		return noNulls;
	}

	public static void main(String[] args) {
		int[] ar = { 5, 4, 4, 2, 2, 8 };
		cutTheSticks(ar);
	}
}