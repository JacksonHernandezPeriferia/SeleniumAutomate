package testProyect_3;

public class static_nonstatic {
	
	static int wheel = 2;
    static int price = 25000;
	
	
	public static void main(String[] args) {
		byke1();
		
		System.out.println("Princiapl Metodo estatico: wheels = "+wheel);	
		
		System.out.println("Princiapl Metodo estatico: wheels = "+price);
		
		//byke2();
		static_nonstatic sn = new static_nonstatic();
		
		sn.byke2();
		System.out.println("Princiapl Metodo estatico: wheels = "+sn.price);
		
 	    }
	
	
		public static void byke1(){
		System.out.println("byke1 metodo estatico : wheels = "+wheel);
			}
		//System.out.println(price);
		
		public void byke2() {
			System.out.println("byke2 Método no estático : wheels = "+wheel);
			System.out.println("byke2 Método no estático : price = "+price);

			byke1();
		
		}

}
