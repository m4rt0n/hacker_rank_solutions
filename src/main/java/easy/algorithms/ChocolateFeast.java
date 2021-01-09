package easy.algorithms;

public class ChocolateFeast {

	static int chocolateFeast(int money, int price, int xchange) {
		int chocs = money / price;
		int wrapper = chocs;

		while (wrapper >= xchange) {
			int exChocs = wrapper / xchange;
			wrapper = exChocs + wrapper % xchange;
			chocs += exChocs;
		}
		System.out.println(chocs);
		return chocs;
	}

	public static void main(String[] args) {

		int n = 6;
		int c = 2;
		int m = 2;
		chocolateFeast(n, c, m);
	}
}
