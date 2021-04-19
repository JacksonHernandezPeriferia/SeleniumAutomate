package Excepción;

public class Handle_exce_3 {

	public static void main(String[] args) {
		catchexc();
	}
	private static void catchexc() {
		try {
			
		throwexc();
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound exception.");
		}
		
	}
	
	private static void throwexc() {
		throw new ArrayIndexOutOfBoundsException();
	}

}
