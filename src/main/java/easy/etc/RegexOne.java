package easy.etc;

import java.util.Scanner;

public class RegexOne {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
//trim!
		if (s.trim().length() == 0 || s.trim().length() > 400000) {
			System.out.println(0);
			return;
		}
		scan.close();

		String words[] = s.trim().split("[ !,?.\\_'@]+");
		System.out.println(words.length);
		for (String word : words) {
			System.out.println(word);
		}
	}
}
