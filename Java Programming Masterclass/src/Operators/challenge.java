package Operators;

public class challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double firstVariable = 20.00d;
		double secondVariable = 80.00d;
		double totalValue = (firstVariable + secondVariable) * 100.00d;
		System.out.println("totalvalue = " + totalValue);
		double theRemainder = totalValue % 40.00d;
		System.out.println("theRemainder = " + theRemainder);
		
		boolean isNotRemainder = (theRemainder == 0) ? true : false;
		System.out.println("isNoRemainder = " + isNotRemainder);
		
		if (!isNotRemainder) {
			System.out.println("Got some remainder");
		}

	}

}
