package easy.algorithms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplets {

	static List<Integer> compareTriplets(List<Integer> aList, List<Integer> bList) {
		int ax = 0;
		int bx = 0;
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < aList.size(); i++) {
			if (aList.get(i) > bList.get(i)) {
				ax++;
			} else if (aList.get(i) < bList.get(i)) {
				bx++;
			}
		}
		result.add(ax);
		result.add(bx);
		result.forEach(e -> System.out.println(e));
		return result;
	}

	public static void main(String[] args) throws IOException {
		int[] aPoints = { 5, 6, 7 };
		int[] bPoints = { 3, 6, 10 };
		List<Integer> aList = new ArrayList<>();
		List<Integer> bList = new ArrayList<>();
		Arrays.stream(aPoints).forEach(e -> aList.add(e));
		Arrays.stream(bPoints).forEach(e -> bList.add(e));
		compareTriplets(aList, bList);
	}
}
