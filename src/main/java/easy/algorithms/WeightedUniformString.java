package easy.algorithms;

import java.util.Arrays;

// not ready
public class WeightedUniformString {

	static String[] weightedUniformStrings(String s, int[] ar) {
		// a-z 1-26
		int values[] = new int[27];

		for (int i = 0; i < s.length(); i++) {
			int charValue = ((int) s.charAt(i) - 96);
			values[charValue] += charValue;
			System.out.println(charValue);
		}
		int[] noNulls = Arrays.stream(values).filter(e -> e != 0).toArray();

		// continue from here

		String[] results = { "x", "y" };
		return results;
	}

	public static void main(String[] args) {
		String s = "abccddde";
		int[] ar = { 1, 3, 12, 5, 9, 10 };
		weightedUniformStrings(s, ar);
	}
}
