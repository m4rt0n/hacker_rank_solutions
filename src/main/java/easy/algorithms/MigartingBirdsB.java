package easy.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// oop other solution
public class MigartingBirdsB {

	static List<Bird> birdList = new ArrayList<>();

	public static class Bird {
		private int id;

		public Bird(int id) {
			this.id = id;
		}

		public int getId() {
			return id;
		}
	}

	static int migratoryBirds(List<Integer> list) {
		makeBirdList(list);
		System.out.println(birdList.size());
		int result = 0;
		return result;
	}

	static List<Bird> makeBirdList(List<Integer> list) {
		list.forEach(e -> birdList.add(new Bird(e)));
		return birdList;
	}

	static Bird findResult(List<Bird> birdList) {

		return null;
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
