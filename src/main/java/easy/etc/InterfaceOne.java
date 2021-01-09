package easy.etc;

import java.util.Scanner;

public class InterfaceOne {
	public static void main(String[] args) {
		MyCalculatorx my_calculator = new MyCalculatorx();
		System.out.print("I implemented: ");
		ImplementedInterfaceNames(my_calculator);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(my_calculator.divisor_sum(n) + "\n");
		sc.close();
	}

	// ImplementedInterfaceNames method takes an object and prints the name of the
	// interfaces it implemented

	static void ImplementedInterfaceNames(Object o) {
		Class[] theInterfaces = o.getClass().getInterfaces();
		for (int i = 0; i < theInterfaces.length; i++) {
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}
	}
}

interface AdvancedArithmetic {
	int divisor_sum(int n);
}

class MyCalculatorx implements AdvancedArithmetic {
	@Override
	public int divisor_sum(int n) {
		int sum = n;
		for (int i = 1; i <= (n / 2); i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

}
