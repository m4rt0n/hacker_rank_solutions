package easy.etc;

import java.util.Scanner;

public class Parallelogram {

	static boolean flag;
	static int b;
	static int h;

	static {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 1; i++) {
			b = sc.nextInt();
			h = sc.nextInt();
		}
		sc.close();

		if (b <= 0 || h <= 0) {
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		} else {
			flag = true;
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = b * h;
			System.out.print(area);
		}
	}
}
