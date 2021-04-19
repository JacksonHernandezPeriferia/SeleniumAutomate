package testProyect_3;

public class Student_2 {

	String finame;
	String miname;
	

	public static void main(String[] args) {
		Student stdn1 = new Student("Jim");
		Student stdn2 = new Student("Max");  
	}
	
	public Student_2(String fname){
		finame = fname;
		System.out.println("1. firts name is " +finame);
	}
	
	public Student_2(String fname, String mname) {
		finame = fname;
		miname = mname;
		System.out.println("2. Firts name is = "+finame);
		System.out.println("2. Middle name is = "+miname);
		
	}

}
