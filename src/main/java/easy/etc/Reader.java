package easy.etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
	public static void main(String[] args) {

		List<String> sl = new ArrayList<String>();
		String sx = "x";
		Scanner sc = new Scanner(sx);

		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			sl.add(s);
		}
		sc.close();
		sl.remove(0);

		for (String s : sl) {
			System.out.println(String.format("%s %s %s", sl.indexOf(s), " ", s));
		}
	}
}
