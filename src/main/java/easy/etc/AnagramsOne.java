package easy.etc;

import java.util.Scanner;

public class AnagramsOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		StringBuilder b = new StringBuilder();
		sc.close();
		b.append(a);
		b = b.reverse();
		if (a.equals(b.toString())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
