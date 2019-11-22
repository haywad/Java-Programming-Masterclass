package CodingExercises;

public class PositiveNegativeZero {
	
	public static void main(String[] args) {
		
		checkNumber(-3);
		checkNumber(9);
		checkNumber(0);
		
	}

	public static void checkNumber(int number) {
		
		if (number > 0) {
			System.out.println("Number is Positve = " + number);
		}
		else if (number < 0) {
			System.out.println("Number is Negative = " + number);
		}
		else {
			System.out.println("Number is Zero = " + number);
		}
		
	}

}
