package dates;

import java.util.ArrayList;
import java.util.List;

public class DatesA {
	public static void main(String[] args) {
		int seconds = 3662;
		TimeFormatter.formatDuration(seconds);

	}

	public static class TimeFormatter {

		static int m = 60;
		static int h = 60 * m;
		static int d = 24 * h;
		static int y = 365 * d;

		public static String formatDuration(int seconds) {
			List<String> list = new ArrayList<>();
			int x = seconds;
			if (x == 0) {
				return "now";
			} else {
				if (x >= y) {
					x = substractUnit(list, x, y, "year");
				}
				if (x >= d) {
					x = substractUnit(list, x, d, "day");
				}
				if (x >= h) {
					x = substractUnit(list, x, h, "hour");
				}
				if (x >= m) {
					x = substractUnit(list, x, m, "minute");
				}
				if (x > 0) {
					substractUnit(list, x, 1, "second");
				}
			}
			return formatMessage(list);
		}

		public static int substractUnit(List<String> list, int x, int unitOfTime, String nameOfUnit) {
			int unit = x / unitOfTime;
			String message = (unit <= 1) ? (" " + nameOfUnit) : (" " + nameOfUnit + "s");
			list.add(unit + message);
			return (x % unitOfTime);
		}

		public static String formatMessage(List<String> list) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < (list.size()); i++) {
				String postfix = (i < (list.size() - 2)) ? ", " : " and ";
				sb.append(list.get(i));
				if (i < list.size() - 1) {
					sb.append(postfix);
				}
			}
			System.out.println(sb.toString());
			return sb.toString();
		}

	}
}
