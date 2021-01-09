package easy.algorithms;

public class CountingValleys {

	public static int countingValleys(int steps, String path) {
		int valleyCounter = 0;
		int currentHeight = 0;

		for (int i = 0; i < steps; i++) {
			if (path.charAt(i) == 'U') {
				currentHeight++;
			} else if (path.charAt(i) == 'D') {
				currentHeight--;
			}
			if (currentHeight == 0 && path.charAt(i) == 'U') {
				valleyCounter++;
			}
		}
		System.out.println(valleyCounter);
		return valleyCounter;
	}

	public static void main(String[] args) {
		countingValleys(8, "UDDDUDUU");
	}
}
