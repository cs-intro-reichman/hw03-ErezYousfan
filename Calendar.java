public class Calendar {
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendar of a given year.
	 */
	public static void main(String args[]) {
        int newYear = Integer.parseInt(args[0]);
        while (year < newYear) {
            advance();
        }
	 	while (year < (newYear + 1)) {	
			String date = dayOfMonth + "/" + month + "/" + year;
			if (dayOfWeek == 1)	{
				date += " Sunday";
			}
			System.out.println(date);
			advance();
        }
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		if (dayOfWeek == 7) 
				dayOfWeek = 1;
			else
				dayOfWeek++;
		if (dayOfMonth < nDaysInMonth) {
			dayOfMonth++;
		}
		else {
			dayOfMonth = 1;
			if (month == 12) {
				month = 1;
				year++;
			}
			else {
				month++;
				nDaysInMonth = nDaysInMonth(month, year);	
			}
		}
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    boolean isLeap = ((year % 400) == 0);
		isLeap = isLeap || (((year % 4) == 0) && ((year % 100) != 0));
		return isLeap;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		int days = 31; //
		switch (month) {
			case 1: days = 31;
				break;
			case 2: days = 28;
				if (isLeapYear(year))
					days = 29;
				break;
			case 3: days = 31;
				break;
			case 4: days = 30;
				break;
			case 5: days = 31;
				break;
			case 6: days = 30;
				break;
			case 7: days = 31;
				break;
			case 8: days = 31;
				break;
			case 9: days = 30;
				break;
			case 10: days = 31;
				break;
			case 11: days = 30;
				break;
			default: break;
		}
		return days;
	}
}
