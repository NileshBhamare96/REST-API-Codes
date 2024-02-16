package in.nileshit;

public class Car {

	DieselEngine dieselengine;

	public void setDieselengine(DieselEngine dieselengine) {
		
		System.out.println("setDieselEngine() Executed");
		this.dieselengine = dieselengine;
	}

	public Car() {
		System.out.println("Car :: 0-param Constructor");
	}
	
	

	public Car(DieselEngine dieselengine) {
		System.out.println("Car ::parametrized Constructor");
		this.dieselengine = dieselengine;
	}

	public void drive() {

		int status = dieselengine.start();

		if (status >= 1) {
			System.out.println("Journey Started");
		} else {
			System.out.println("Engine Failed to Start");
		}
	}

}
