package easy.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Candles {

	public static int birthdayCakeCandles(List<Integer> candles) {
		Collections.sort(candles);
		int res = 0;
		for (int i = 0; i < candles.size(); i++) {
			if (candles.get(i).equals(candles.get(candles.size() - 1))) {
				res++;
			}
		}
		return res;
	}
}

public class BirthdayCandles {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());
		List<Integer> candles = new ArrayList<Integer>();
		candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(Collectors.toList());

		int result = Candles.birthdayCakeCandles(candles);
		System.out.println(result);
	}
}
