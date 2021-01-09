package easy.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class Result {

	public static String findDay(int month, int day, int year) {
		try {
			String dateString = month + "/" + day + "/" + year;
			Locale locale = new Locale.Builder().setLanguage("en").setRegion("US").build();
			Date date = new SimpleDateFormat("MM/dd/yyyy").parse(dateString);
			System.out.println("x" + date);
			DateFormat formatter = new SimpleDateFormat("EEEE", locale);
			return formatter.format(date).toUpperCase();
		} catch (ParseException e) {
			e.printStackTrace();
			return "xxx";
		}
	}
}

public class Dates {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		int month = Integer.parseInt(firstMultipleInput[0]);
		int day = Integer.parseInt(firstMultipleInput[1]);
		int year = Integer.parseInt(firstMultipleInput[2]);
		String res = Result.findDay(month, day, year); // Solution./findDay...
		bufferedWriter.write(res);
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close();
	}
}
