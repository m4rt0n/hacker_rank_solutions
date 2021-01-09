package easy.algorithms;

import java.util.Scanner;

public class PlusMinusB {

	static int determineArray(int num) {
		if (num > 0) {
			return 0;
		} else if (num < 0) {
			return 1;
		} else {
			return 2;
		}
	}

	static void writeResult(float count, int allElement) {
		System.out.println(count / allElement);
	}

	static void plusMinus(int[] arr) {
		int resArr[] = new int[3]; // a[0] - positive / a[1] - negative / a[2] - zero
		for (int i = 0; i < arr.length; i++) {
			int numberArray = determineArray(arr[i]);
			resArr[numberArray]++;
		}
		for (int i = 0; i < resArr.length; i++) {
			writeResult(resArr[i], arr.length);
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int[] arr = new int[n];
		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}
		plusMinus(arr);
		scanner.close();
	}
}
