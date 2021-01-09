package easy.algorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

// OOP solution
public class MigratingBirdsA {
	static List<BirdType> birdList = new ArrayList<>();

	public static class BirdType {
		private int type;
		private int number;

		public BirdType(int type, int number) {
			this.type = type;
			this.number = number;
		}

		public int getType() {
			return type;
		}

		public int getNumber() {
			return number;
		}
	}

	static int migratoryBirds(List<Integer> list) {
		Map<Object, Long> map = list.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		birdList = makeBirdListFromMap(map);
		birdList.forEach(b -> System.out.println(String.format("type: %s, num: %s", b.getType(), b.getNumber())));
		// sort birds by criteria
		compareBirds(birdList);
//get the first bird
		int result = birdList.get(0).getType();
		System.out.println(result);
		return result;
	}

//comparator sort by number then id
	public static List<BirdType> compareBirds(List<BirdType> birdList) {
		// sort by number + reverse + sort by type
		Comparator comp = (Comparator.comparing(BirdType::getNumber)).reversed().thenComparing(BirdType::getType);
		birdList.sort(comp);
		return birdList;
	}

// make Bird objects from map keys and values
	static BirdType makeBirdFromMapElements(Object o, Long l) {
		BirdType b = new BirdType((Integer) o, l.intValue());
		return b;
	}

// make Bird list from map
	static List<BirdType> makeBirdListFromMap(Map<Object, Long> map) {
		map.forEach((k, v) -> birdList.add(makeBirdFromMapElements(k, v)));
		return birdList;
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