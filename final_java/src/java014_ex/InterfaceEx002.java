package java014_ex;

interface Vehicle {
	public void run();}

class MotorCycle implements Vehicle {
	@Override public void run() {System.out.println("오도바이 ㄱ"); }
}

class Car implements Vehicle {

	@Override public void run() {System.out.println("자동차 ㄱㄱ");   }
	
}

class Driver {
	public void drive (Vehicle vehicle) {vehicle.run();} 
	
	
}


public class InterfaceEx002 {
 public static void main(String[] args) {
	Driver driver = new Driver();
	Car car = new Car();
	MotorCycle mo = new MotorCycle();
	
	driver.drive(car);
	driver.drive(mo);
}
}
