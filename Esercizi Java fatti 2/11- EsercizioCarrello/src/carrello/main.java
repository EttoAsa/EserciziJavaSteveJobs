package carrello;

public class main {
	public static void main(String args[]) {
		Carrello carrello = new Carrello();
		carrello.aggiungiProdotto("Prodotto singolo");
		carrello.aggiungiProdotto("Prodotto adfa");
		carrello.aggiungiProdotto("Prodotto singasdsadao");
		carrello.aggiungiProdotto("Prodotto ssdfdsd");

		carrello.stampaProdotti();
	}
}
