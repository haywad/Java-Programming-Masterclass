package Inheritance;

public class main {

	public static void main(String[] args) {
		animal Animal = new animal("animal", 1, 1, 5, 5);
		
		dog Dog = new dog("yorkie", 8, 20, 2, 4, 1, 20, "link Silkey");
		dog.eat();
		dog.walk();
		dog.run();

	}

}
