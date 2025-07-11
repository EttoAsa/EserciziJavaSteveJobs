package classe;


public class main {
	public static void main(String[] args) {
	Persona p1 = new Persona("Ettore", "Condemi", 24, "java");
	
	System.out.println(p1.name + " " + p1.surname + " " + p1.age + " " + p1.password);
	
	p1.password = "Mondo"; 
	
	System.out.println(p1.name + " " + p1.surname + " " + p1.age + " " + p1.password);

	}
}