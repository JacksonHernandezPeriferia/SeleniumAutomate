package testProyect_3;

public class Student {

	public static void main(String[] args) {
		Student stdn1 = new Student("Michael");
		Student stdn2 = new Student("Robert");
	}
	
	public Student(String name) {
		String stdnname = name;
		System.out.println("Student´s name is = "+stdnname);
	}

}
