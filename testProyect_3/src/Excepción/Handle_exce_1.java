package Excepción;

public class Handle_exce_1 {

	public static void main(String[] args) {
		
		int a[] = {3,1,6};
		
		try {
			System.out.println("Before Exception");
			System.out.println(a[9]);
			System.out.println("After Exception");
			
		}catch(Exception e) {
			System.out.println("Exception is "+e);
		}
		System.out.println("Outside the try catch");
	}

}
