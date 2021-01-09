package easy.algorithms;

public class LibraryFine {

	static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

		if (y1 == y2) {
			if (m1 == m2) {
				if (d1 == d2) { // no fee
					return 0;
				} else if (d1 > d2) { // day fee
					return ((d1 - d2) * 15);
				}
			} else if (m1 > m2) { // month fee
				return ((m1 - m2) * 500);
			}
		} else if (y1 > y2) { // year fee
			return 10000;
		}
		return 0;
	}

	public static void main(String[] args) {
		libraryFine(2, 7, 1014, 1, 1, 1015);
	}
}
