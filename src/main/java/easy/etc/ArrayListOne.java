package easy.etc;

import java.util.Scanner;

public class ArrayListOne {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arrayCount = sc.nextInt();
		int[][] arrays = new int[arrayCount][];

		for (int i = 0; i < arrayCount; i++) {
			int[] array = new int[sc.nextInt()];
			for (int j = 0; j < array.length; j++) {
				array[j] = sc.nextInt();
			}
			arrays[i] = array;
		}

		int queryCount = sc.nextInt();
		for (int i = 0; i < queryCount; i++) {
			try {
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;
				System.out.println(arrays[x][y]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}

	}
}
