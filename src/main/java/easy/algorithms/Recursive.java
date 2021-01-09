package easy.algorithms;

public class Recursive {
	public static void main(String[] args) {

		kiir("Vakacio");
		System.out.println();
		System.out.println();
		System.out.println("Ciklussal");
		System.out.println();
		kiirCiklus("Vakacio");
	}

	private static void kiir(String string) {
		System.out.println();
		String substring = string.substring(1);
		System.out.print(string.charAt(0) + "|" + substring);
		if (substring.length() > 0) {
			kiir(substring);
		}
	}

	private static void kiirCiklus(String string) {
		for (int i = 0; i < string.length(); i++) {
			System.out.println(string.charAt(i) + "|" + string.substring(i + 1));
		}

	}
}
