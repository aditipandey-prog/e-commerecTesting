package date;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class DateOfMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDate today = LocalDate.now();  // Get current date

	        int day = today.getDayOfMonth();   // Day (1–31)
	        int month = today.getMonthValue(); // Month (1–12)
	        int year = today.getYear();        // Year (e.g., 2025)

	        System.out.println("Day: " + day);
	        System.out.println("Month: " + String.valueOf(month));
	        System.out.println("Year: " + year);
	}

}
