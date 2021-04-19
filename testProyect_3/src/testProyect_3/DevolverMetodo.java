package testProyect_3;

public class DevolverMetodo {

	static int c;
	static double d;
	
	public static void main(String[] args) {
	Mul(2,3);
	Div(7,3);
	System.out.println("Valor de c es "+c);
	System.out.println("Valor de d es "+d);
	Message();

	}
	
	public static int Mul(int a, int b){
		c=a*b;
		return c;
	}
	
	public static double Div(double a, double b){
		d=a/b;
		return d;
	}
	
	public static void Message() {
		System.out.println("Test Message");
	}

}
