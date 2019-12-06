package SwitchStatement;

public class main {
	
	public static void main(String[] args) {
		
		int switchValue = 8;
		
		switch(switchValue) {
			case 1:
				System.out.println("Value was 1");
				break;
			case 2:
				System.out.println("Value was 2");
				break;
			case 3:case 4:case 5:
				System.out.println("Value is " + switchValue);
				break;
			default:
				System.out.println("Was not 1, 2, 3, 4 or 5");
				break;
		}
		
		char switchValue1 = 'F';
		
		switch(switchValue1) {
			case 'A':
				System.out.println("Value was A");
				break;
			case 'B':
				System.out.println("Value was B");
				break;
			case 'C':case 'D':case 'E':
				System.out.println("Value was " + switchValue1);
				break;
			default:
				System.out.println("Was not A, B, C, D or E");
				break;
		}
		
		String switchValue2 = "jANuary";
		
		switch(switchValue2.toLowerCase()) {
			case "january":
				System.out.println("Value was January");
				break;
			case "february":
				System.out.println("Value was February");
				break;
			case "march":case "april":case "may":
				System.out.println("Value was " + switchValue2);
				break;
			default:
				System.out.println("Not Sure");
				break;
		}
	}
}
