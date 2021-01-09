package easy.algorithms;

import java.util.Arrays;

public class Advertising {

	static int viralAdvertising(int d) {
		int initShare = 5;
		int initLike = 2;
		int initCum = initLike;
		int share[] = new int[d + 1];
		int like[] = new int[d + 1];
		int cum[] = new int[d + 1];
		int cumm = 0;

		share[0] = initShare;
		like[0] = initLike;
		cum[0] = initCum;

		for (int i = 1; i <= d; i++) {
			share[i] = (like[i - 1] * 3);
			like[i] = (share[i] / 2);
			cumm = ((Arrays.stream(like).sum()) - (like[i]));
			System.out.println(String.format("day: %s, shared: %s, liked: %s, cum: %s", i, share[i], like[i], cumm));
		}
		System.out.println(cumm);
		return cumm;
	}

	public static void main(String[] args) {
		int day = 3;
		viralAdvertising(day);
	}
}
