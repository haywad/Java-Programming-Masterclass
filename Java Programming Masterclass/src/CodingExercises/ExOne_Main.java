package CodingExercises;

public class ExOne_Main {

	public static void main(String[] args) {
		
		double kilometersPerHour = 10.5;
		long miles = ExOne_SpeedConverter.toMilesPerHour(kilometersPerHour);
		System.out.println("Miles = " + miles);
		
		ExOne_SpeedConverter.printConversion(kilometersPerHour);
	}

}
