package ClassesConstructorsInheritance;

public class main {

	public static void main(String[] args) {
		
		Car porsche = new Car();
		Car holden = new Car();
		porsche.setModel("Carrera");
		System.out.println("Model is " + porsche.getModel());
		//-------------------------------------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------
		bankaccount myAccount = new bankaccount("7934", 500, "Haywad", "haywad@gmail.com", "9784898982");
		System.out.println(myAccount.getNumber());
		System.out.println(myAccount.getBalance());
		myAccount.withdrawal(100.0);
		myAccount.deposit(50.0);
		myAccount.withdrawal(100.0);
		myAccount.deposit(175.0);
		myAccount.withdrawal(150.0);

		bankaccount herAccount = new bankaccount("Maddie", "maddie@gmail.com", "000000000");
		System.out.println(herAccount.getBalance());
		//-------------------------------------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------
		vipcustomer vipOne = new vipcustomer();
		System.out.println(vipOne.getName());
		
		vipcustomer vipTwo = new vipcustomer("Maddie", "maddie@gmail.com");
		System.out.println(vipTwo.getName());
		
		vipcustomer vipthree = new vipcustomer("Haywad", 100.0, "haywad@gmail.com");
		System.out.println(vipthree.getName());
	}

}
