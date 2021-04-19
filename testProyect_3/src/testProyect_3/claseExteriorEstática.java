package testProyect_3;

public class claseExteriorEstática {

	public static void main(String[] args) {
		
      static_nonstatic.byke1();
      
      System.out.println("Usando la variable estatica de otra clase"+static_nonstatic.wheel);
      
      static_nonstatic oc = new static_nonstatic();
      
      System.out.println("Accediendo a variables no estáticas fuera de la clase"+oc.price);
      
      oc.byke2();
	}

}
