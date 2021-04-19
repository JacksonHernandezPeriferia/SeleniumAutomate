package testProyect_3;

public class Vehicle_2 {

	public static void main(String[] args){
		
		
		Vehicle_2 bicycle = new Vehicle_2("black",2 ,4500 ,3.7);
		Vehicle_2 motorcycle = new Vehicle_2("blue",2 ,67000 ,74.6);
	}
	
	public Vehicle_2(String color, int wheels, int price, double speed){
		System.out.println("Color = "+color+", Wheels = "+wheels+", Price = "+price+",Speed = "+speed);
	}

	

}
