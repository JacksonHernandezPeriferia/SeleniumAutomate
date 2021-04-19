package Herencia;

public class Audi extends Car{
	public int speed=150;

	public static void main(String[] args) {
		Audi A = new Audi();
		A.printdetails();
		
		System.out.println("Color of Audi = "+A.color);
		System.out.println("Color of Audi = "+A.getfuel());
	}
	
	public void printdetails() {
		System.out.println("Wheels of Audi = "+wheels);
		System.out.println("Speed of Audi = "+speed);
		
		Seats();		
	}

}
