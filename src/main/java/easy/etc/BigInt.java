package easy.etc;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		sc.close();

		BigInteger add = a.add(b);
		BigInteger mult = a.multiply(b);

		System.out.println(add);
		System.out.println(mult);
	}
}
