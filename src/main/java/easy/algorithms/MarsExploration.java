package easy.algorithms;

public class MarsExploration {

	static int marsExploration(String s) {
		int counter = 0;
		String sos = "SOS";
		for (int i = 0; i < (s.length() / sos.length()); i++) {
			String ss = s.substring((i * sos.length()), ((i * sos.length()) + sos.length()));
			System.out.println(ss);
			if (ss != "SOS") {
				for (int y = 0; y < ss.length(); y++) {
					if (ss.charAt(y) != sos.charAt(y)) {
						counter++;
					}
				}
			}
		}
		System.out.println(counter);
		return counter;
	}

	public static void main(String[] args) {
		marsExploration("SOSSOT");
	}
}
