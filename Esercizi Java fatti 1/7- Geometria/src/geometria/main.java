package geometria;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner inserisci = new Scanner(System.in);
		System.out.println("Inserisci i lati del triangolo: ");
		double latoA = inserisci.nextDouble();
		double latoB = inserisci.nextDouble();
		double latoC = inserisci.nextDouble();
		System.out.println("Inserisci la base e l'altezza del triangono: ");
		double base = inserisci.nextDouble();
		double altezza = inserisci.nextDouble();
		Forma triangolo = new Triangolo(latoA , latoB, latoC, base, altezza);
		
		System.out.println("Inserisci il lato del quadrato: ");
		double lato = inserisci.nextDouble();
		Forma quadrato = new Quadrato(lato);
		
		System.out.println("Inserisci il raggio: ");
		double raggio = inserisci.nextDouble();
		Forma cerchio = new Cerchio(raggio);
	
		inserisci.close();
		
		System.out.println("\nArea triangolo: " + triangolo.calcolaArea() + "\nPerimetro triangolo: " + triangolo.calcolaPerimetro());
		System.out.println("\nArea quadrato: " + quadrato.calcolaArea() + "\nPerimetro quadrato: " + quadrato.calcolaPerimetro());
		System.out.println("\nArea cerchio: " + cerchio.calcolaArea() + "\nPerimetro cerchio: " + cerchio.calcolaPerimetro());
	}

}
