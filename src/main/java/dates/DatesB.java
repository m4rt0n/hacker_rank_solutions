package dates;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//not working - no dynamic value in hashmap iteration
public class DatesB {
	public static void main(String[] args) {
		int seconds = 3662;
		TimeFormatter.formatDuration(seconds);

	}

//1 hour, 1 minute and 2 seconds
	public static class TimeFormatter {

		static int m = 60;
		static int h = 60 * m;
		static int d = 24 * h;
		static int y = 365 * d;

		static Map<Integer, String> timeUnits = new LinkedHashMap<Integer, String>() {
			{
				put(y, "year");
				put(d, "day");
				put(h, "hour");
				put(m, "minute");
			}
		};

		public static String formatDuration(int seconds) {
			List<String> list = new ArrayList<>();
			int x = seconds;
			if (x == 0) {
				return "now";
			} else {
				substractUnit(list, seconds, timeUnits);

			}

			return formatMessage(list);
		}

		public static void substractUnit(List<String> list, int seconds, Map<Integer, String> timeUnits) {

			timeUnits.entrySet().stream().forEach(e -> {
				int x = seconds;
				if (e.getKey() < x) {
					System.out.println((x / e.getKey()) + ":" + e.getValue());
					x = x % e.getKey();
				}
			});

			// String message = (unit <= 1) ? (" " + nameOfUnit) : (" " + nameOfUnit + "s");
			// list.add(unit + message);

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
