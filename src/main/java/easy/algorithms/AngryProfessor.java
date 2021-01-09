package easy.algorithms;

import java.util.Arrays;

public class AngryProfessor {

	static String angryProfessor(int k, int[] a) {

		Long studentsOnTime = Arrays.stream(a).filter(e -> e <= 0).count();
		String result = (studentsOnTime < k) ? "YES" : "NO";
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {

		int k = 3;
		int[] a = { -1, -3, 4, 2 };
		angryProfessor(k, a);
	}
}
