package easy.algorithms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

	static void plusMinus(int[] arr) {
		int plus = 0;
		int minus = 0;
		int zero = 0;
		int[] results = new int[3];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) { // +
				plus++;
			} else if (arr[i] < 0) { // -
				minus++;
			} else { // 0
				zero++;
			}
		}
		System.out.println(String.format("+ : %s, - : %s, 0 : %s", plus, minus, zero));
		results[0] = plus;
		results[1] = minus;
		results[2] = zero;

		double plusDec = ((double) plus / arr.length);
		double minusDec = ((double) minus / arr.length);
		double zeroDec = ((double) zero / arr.length);
		System.out.println(String.format("+ : %s, - : %s, 0 : %s", plusDec, minusDec, zeroDec));

		String sDecPlus = (new DecimalFormat("#.######").format(plusDec));
		String sDecMinus = (new DecimalFormat("#.######").format(minusDec));
		String sDecZero = (new DecimalFormat("#.######").format(zeroDec));
		System.out.println(String.format("+ : %s, - : %s, 0 : %s", sDecPlus, sDecMinus, sDecZero));
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
