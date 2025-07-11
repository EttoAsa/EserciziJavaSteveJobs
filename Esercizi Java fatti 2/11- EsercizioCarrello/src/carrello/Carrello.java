package carrello;


import java.util.ArrayList;

public class Carrello {
	private ArrayList<String> prodotti;
	
	public Carrello(){
		prodotti = new ArrayList<>();
	}
	
	public void aggiungiProdotto(String nome) {
		prodotti.add(nome);
	}
	
	public void aggiungiProdotto(String nome, String quantità) {
		prodotti.add(nome + " " + quantità);
	}
	
	public void stampaProdotti() {
		for(String stringa : prodotti) {
			System.out.println(stringa);
		}
	}
} 
