package easy.algorithms;

public class ReverseIntMovie {

	static int reverseInt(int n) {
		int r = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(Integer.toString(n));
		String ns = sb.reverse().toString();
		r = Integer.parseInt(ns);
		return r;
	}

	static int countDifference(int original) {
		int diff = Math.abs(original - reverseInt(original));
		return diff;
	}

	static int beautifulDays(int i, int j, int k) {
		int counter = 0;
		for (int x = i; x <= j; x++) {
			if (countDifference(x) % k == 0) {
				System.out.println(x + " : beautiful");
				counter++;
			} else {
				System.out.println(x + " : not beautiful");
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		int first = 20;
		int last = 23;
		int div = 6;
		beautifulDays(first, last, div);
	}
}
