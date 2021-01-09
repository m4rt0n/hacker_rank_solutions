package easy.algorithms;

public class ElectronicsShop {

	static int getMoneySpent(int[] aA, int[] aB, int b) {

		int sum = 0;
		int max = -1;
		for (int i = 0; i < aA.length; i++) {
			for (int y = 0; y < aB.length; y++) {
				sum = aA[i] + aB[y];
				// if the pair is within budget and not max variant
				if (b >= sum) {
					if (sum > max) {
						max = sum;
					}
					// when out of budget
				} else {
					sum = -1;
				}
			}
		}
		System.out.println("final max: " + sum);
		return sum;
	}

	public static void main(String[] args) {
		int bud = 10;
		int[] aA = { 5, 2, 8 };
		int[] aB = { 3, 1 };
		getMoneySpent(aA, aB, bud);
	}
}
