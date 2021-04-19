package Interfaz;

public class Computer implements College{
	
	
	@Override
	public void StudentDetails() {
		System.out.println("Computer Dept. StudentDetails Part");
	}
	
	@Override
	public void StudentResult() {
		System.out.println("Computer Dept. Student Result Part");
	}
}
