package coda;

public class main {
	
	public static void main(String args[]) {
		Posta Motta = new Posta();
		
		Persona Ettore = new Persona("Ettore");
		Persona Giorgio = new Persona("Giorgio");
		Persona Flavio = new Persona("Flavio");
		
		Motta.entraInCoda(Ettore);
		Motta.entraInCoda(Giorgio);
		Motta.entraInCoda(Flavio);
		
		Motta.mostraCoda();
		
		Motta.chiEIlProssimo();
		
		Motta.servireProssimo();
		Motta.servireProssimo();
		
		System.out.print("Rimane nella coda ");
		Motta.mostraCoda();
	}
}
