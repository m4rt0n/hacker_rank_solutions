package easy.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Tabi megoldasa
public class MigratingBirdsC {

	static class BirdTypeWithNumber {

		private int[] birdArray;

		public BirdTypeWithNumber() {
			this.birdArray = new int[5];
		}

		// Accumaliting method
		public void incrementBirdNumberByType(int birdtype) {
			birdArray[birdtype - 1]++;
		}

		// Method for collect `combining partial results`
		public BirdTypeWithNumber mergeBirdTypeWithNumber(BirdTypeWithNumber obj) {
			for (int i = 0; i < obj.birdArray.length; i++) {
				birdArray[i] += obj.birdArray[i];
			}
			return this;
		}

		// get the max
		public int getMostCommonBirdType() {
			int maxIndex = 0;
			for (int i = 1; i < birdArray.length; i++) {
				if (birdArray[maxIndex] < birdArray[i]) {
					maxIndex = i;
				}
			}
			return maxIndex + 1;
		}
	}

	static int migratoryBirds(List<Integer> arr) {

		return arr.stream().collect(BirdTypeWithNumber::new, BirdTypeWithNumber::incrementBirdNumberByType,
				BirdTypeWithNumber::mergeBirdTypeWithNumber).getMostCommonBirdType();
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
