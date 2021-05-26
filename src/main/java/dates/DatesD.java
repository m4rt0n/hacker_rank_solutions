package dates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DatesD {
	public static void main(String[] args) {
		int seconds = 3662;
		TimeFormatter.formatDuration(seconds);
	}

	public static class TimeFormatter {
		private static final int S = 1;
		private static final int M = 60 * S;
		private static final int H = 60 * M;
		private static final int D = 24 * H;
		private static final int Y = 365 * D;
		private static final TimeUnit YEAR = new TimeUnit(Y, "year");
		private static final TimeUnit DAY = new TimeUnit(D, "day");
		private static final TimeUnit HOUR = new TimeUnit(H, "hour");
		private static final TimeUnit MINUTE = new TimeUnit(M, "minute");
		private static final TimeUnit SECOND = new TimeUnit(S, "second");
		private static final List<TimeUnit> TIME_LIST = new ArrayList<>(Arrays.asList(YEAR, DAY, HOUR, MINUTE, SECOND));

		public static String formatDuration(int seconds) {
			List<String> messageList = new ArrayList<>();
			return seconds == 0 ? "now" : substractUnit(messageList, seconds, TIME_LIST);
		}

		public static String substractUnit(List<String> messageList, int seconds, List<TimeUnit> timeList) {
			for (TimeUnit timeUnit : timeList) {
				int timeValue = timeUnit.getTimeValue();
				String timeName = timeUnit.getTimeName();
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

	public static class TimeUnit {
		private int timeValue;
		private String timeName;

		public TimeUnit(int timeValue, String timeName) {
			this.timeValue = timeValue;
			this.timeName = timeName;
		}

		public int getTimeValue() {
			return timeValue;
		}

		public String getTimeName() {
			return timeName;
		}
	}
}
