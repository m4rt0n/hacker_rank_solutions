package easy.algorithms;

//array solution
public class LonelyIntegerC {
	static int[] countNumbers(int[] inputArray) {
		int[] result = new int[100];
		for (int i = 0; i < inputArray.length; i++) {
			result[inputArray[i]]++;
		}
		return result;
	}

	static int findAloneNumber(int[] numberCountArray) {
		int result = -1;
		for (int i = 0; i < numberCountArray.length; i++) {
			if (numberCountArray[i] == 1) {
				result = i;
				break;
			}
		}
		return result;
	}

	static int lonelyinteger(int[] a) {
		int[] numberCount = countNumbers(a);
		int result = findAloneNumber(numberCount);
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 3, 3 };
		lonelyinteger(a);
	}
}
