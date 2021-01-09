package easy.algorithms;

public class Squares {

	static boolean isPerfectSquare(int n) {
		// math solution
		double sqrt = (double) Math.sqrt(n);
		return ((sqrt - Math.floor(sqrt)) == 0);
	}

	static int squares(int a, int b) {
		int counter = 0;
		for (int i = a; i <= b; i++) {
			if (isPerfectSquare(i)) {
				counter++;
			}
		}
		System.out.println(counter);
		return counter;
	}

	public static void main(String[] args) {
		squares(17, 24);
	}
}
