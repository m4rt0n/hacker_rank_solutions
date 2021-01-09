package easy.algorithms;

import java.util.Arrays;

public class ClosestStation {

	static int flatlandSpaceStations(int n, int m, int[] c) {
		Arrays.sort(c);

		int result = 0;
		int results[] = new int[c.length + 2];
		int firstDistance = 0;
		int lastDistance = 0;
		int firstCity = 0;
		int lastCity = (n - 1);
		int firstStation = c[0];
		int lastStation = c[c.length - 1];

		if (n != m) {
			// if city is before first station
			if (firstStation != firstCity) {
				firstDistance = firstStation;
				System.out.println("first distance: " + firstDistance);
			}
			// if city is after last station
			if (lastStation != lastCity) {
				lastDistance = (lastCity - lastStation);
				System.out.println("last distance: " + lastDistance);
			}

			// if city is between 2 stations
			for (int i = 0; i < c.length - 1; i++) {
				int distance = c[i + 1] - c[i];
				int middle = distance / 2;
				System.out.println(
						String.format("stations: %s - %s distance: %s middle: %s", c[i], c[i + 1], distance, middle));
				results[i] = middle;
			}

			// add first and last distance
			results[c.length] = firstDistance;
			results[c.length + 1] = lastDistance;

			// get the max distance
			result = Arrays.stream(results).max().getAsInt();
		}
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		int n = 20;
		int m = 5;
		int[] c = { 13, 1, 11, 10, 6 };
		flatlandSpaceStations(n, m, c);
	}
}
