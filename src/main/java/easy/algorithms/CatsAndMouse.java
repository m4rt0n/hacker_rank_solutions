package easy.algorithms;

public class CatsAndMouse {

	static String catAndMouse(int x, int y, int z) {
		if (Math.abs(z - x) < Math.abs(z - y)) {
			return "Cat A";
		} else if (Math.abs(z - x) > Math.abs(z - y)) {
			return "Cat B";
		} else
			return "Mouse C";
	}

	public static void main(String[] args) {
		catAndMouse(1, 2, 3);
	}
}
