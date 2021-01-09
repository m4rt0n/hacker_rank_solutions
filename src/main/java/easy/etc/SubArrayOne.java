package easy.etc;

import java.util.Scanner;

public class SubArrayOne {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;
		int[] array;
		size = sc.nextInt();
		array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		int count = 0;
		for (int j = 0; j < size; j++) {
			int sum = 0;
			for (int k = j; k < size; k++) {
				sum = array[k] + sum; // adding up the elements
				if (sum > 0) {
					count++;
				}
				System.out.println(count);
			}
		}
	}
}
