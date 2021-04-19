package Interfaz;

public class TestCollege {
	
	public static void main(String[] args) {
		System.out.println(College.Collegename+" Collage student details.");
		
		College compdept = new Computer();
		
		compdept.StudentDetails();
		compdept.StudentResult();
		
		
		College mecdept = new Mechanical();
		
		mecdept.StudentDetails();
		mecdept.StudentResult();
				
	}

}
