package dates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DatesC {
	public static void main(String[] args) {
		int seconds = 3662;
		TimeFormatter.formatDuration(seconds);

	}

	public static class TimeFormatter {
		static int s = 1;
		static int m = 60 * s;
		static int h = 60 * m;
		static int d = 24 * h;
		static int y = 365 * d;

		static List<Object> timeList = (Arrays.asList(y, "year", d, "day", h, "hour", m, "minute", s, "second"));

		public static String formatDuration(int seconds) {
			List<String> messageList = new ArrayList<>();
			return seconds == 0 ? "now" : substractUnit(messageList, seconds, timeList);
		}

		public static String substractUnit(List<String> messageList, int seconds, List<Object> timeList) {

			for (int i = 0; i < timeList.size(); i += 2) {
				int timeValue = (int) timeList.get(i);
				String timeName = (String) timeList.get(i + 1);
				if (timeValue <= seconds) {
					String message = ((seconds / timeValue) <= 1) ? (" " + timeName) : (" " + timeName + "s");
					messageList.add((seconds / timeValue) + message);
					seconds = seconds % timeValue;
				}
			}
			return formatMessage(messageList);
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
