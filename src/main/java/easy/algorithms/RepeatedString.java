package easy.algorithms;

public class RepeatedString {

	static long countAs(String s) {
		long numberOfAs = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) == 'a') {
				numberOfAs++;
			}
		}
		System.out.println("number of a's: " + numberOfAs);
		return numberOfAs;
	}

	static long repeatedString(String s, long n) {
		long l = s.length();
		long fullStrings = n / l;
		long remainder = n % l;
		long asPerWholeStrings = (countAs(s) * fullStrings);
		long result = 0;
		if (remainder == 0) {
			result = asPerWholeStrings;
		} else {
			String ss = s.substring(0, (int) remainder);
			long remainderResult = countAs(ss);
			result = asPerWholeStrings + remainderResult;
		}
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {

		String s = "a";
		long n = 1000000000000L;
		repeatedString(s, n);
	}
}
