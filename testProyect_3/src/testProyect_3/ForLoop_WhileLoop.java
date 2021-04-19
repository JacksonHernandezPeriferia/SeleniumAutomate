package testProyect_3;

public class ForLoop_WhileLoop {

	public static void main(String[] args) {
		System.out.println("Ejemplo");
		int i = 0;
		while(i<=3) {
			System.out.println("Valor de la variable i es"+i);
			i++;
		}
		
		System.out.println("");
		System.out.println("Ejemplo de bucle do while");
		int j=3;
		do{
			System.out.println("Valor de la variable j es "+j);
			j=j-1;
		}while(j>=0);

	}

}
