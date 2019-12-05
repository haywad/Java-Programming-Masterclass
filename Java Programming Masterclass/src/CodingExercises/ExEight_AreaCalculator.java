package CodingExercises;

public class ExEight_AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double areaCircle = area(50);
		double areaRectangle = area(5, 3);
		System.out.println("The area of the circle is " + areaCircle + "u");
		System.out.println("The area of the Rectangle is " + areaRectangle + "u");
	}
	
	public static double area(double radius) {
		
		if (radius < 0) {
			return -1;
		}
		
		double areaCircle = Math.PI * radius * radius;
		return areaCircle;
	}
	
	public static double area(double x, double y) {
		
		if (x < 0 || y < 0) {
			return -1;
		}
		
		double areaRectangle = x * y;
		return areaRectangle;
	}

}
