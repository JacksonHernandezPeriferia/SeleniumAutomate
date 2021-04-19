package testProyect_3;

public class If_else {
	
public static void main(String[] args) {
		
        int i = 25;
        int j = 50;
        int k = 24;
        
        //Simple declaración
        System.out.println("Ejemplo de declaración");
        if (i<j);
        System.out.println("Valor de i("+i+") es menor que el valor de j("+j+")." );
        
        //Si es otra declaración
        System.out.println("");
        System.out.println("ejemplo de si es otra declaraicón");
        if (i>=j)
        {
        System.out.println("Valor de i("+i+") Es mayor o igual al valor de j("+j+"). ");
        }else
        {
        System.out.println("Valor de i("+i+")Es menor que el valor de j("+j+"). ");
        }
        
        //Declaración If Else anidada
        System.out.println("");
        System.out.println("Parte de declaración anidada If Else");
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
