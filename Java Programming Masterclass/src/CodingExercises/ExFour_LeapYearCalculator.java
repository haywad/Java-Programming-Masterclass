package CodingExercises;

public class ExFour_LeapYearCalculator {
	
	public static void main(String[] args) {
		
		int year = 10;
		isLeapYear(year);

	}

	public static boolean isLeapYear(int year) {
		
		if ((year < 1) && (year > 9999)) {
			return false;
		}
		else if (year % 100 == 0 && year % 400 != 0) {
			return false;
		}
		else {
			return year % 4 == 0;
		}
	}

}
