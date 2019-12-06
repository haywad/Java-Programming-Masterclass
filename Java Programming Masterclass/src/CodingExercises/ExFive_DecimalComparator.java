package CodingExercises;

public class ExFive_DecimalComparator {

	public static void main(String[] args) {
		
		boolean ans = areEqualByThreeDecimalPlaces(3.176, 3.175);
		System.out.println(ans);
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
		
		return (int)(numberOne*1000) == (int)(numberTwo*1000);
	}

}
