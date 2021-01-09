package easy.algorithms;

public class Pangrams {

//A-Z 65-90 / a-z 97-122
	static boolean isPangram(String s) {
		// Create a hash table to mark the characters present in the string
		// By default all the elements of mark would be false.

		boolean[] mark = new boolean[26];

		// For indexing in mark[]
		int index = 0;

		// Traverse all characters
		for (int i = 0; i < s.length(); i++) {
			// If uppercase char, subtract 'A' to find index
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
				index = s.charAt(i) - 'A';
			} else if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
				index = s.charAt(i) - 'a';
			}
			// If this char is other than eng lowercase and uppercase chars
			else {
				continue;
			}
			mark[index] = true;
		}
//Return false if any character is unmarked
		for (int i = 0; i <= 25; i++) {
			if (mark[i] == false) {
				return false;
			}
		}
		// If all chars were present
		return true;
	}

	static String pangrams(String s) {
		String message = "";
		message = isPangram(s) ? "pangram" : "not pangram";
		System.out.println(message);
		return message;
	}

	public static void main(String[] args) {
		String s = "We promptly judged antique ivory buckles for the next prize";
		pangrams(s);
	}
}
