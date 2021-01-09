package easy.algorithms;

public class MatrixSample {
	public static void main(String[] args) {
		int n = 3;
		String array[][] = new String[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				if (j < (n - (i + 1))) {
					array[i][j] = " ";
					System.out.print(" ");
				} else {
					array[i][j] = "#";
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
}
