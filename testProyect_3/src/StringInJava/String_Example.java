package StringInJava;

public class String_Example {

	public static void main(String[] args) {
		//String normal
		String nombre="Jose";
		System.out.println("Mi nombre es = " + nombre);
		
		
		String st1 = "En el mundo";
		String st2 = "Estamos solos";
		//String comparacion
		System.out.println("st1 igual a st2 =" +st1.equals(st2));
		
		//String Concatenacion
		System.out.println("Concatenación st1 y st2 es  = "+st1.concat(st2));
		
		//String character
		System.out.println("Caracter en el indice es = "+st1.charAt(9));
		
		//String lenght
		System.out.println("Longitud de st1 es = " +st1.length());
		
		//String lowercase
		System.out.println("Cadena en minúsculas = "+st1.toLowerCase());
		
		//Strind uppercase
		System.out.println("Cadena de mayúsculas = "+st1.toUpperCase());
		
		//Retrieve the Index of first 'i' character.
		System.out.println("Index of 1st charater i Is -> "+st1.indexOf('i'));
		  
		//Retrieve the index of 2nd most 'i' character.
		System.out.println("Index of 2nd charater i Is -> "+st1.indexOf('i', 3));
		  
		//Retrieve the Index of word 'Very' from string.
		System.out.println("Index of word Very Is -> "+st1.indexOf("Very"));
		 
		//Converting value From int to string.
		int j = 75;
	    String val2 = String.valueOf(j);
	    System.out.println("Value Of string val2 Is -> "+val2);
				  
		//Converting string to integer.
		String val1="50";
		int i = Integer.parseInt(val1);
		System.out.println("Value Of int i Is -> "+i);
		  
		//String Print the starting from 5th Index to 12th Index.
	    System.out.println("Retrieving sub string from string -> "+st1.substring(5, 13));
		  
		//String Split 
		String splt[] = st1.split("Very");
		System.out.println("String Part 1 Is -> "+splt[0]);
		System.out.println("String Part 2 Is -> "+splt[1]); 

		                //Trim String.
		  System.out.println("Trimmed st2 -> "+st2.trim()); 
		
     
	}

}
