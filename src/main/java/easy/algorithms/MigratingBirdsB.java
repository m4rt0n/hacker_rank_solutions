package easy.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//array solution
public class MigratingBirdsB {

	static int[] countBirdsByTypeNum(Object[] birdArr) {
		int[] result = new int[5];
		for (int i = 0; i < birdArr.length; i++) {
			int currentBirdType = (int) birdArr[i];
			result[currentBirdType - 1]++;
		}
		return result;
	}

	static int getMaxBirdTypeFromCountArray(int[] countArray) {
		int maxIndex = 0;
		for (int i = 0; i < countArray.length; i++) {
			if (countArray[maxIndex] < countArray[i]) {
				maxIndex = i;
			}
		}
		return maxIndex + 1; // the types are shifted because of the indexing
	}

	static int migratoryBirds(List<Integer> arr) {
		Object[] birdArr = arr.toArray();
		int[] resArr = countBirdsByTypeNum(birdArr);
		return getMaxBirdTypeFromCountArray(resArr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> birdList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			birdList.add(sc.nextInt());
		}
		sc.close();
		migratoryBirds(birdList);
	}
}
