package coda;

import java.util.LinkedList;
import java.util.Queue;

public class Posta {
	private Queue<Persona> coda;
	
	public Posta() {
		coda = new LinkedList<Persona>();
	}
	
	public void entraInCoda(Persona oggetto) {
		coda.add(oggetto);
		System.out.println(oggetto.getNome() + " si è messo in coda");
	}
	
	public void chiEIlProssimo() {
		System.out.println(coda.peek().getNome() + " è primo nella coda");
		coda.peek();
	}
	
	public void servireProssimo() {
		System.out.println(coda.poll().getNome() + " è appena stato servito");
	}
	
	public void mostraCoda() {
		for(Persona oggetto : coda) {
			System.out.println(oggetto.getNome());
		}
	}
}
