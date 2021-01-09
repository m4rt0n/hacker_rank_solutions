package easy.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

// map solution
public class Socks {

//check if sock type (key) has pairs (value)
	static boolean hasPairs(Entry<Integer, Long> e) {
		return e.getValue() >= 2;
	}

//count pairs
	static int countPairs(Long l) {
		int y = l.intValue();
		System.out.println(y / 2);
		return y / 2;
	}

	static int sockMerchant(int n, int[] ar) {

//map array items -- each type of socks and its number will be one entry
//each element appears once (as key) and its occurrence (as value)
		Map<Integer, Long> mapOfTypesAndNumbers = Arrays.stream(ar).boxed()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
//check grouping
		mapOfTypesAndNumbers.forEach((key, value) -> System.out.println(key + ":" + value));
//list pairs (value) that have pairs
		List<Long> listOfSocksWithSomePairs = mapOfTypesAndNumbers.entrySet().stream().filter(e -> hasPairs(e))
				.map(Map.Entry::getValue).collect(Collectors.toList());
//check list
		listOfSocksWithSomePairs.forEach((e) -> System.out.println((e)));
//sum the total number of pairs
		int result = listOfSocksWithSomePairs.stream().mapToInt(l -> countPairs(l)).sum();
		System.out.println("streamresult: " + result);
		return result;
	}

	public static void main(String[] args) {

		int n = 9;
		int[] arr = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		sockMerchant(n, arr);
	}
}
