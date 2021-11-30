package newfeatures;

public class DefaultMethodDemo {

	public static void main(String[] args) {

		//invoke abstract methods
		Vehicle car=new Car("BMW");
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		
		//invoke default method
		System.out.println(car.turnAlarmOn());
	System.out.println(car.turnAlarmOff());
	
	//invoke static method of interface
	System.out.println(Vehicle.getHorsePower(2500, 400));
	
	}

}
