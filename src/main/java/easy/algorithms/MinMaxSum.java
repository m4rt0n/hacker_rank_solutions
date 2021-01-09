package easy.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {

	static void miniMaxSum(int[] arr) {
		// convert to long by stream
		long[] longArray = Arrays.stream(arr).mapToLong(i -> i).toArray();
		// add all values
		long sum = 0;
		for (int i = 0; i < longArray.length; i++) {
			sum += longArray[i];
		}
		// remove n value
		long[] sums = new long[longArray.length];
		for (int j = 0; j < longArray.length; j++) {
			sums[j] = sum - longArray[j];
		}

		// check sums
		Arrays.stream(sums).forEach(System.out::println);
		// check min-max
		Arrays.sort(sums);
		// convert to long
		long min = sums[0];
		long max = sums[sums.length - 1];
		System.out.println(min + " " + max);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];
		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}
		miniMaxSum(arr);
		scanner.close();
	}
}
