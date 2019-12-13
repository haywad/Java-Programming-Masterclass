package CodingExercises;

public class ExThree_BarkingDog {
	
	public static void main(String[] args) {
		int hourOfDay = 1;
		boolean barking = true;
		shouldWakeUp(barking, hourOfDay);

	}

	public static void shouldWakeUp(boolean barking, int hourOfDay) {
		if ((hourOfDay > 1 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay < 23) && (barking == true)) {
			System.out.println("true");
		}
		else if ((hourOfDay > 1 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay < 23) && (barking == false)) {
			System.out.println("false, since the dog is not barking.");
		}
		else if ((hourOfDay > 0 && hourOfDay <= 1) || (hourOfDay >= 23) && (barking == true)) {
			System.out.println("false, since it's not before 8.");
		}
		else {
			System.out.println("false, since the hourOfDay parameter needs to be in a range 0-23.");
		}
	}

}
