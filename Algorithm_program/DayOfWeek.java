class DayOfWeek {

  public static int dayOfWeek(int day, int month, int year) {

		int m0;
		int d0;
		int y0;
		int x;

		y0 = year - (14 - month) / 12;
		x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		m0 = month + 12 * ((14 - month) / 12) - 2;
		d0 = (day + x + 31 * m0 / 12) % 7;

		return d0;
	}

	public static void main(String args[]) {

		int day = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		String[] sArray = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
		System.out.println(sArray[dayOfWeek(day, month, year)]);
	}
}
