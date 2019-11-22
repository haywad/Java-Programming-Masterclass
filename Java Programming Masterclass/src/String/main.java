package String;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myString = "This is a string";
		System.out.println("My string is equal to " + myString);
		
		myString = myString + ", and this is more.";
		System.out.println("My string is equal to " + myString);
		
		String numberString = "250.55";
		numberString = numberString + "49.95";
		System.out.println(numberString);
		
		String lastString = "10";
		int myInt = 50;
		lastString = lastString + myInt;
		System.out.println("Last string is equal to " + lastString);

	}

}
