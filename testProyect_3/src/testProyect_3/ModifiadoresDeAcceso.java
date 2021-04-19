package testProyect_3;

public class ModifiadoresDeAcceso {
     
	public static int  i=10;
	private static String str="Hola";
	protected static double d=30.235;
	static char c='g';
	

	public static void main(String[] args) {
		
		Testing_pub();
		Testing_pri();
		Testing_pro();
		Testing_Nomod();
	}
	
	
	public static void Testing_pub() {
		System.out.println("Testing_pud() Executed");
		System.out.println("Valor de i es " +i);
		System.out.println("Valor de str es " +str);
		System.out.println("Valor de d es " +d);
		System.out.println("Valor de c es " +c);
		
	}

		
	private static void Testing_pri() {
		System.out.println("Testing_pri() Executed");
	}
	
	
	protected static void Testing_pro() {
		System.out.println("Testing_pro() Execute");
	}
	
	static void Testing_Nomod() {
	    System.out.println("Testing_Nomod() Executed");
	    
	}
}
