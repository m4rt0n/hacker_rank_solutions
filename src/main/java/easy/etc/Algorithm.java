package easy.etc;

import java.util.ArrayList;
import java.util.Scanner;

class Algorithm {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			calc(a, b, n);
		}
		in.close();

	}

	public static void calc(int a, int b, int n) {
		int x = a;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int y = ((int) (Math.pow(2, i)) * b);
			x += y;
			numbers.add(x);
		}
		String line = new String();
		for (int i : numbers) {
			line = line + Integer.toString(i) + " ";
		}
		System.out.println(line);
	}

}
