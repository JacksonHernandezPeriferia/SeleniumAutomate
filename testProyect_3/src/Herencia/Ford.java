package Herencia;

public class Ford extends Car{

	public static void main(String[] args) {
		Car C = new Ford();
		C.Seats();
	}
	
	protected void Seats() {
		int seat = 6;
		System.out.println("Audi Seats = "+seat);
	}

}
