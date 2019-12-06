package CodingExercises;

public class ExSeven_TeenNumberChecker {

	public static void main(String[] args) {
		
		boolean ans1 = hasTeen(17, 2, 3);
		System.out.println("Answer = " + ans1);
		boolean ans2 = isTeen(18);
		System.out.println("Answer = " + ans2);
	}
	
	public static boolean hasTeen(int one, int two, int three) {
		return (one >= 13 && one <=19) || (two >= 13 && two <=19) || (three >= 13 && three <=19); 
	}
	
	public static boolean isTeen(int one) {
		return one >= 13 && one <=19;
	}

}
