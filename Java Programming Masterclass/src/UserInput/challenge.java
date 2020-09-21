package UserInput;

import java.util.Scanner;

public class challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int counter = 0;
		int sum = 0;
		
		while (true) {
			int order = counter + 1;
			System.out.print("Enter number #" + order + ":");
			
			boolean isAnInt = scanner.hasNextInt();
			
			if (isAnInt) {
				int number = scanner.nextInt();
				counter++;
				sum += number;
				if (counter == 10) {
					break;
				}
			} else {
				System.out.println("Invalid number");
			}
			
			scanner.nextLine();
		}
		
		System.out.println("Sum = " + sum);
		
		scanner.close();
	}

}
