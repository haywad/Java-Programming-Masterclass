package CodingExercises;

public class ExTen_EqualityPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printEqual(10, 10, 10);

	}
	
	public static void printEqual(int numberOne, int numberTwo, int numberThree) {
		
		if (numberOne < 0 || numberTwo < 0 || numberThree < 0) {
			System.out.println("Invalid Value");
		}
		else if (numberOne == numberTwo && numberTwo == numberThree) {
			System.out.println("All numbers are equal");
		}
		else if (numberOne != numberTwo && numberTwo != numberThree && numberOne != numberThree) {
			System.out.println("All numbers are different");
		}
		else {
			System.out.println("Neither all are equal or different");
		}
	}

}
