package easy.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GradingStudentsBResult {

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> results = new ArrayList<>();
		grades.forEach(e -> results.add(makeResult(e)));
		return results;
	}

	private static int makeResult(int m) {
		int f = 5;
		int dif = m % f;
		int roundValue = (f - dif);
		// if number % 5 is 3 or more - round up to the next multiple of 5
		// if number less than 38 - no rounding
		if (m >= 38) {
			if (dif >= 3) {
				m += roundValue;
			}
		}
		return m;
	}
}

public class GradingStudentsB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> gradeList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			gradeList.add(sc.nextInt());
		}
		sc.close();
		List<Integer> results = GradingStudentsBResult.gradingStudents(gradeList);
		results.forEach(System.out::println);
	}
}
