package easy.etc;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapOne {
	public static void main(String[] args) {

		HashMap<String, Integer> person = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String name = sc.nextLine();
			int phone = sc.nextInt();
			sc.nextLine(); // clear buffer!!
			person.put(name, phone);
		}

		while (sc.hasNext()) {
			String query = sc.nextLine().trim();
			if (person.containsKey(query)) {
				System.out.println(query + "=" + person.get(query));
			} else {
				System.out.println("Not found");
			}
		}
		sc.close();
	}
}
