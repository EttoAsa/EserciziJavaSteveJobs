package trycatch;

import java.util.Scanner;

	public class main {
		public static void main(String args[]) {
			Scanner tastiera = new Scanner(System.in);
			System.out.println("Digita due numeri interi: ");
			int a = tastiera.nextInt();
			int b = tastiera.nextInt();
			
			try {
				int c = a/b;
				System.out.println(c);
			} catch(Exception e) {
				System.out.println("Impossibile dividere");
			} finally {
				tastiera.close();
			}
		}
	}

