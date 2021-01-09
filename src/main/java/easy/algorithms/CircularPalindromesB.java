package easy.algorithms;

public class CircularPalindromesB {
	public static void main(String[] args) {
		circularPalindromes("cacbbba");
	}

	private static int[] circularPalindromes(String s) {
		// 1 add input string
		int[] array = new int[s.length()];
		// replace characters
		for (int i = 0; i < s.length(); i++) {
			String ss = s.substring(i) + s.substring(0, i);
			array[i] = countPalindromes(ss);
		}
		return array;
	}

	// 3 count palindromes
	private static int countPalindromes(String s) {
		int pLength = 0;
		for (int j = 0; j < s.length() - 1; j++) {
			for (int k = j + 1; k <= s.length(); k++) {
				String sx = s.substring(j, k);
				if (isPalindrome(sx)) {
					pLength = (sx.length() > pLength) ? sx.length() : pLength;
				}
			}
		}
		System.out.println("max length: " + pLength);
		return pLength;
	}

	private static boolean isPalindrome(String input) {
		StringBuilder plain = new StringBuilder(input);
		StringBuilder reverse = plain.reverse();
		return (reverse.toString()).equals(input);
	}
}
