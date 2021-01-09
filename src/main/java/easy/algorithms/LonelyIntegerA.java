package easy.algorithms;

import java.util.HashMap;

//hashmap solution
public class LonelyIntegerA {
	static int lonelyInt(int[] arr) {
		int oddOccurenceNumber = 0;

		HashMap<Integer, Integer> hm = new HashMap<>();
		// Putting all elements into the HashMap
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				int val = hm.get(arr[i]);
				// If array element is already present then
				// increase the count of that element.
				hm.put(arr[i], val + 1);
			} else {
				// if array element is not present then put
				// element into the HashMap and initialize
				// the count to one.
				hm.put(arr[i], 1);
			}
		}

		for (Integer a : hm.keySet()) {
			if (hm.get(a) % 2 != 0) {
				oddOccurenceNumber = a;
			}
		}
		System.out.println(oddOccurenceNumber);
		return oddOccurenceNumber;
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
		lonelyInt(a);
	}

}
