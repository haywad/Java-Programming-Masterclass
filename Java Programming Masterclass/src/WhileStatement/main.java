package WhileStatement;

public class main {

	public static void main(String[] args) {

		int count = 1;
//		while(count != 6) {
//			System.out.println("Count value is " + count);
//			count++;
//		}
			
		do {
			System.out.println("Count value is " + count);
			count++;
			
			if (count > 100) {
				break;
			}
		} while (count != 6);
	}

}
