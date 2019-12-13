package ForStstement;

public class main {

	public static void main(String[] args) {
		System.out.println("10,000 at 2% = " + calculateIntrest(10000.0, 2.0));
		
		for (int i = 0; i < 6; i++) {
			System.out.println("i = " + i);
		}
		
		System.out.println("**********************************************************");
		
		for (int i = 2; i < 9; i++) {
			System.out.println("10,000 at " + i + "% = " + calculateIntrest(10000.0, i));
		}
		
		System.out.println("**********************************************************");
		
		for (int i = 8; i >= 2; i--) {
			System.out.println("10,000 at " + i + "% = " + calculateIntrest(10000.0, i));
		}
	}
	
	public static double calculateIntrest(double amount, double intrestRate) {
		return(amount * (intrestRate/100));
	}

}
