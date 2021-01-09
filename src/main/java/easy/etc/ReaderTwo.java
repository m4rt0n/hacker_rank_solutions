package easy.etc;

import java.util.Scanner;

public class ReaderTwo {
	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			int counter = 1;
			while (sc.hasNextLine()) {
				String ln = sc.nextLine();
				System.out.println(counter + " " + ln);
				counter++;
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
