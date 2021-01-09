package easy.algorithms;

public class LoveLetterMistery {

	static boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb = sb.reverse();
		return s == sb.toString();
	}

	static int aChangeCounter = 0;

	static char changeToA(char notA) {
		int aVal = 'a';
		int inputVal = notA;
		while (inputVal != aVal) {
			inputVal--;
			aChangeCounter++;
		}
		System.out.println("change to a steps: " + aChangeCounter);
		char newA = (char) inputVal;
		return newA;
	}

	static int BigToSmallCounter = 0;

	static char decrBiggerToSmaller(char biggerChar, char smallerChar) {
		while (biggerChar != smallerChar) {
			biggerChar--;
			BigToSmallCounter++;
		}
		System.out.println("bigger to smaller steps: " + BigToSmallCounter);
		char newChar = (char) biggerChar;
		return newChar;
	}

	static void changeMirror(char forward, char backward) {
		if (forward > backward) {
			decrBiggerToSmaller(forward, backward);
			System.out.println(forward + " > " + backward);
		} else if (forward < backward) {
			System.out.println(forward + " < " + backward);
			decrBiggerToSmaller(backward, forward);
		}
	}

	static int theLoveLetterMystery(String s) {
		int result = 0;
		System.out.println(s);

		if (isPalindrome(s)) {
			System.out.println(s + " - palindrome");
			System.out.println("result: " + result);
		} else {
			for (int i = 0; i < s.length() / 2; i++) {
				char forwardChar = s.charAt(i);
				char backwardChar = s.charAt((s.length() - 1) - i);

				if (forwardChar == 'a') {
					System.out.println(forwardChar + " <- " + backwardChar);
					changeToA(backwardChar);
				} else if (backwardChar == 'a') {
					System.out.println(forwardChar + " -> " + backwardChar);
					changeToA(forwardChar);
				} else {
					changeMirror(forwardChar, backwardChar);
				}
				result = (aChangeCounter + BigToSmallCounter);
				aChangeCounter = 0;
				BigToSmallCounter = 0;
			}
		}
		System.out.println("result: " + result);
		return result;
	}

	public static void main(String[] args) {
		String s = "ofrhase";
		theLoveLetterMystery(s);
	}

}
