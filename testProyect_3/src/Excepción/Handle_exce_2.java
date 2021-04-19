package Excepción;

public class Handle_exce_2 {

	public static void main(String[] args) {
		catchexc();
	}
	private static void catchexc() {
		try {
	} catch (ArithmeticException e) {
		System.out.println("Devide by 0 erro.r");
	}

}
	
	private static void throwexc() throws ArithmeticException {
		int i=15/0;
  }
}
