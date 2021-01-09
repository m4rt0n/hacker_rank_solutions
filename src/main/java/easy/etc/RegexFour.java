package easy.etc;

import java.util.Scanner;

public class RegexFour {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine());
		while (n-- != 0) {
			String userName = scan.nextLine();

			if (userName.matches(UsernameValidator.regularExpression)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}

	class UsernameValidator {
		// 8-30ch
		// alphanumeric, _, a-y, A-Z, 0-9, must start with ch
		public static final String regularExpression = "(^[a-zA-Z][0-9_|a-zA-Z]{7,29})";
	}

}
