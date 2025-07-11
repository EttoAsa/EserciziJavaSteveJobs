package array;

import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		String array[] = {"Ettore", "Flavio", "Giorgio", "Vincenzo", "Giuseppe"};
		
		System.out.print("Inserisci l'indice che vuoi controllare: ");
		Scanner input = new Scanner(System.in);
		int indice = input.nextInt();
		
		
		try {
			String nome = array[indice];
			System.out.println(nome);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Non esiste");
		} finally {
			input.close();
		}
		
	}
}