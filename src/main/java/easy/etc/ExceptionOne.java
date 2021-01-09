package easy.etc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionOne {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		try {
			int x = in.nextInt();
			int y = in.nextInt();
			System.out.println(x / y);

			// if x or y not int
		} catch (InputMismatchException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		in.close();
	}
}
