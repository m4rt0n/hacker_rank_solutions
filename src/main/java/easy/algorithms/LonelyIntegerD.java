package easy.algorithms;

import java.util.Arrays;
import java.util.List;

// list solution
public class LonelyIntegerD {
	static int lonelyInt(int[] arr) {
		Integer lonely = 0;
		Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		List<Integer> list = Arrays.asList(boxedArray);
		lonely = list.stream().filter(e -> isLonely(list, e)).findFirst().get();
		return lonely;
	}

	private static boolean isLonely(List<Integer> list, Integer e) {
		return list.stream().filter(element -> e.equals(element)).count() == 1l;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 3, 2, 1 };
		System.out.println(lonelyInt(a));
	}
}
