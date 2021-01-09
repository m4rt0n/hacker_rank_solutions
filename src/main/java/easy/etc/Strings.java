package easy.etc;

import java.util.Scanner;

public class Strings {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		int numberOfSubStrings = s.length() - k + 1;

		String[] sa = new String[numberOfSubStrings];
		for (int i = 0; i < numberOfSubStrings; i++) {
			String ss = s.substring(i, i + k);
			sa[i] = ss;
		}

		for (int i = 0; i < numberOfSubStrings; i++) {
			for (int j = i + 1; j < numberOfSubStrings; j++) {
				if (sa[i].compareTo(sa[j]) > 0) {
					String tmp = sa[i];
					sa[i] = sa[j];
					sa[j] = tmp;
				}
			}
		}

		smallest = sa[0];
		largest = sa[sa.length - 1];

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
