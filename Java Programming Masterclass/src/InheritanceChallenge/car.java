package InheritanceChallenge;

public class car extends vehicle{

	private int wheel;
	private int door;
	private int gears;
	private boolean isManual;
	
	private int currentGear;

	public car(String name, String size, int wheel, int door, int gears, boolean isManual) {
		super(name, size);
		this.wheel = wheel;
		this.door = door;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}

	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Car.setCurrentGear(): Change to " + this.currentGear + " gear.");
	}
	
	public void changeVelocity(int speed, int direction) {
		System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
		move(speed, direction);
	}

//	@Override
//	public void stop() {
//		// TODO Auto-generated method stub
//		super.stop();
//	}
	
}
