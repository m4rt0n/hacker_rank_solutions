package easy.algorithms;

public class TextBlockSize {

	static int designerPdfViewer(int[] h, String word) {
//transform input string to char array then to int array (char values)
		int[] w = word.chars().toArray();
		int max = 0;
		for (int n : w) {
			int index = (n - 97);
			System.out.println(n + " : " + index);
//'a' = 97
			int height = h[index];
			System.out.println(height);
			if (height > max) {
				max = height;
			}
		}
		System.out.println(max);
//word size = max char height * char number
		int result = word.length() * max;
		return result;

	}

	public static void main(String[] args) {
		String text = "abc";
		String sx = "1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7";

		String[] sa = sx.split(" ");
		int[] ia = new int[sa.length];
		for (int i = 0; i < sa.length; i++) {
			ia[i] = Integer.parseInt(sa[i]);
		}
		designerPdfViewer(ia, text);
	}
}
