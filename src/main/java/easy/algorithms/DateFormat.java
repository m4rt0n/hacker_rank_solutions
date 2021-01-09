package easy.algorithms;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormat {
	public static void main(String[] args) {

		String input = "07:05:45PM";
		String insertSpace = " ";
		int index = (input.length() - 2);
		String time = input.substring(0, index) + insertSpace + input.substring(index);

		SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm:ss a");
		SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss ");
		try {
			System.out.println(date24Format.format(date12Format.parse(time)));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
