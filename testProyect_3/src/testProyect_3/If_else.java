package testProyect_3;

public class If_else {
	
public static void main(String[] args) {
		
        int i = 25;
        int j = 50;
        int k = 24;
        
        //Simple declaraci�n
        System.out.println("Ejemplo de declaraci�n");
        if (i<j);
        System.out.println("Valor de i("+i+") es menor que el valor de j("+j+")." );
        
        //Si es otra declaraci�n
        System.out.println("");
        System.out.println("ejemplo de si es otra declaraic�n");
        if (i>=j)
        {
        System.out.println("Valor de i("+i+") Es mayor o igual al valor de j("+j+"). ");
        }else
        {
        System.out.println("Valor de i("+i+")Es menor que el valor de j("+j+"). ");
        }
        
        //Declaraci�n If Else anidada
        System.out.println("");
        System.out.println("Parte de declaraci�n anidada If Else");
        if (k>=i)
        {
        	System.out.println("Valor de k("+k+") Es menor que el valor de i("+i+")" );
        }else if (k>=i && k>=j)
        {
        	System.out.println("Valor de k("+k+") esta entre el valor de i("+i+") y el valor  de variable j("+j+")" );
        }else
        {
        	System.out.println("Valor de k("+k+") Es mayor que el valor de j("+j+")" );
        }
        
        
	}

}
