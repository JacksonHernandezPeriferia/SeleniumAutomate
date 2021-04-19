package testProyect_3;

public class Accesos {

	public static void main(String[] args) {
		ModifiadoresDeAcceso.Testing_pub();
		//No se puede acceder a este metodo porque es privado.
		ModifiadoresDeAcceso.Testing_pro();
		ModifiadoresDeAcceso.Testing_Nomod();
		
		
		System.out.println();
		System.out.println("Valor de i es "+ModifiadoresDeAcceso.i);
		System.out.println("Valor de i es "+ModifiadoresDeAcceso.d);
		System.out.println("Valor de i es "+ModifiadoresDeAcceso.c);
	}

}
