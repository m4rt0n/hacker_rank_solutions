package easy.algorithms;

public class Kangaroos {

	static String kangaroo(int x1, int v1, int x2, int v2) {
// if b is faster and starts ahead
		if ((x2 >= x1) && (v2 >= v1)) {
			return "NO";
		}
// when the 2 kangaroos meet
		if ((x1 - x2) % (v2 - v1) == 0) {
			return "YES";
		} else
			return "NO";
	}

	public static void main(String[] args) {
		kangaroo(0, 2, 5, 3);
	}
}
