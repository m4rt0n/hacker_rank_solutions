package easy.algorithms;

import java.util.Arrays;

public class CavityMap {

	static boolean hasCavity(int[] values, int max) {
		// if max depth is not on edge
		if (values[0] != max && values[values.length - 1] != max) {
			return true;
		}
		return false;
	}

	static String checkDepth(String s) {
		String result = "";
		int values[] = new int[s.length()];
		// convert string to int[] (1-9 = 49-57)
		for (int i = 0; i < s.length(); i++) {
			values[i] = (s.charAt(i) - 48);
		}
		// get the max element
		int maxElement = Arrays.stream(values).max().getAsInt();
		// if has cavity
		if (hasCavity(values, maxElement)) {
			// find index of max
			int maxIndex = 0;
			while (values[maxIndex] != maxElement) {
				maxIndex++;
			}
			// replace max element with 'x'
			char x = s.charAt(maxIndex);
			String sx = s.replace(x, 'X');
			System.out.println("modified string: " + sx);
			result = sx;
		} else {
			result = s;
		}
		return result;
	}

	static String[] cavityMap(String[] grid) {
		String[] results = new String[grid.length];
		for (int i = 0; i < grid.length; i++) {
			String or = grid[i];
			String sx = checkDepth(or);
			results[i] = sx;
		}
		return results;
	}

	public static void main(String[] args) {

		String[] grid = { Integer.toString(1112), Integer.toString(1912), Integer.toString(1892),
				Integer.toString(1234) };
		cavityMap(grid);
	}
}
