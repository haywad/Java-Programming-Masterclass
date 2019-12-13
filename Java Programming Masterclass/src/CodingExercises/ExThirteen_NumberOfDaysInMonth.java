package CodingExercises;

public class ExThirteen_NumberOfDaysInMonth {

	public static void main(String[] args) {
		
		boolean ans = isLeapYear(23);
		System.out.println("Leap Year = " + ans);
		int days = getDaysInMonth(2, 2024);
		System.out.println("Days in month = " + days);
	}
	
	public static boolean isLeapYear(int year) {
		
		if (year < 1 || year > 9999) {
			return false;
		}
		else {
			return ((year % 400 == 0) && (year % 100 != 0) || (year % 4 == 0));
		}
	}
	
	public static int getDaysInMonth(int month, int year) {
		
		if ((month < 1 || month > 12) && (year < 1 || year > 9999)) {
			return -1;
		}
		else {
			switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
			case 4: case 6: case 9: case 11:
				return 30;
			case 2:
				return (isLeapYear(year) ? 29 : 28);
			default:
				return -1;
			}
		}
	}

}
