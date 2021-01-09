package easy.algorithms;

//array solution
public class SocksB {

	static int[] countSocks(int[] ar) {
		int[] result = new int[100];
		for (int i = 0; i < ar.length; i++) {
			result[ar[i] - 1]++;
		}
		return result;
	}

	static int countPair(int[] socks) {
		int result = 0;
		for (int i = 0; i < socks.length; i++) {
			result += (socks[i] / 2);
		}
		return result;
	}

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		int[] socks = countSocks(ar);
		return countPair(socks);
	}
}
