package ForStstement;

public class challenge2 {

	public static void main(String[] args) {
		
		int count = 0;
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)){
				count++;
				sum += i;
				System.out.println("Found number = " + i );
				if (count == 5) {
					System.out.println("Exiting for loop");
					break;
				}
			}
		}
		
		System.out.println("Sum of all number = " + sum);

	}

}
