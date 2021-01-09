package easy.algorithms;

public class BreakingRecords {

	static int[] breakingRecords(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		int minCount = 0;
		int maxCount = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				minCount++;
			} else if (arr[i] < min) {
				min = arr[i];
				maxCount++;
			}
		}
		int[] minMax = { minCount, maxCount };
		System.out.println(minMax[0] + " " + minMax[1]);
		return minMax;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 21, 36, 10, 28, 35, 5, 24, 42 };
		breakingRecords(arr);
	}
}
