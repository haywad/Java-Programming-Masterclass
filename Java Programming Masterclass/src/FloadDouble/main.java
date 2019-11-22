package FloadDouble;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float Minimum Value = " + myMinFloatValue);
		System.out.println("Float Maximum Value = " + myMaxFloatValue);
		
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double Minimum Value = " + myMinDoubleValue);
		System.out.println("Double Maximum Value = " + myMaxDoubleValue);
		
		int myIntValue = 5 / 3;
		//float myFloatValue = (float) 5.25; not recommended
		float myFloatValue = 5 / 3f;
		double myDoubleValue = 5 / 3d;
		
		System.out.println("My Int Value = " + myIntValue);
		System.out.println("My Float Value = " + myFloatValue);
		System.out.println("My Double Value = " + myDoubleValue);

	}

}
