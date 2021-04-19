package Herencia;

public class Car {
     
	private String type="Vehicle";
	public static int wheels = 4;
	public String color = "blue";
	String fuel = "Petrol";
	
	public String getfuel(){
		return fuel;
	}
	
	protected void Seats() {
		int seat = 4;
		System.out.println("Car Seats = "+seat);
	}
}
