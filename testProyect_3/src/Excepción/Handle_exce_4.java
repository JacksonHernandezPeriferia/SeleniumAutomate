package Excepción;

public class Handle_exce_4 {
	
	public static void main(String[] args) {
	   try {
		  int i=5/0;
		  System.out.println("Value of i is "+i);
		}catch (Exception e)
		{
			System.out.println("Inside catch."+e);
		}finally
		{
			System.out.println("Inside finally. please take appropriate action");
		}
	    
	    try {
	    	int j=5/2;
	    	System.out.println("Value of j is "+j);
	    }catch (Exception e)
	    {
	       System.out.println("Inside catch"+e);
	    
	    }finally 
	    {
	      System.out.println("Inside finally. Please take appropiate action");
	    }
     }
}


