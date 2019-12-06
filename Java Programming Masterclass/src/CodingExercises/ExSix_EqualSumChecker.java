package CodingExercises;

public class ExSix_EqualSumChecker {

	public static void main(String[] args) {
		
		boolean ans = hasEqualSum(2, 2, 3);
		System.out.println("Answer = " + ans);
	}
	
	public static boolean hasEqualSum(int numberOne, int numberTwo, int numberThree) {
		
		return numberOne + numberTwo == numberThree;
	}

}
