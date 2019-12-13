package CodingExercises;

public class ExOne_SpeedConverter {
	
	public static void main(String[] args) {
		
		double kilometersPerHour = 10.5;
		long miles = toMilesPerHour(kilometersPerHour);
		System.out.println("Miles = " + miles);
		
		printConversion(kilometersPerHour);
	}

	public static long toMilesPerHour(double kilometersPerHour) {
		
		if (kilometersPerHour < 0) {
			return -1;
		}
		else {
			return Math.round(kilometersPerHour / 1.609);
		}
	}
	
	public static void printConversion(double kilometersPerHour) {
		
		if (kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		}
		else {
			long milesPerHour = toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour + " km/h= " + milesPerHour + " mi/h");
		}
	}

}
