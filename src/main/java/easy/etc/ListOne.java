package easy.etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOne {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int elements = sc.nextInt();
		List<Integer> list = new ArrayList();

		for (int i = 0; i < elements; i++) {
			int n = sc.nextInt();
			list.add(n);
		}
		int queries = sc.nextInt();

		for (int i = 0; i < queries; i++) {
			String s = sc.next();
			if (s.equals("Insert")) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				list.add(x, y);
			} else if (s.equals("Delete")) {
				int x = sc.nextInt();
				list.remove(x);
			}

		}
		sc.close();
		list.forEach(e -> System.out.print(e + " "));
	}
}
