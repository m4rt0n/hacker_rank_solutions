package easy.algorithms;

import java.io.IOException;
import java.util.Arrays;

public class ElectronicShopC {
	static int getMoneySpent(int[] aA, int[] aB, int b) {
		boolean withinBudget;
		int sum = 0;
		int max = 0;
		int result = 0;

		int[] aInBudget = Arrays.stream(aA).filter(ax -> ax < b).toArray();
		int[] bInBudget = Arrays.stream(aB).filter(bx -> bx < b).toArray();

		if (aInBudget.length == 0 || bInBudget.length == 0) {
			withinBudget = false;
		} else {
			withinBudget = true;
			// pairs
			for (int i = 0; i < aInBudget.length; i++) {
				for (int y = 0; y < bInBudget.length; y++) {
					sum = aInBudget[i] + bInBudget[y];
					// max?
					if (b >= sum) {
						if (sum > max) {
							max = sum;
						}
					}
				}
			}
		}
		result = (withinBudget) ? max : -1;
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) throws IOException {
		int bud = 10;
		int[] aA = { 5, 2, 8 };
		int[] aB = { 3, 1 };
		getMoneySpent(aA, aB, bud);
	}
}