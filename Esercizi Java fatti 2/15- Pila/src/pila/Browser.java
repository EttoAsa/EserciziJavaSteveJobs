package pila;

import java.util.EmptyStackException;
import java.util.Stack;

public class Browser {
	private Stack<String> pila;
	
	public Browser() {
		pila = new Stack<String>();
	}
	
	public void visitPage(String url) {
		System.out.println(url + " inserito nello stack del browser");
		pila.push(url);
	}
	
	public void prevPage() {
		String url = "Non cè un'"; 
		try {
			url = pila.peek();
		} catch (EmptyStackException e) {
			System.out.print(" stack vuoto. ");
		} finally {
			System.out.println(url + " ultima pagina che hai visitato \n");
		}
	}
	
	public void goBack() {
		String url = "Non cè un'"; 
		try {
			url = pila.pop();
		} catch (EmptyStackException e) {
			System.out.print("stack vuoto. ");
		} finally {
			System.out.println(url + " ultima pagina che hai visitato \n");
		}
	}
	
	public void stampaCronologia() {
		for(String url : pila) {
			System.out.println(url);
		}
	}
}