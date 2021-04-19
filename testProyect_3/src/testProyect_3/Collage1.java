package testProyect_3;

public class Collage1 {

	public static String Collage_Name = "A1 Collage";
	
	private String Department = "Computer Enginnering";
	private String name;
	private double percentile;
	public static void main(String[] args) {
		
		Collage1 student1 = new Collage1("Robert");
		student1.setPercentage(67.32);
		student1.print_details();
		
		Collage1 student2 = new Collage1("Alex");
		student2.setPercentage(72.95);
		student2.print_details();
	
	}
	
	public Collage1(String student_name) {
		name = student_name;
	}
	
	public void setPercentage(double perc) {
		percentile = perc;
	}
	
	public void print_details() {
		int Year = 2014;
		System.out.println("Resultado del año = "+Year);
		System.out.println("Nombre colega Estudiante = "+Collage_Name);
		System.out.println("Despartamento del estudiante = "+Department);
		System.out.println("Nombre estudiante = "+name);
		System.out.println("Estudiante percentil = "+percentile+"%");
		System.out.println("**********");
		
	}
         
}
