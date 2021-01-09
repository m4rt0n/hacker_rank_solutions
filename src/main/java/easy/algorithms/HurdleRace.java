package easy.algorithms;

import java.util.Arrays;

public class HurdleRace {

	static int hurdleRace(int j, int[] h) {

		int max = Arrays.stream(h).max().getAsInt();
		int dif = (max - j);
		int res = (max <= j) ? 0 : dif;
		return res;
	}

	public static void main(String[] args) {
		int jump = 4;
		int[] heights = { 1, 6, 3, 5, 2 };
		hurdleRace(jump, heights);
	}
}
