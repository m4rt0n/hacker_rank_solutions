package easy.etc;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Money {

	static Locale lus = Locale.US;
	static Locale lindia = new Locale.Builder().setLanguage("en").build();
	static Locale lchina = Locale.CHINA;
	static Locale lfrance = Locale.FRANCE;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		NumberFormat usformatter = NumberFormat.getCurrencyInstance(lus);
		String us = usformatter.format(payment);

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setCurrencySymbol("Rs.");
		((DecimalFormat) nf).setDecimalFormatSymbols(dfs);
		String india = nf.format(payment);

		NumberFormat chinaformatter = NumberFormat.getCurrencyInstance(lchina);
		String china = chinaformatter.format(payment);
		NumberFormat franceformatter = NumberFormat.getCurrencyInstance(lfrance);
		String france = franceformatter.format(payment);

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}
