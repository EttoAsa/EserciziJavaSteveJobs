package animali;

public class main {

	public static void main(String[] args) {
		Rifugio rifugio = new Rifugio();
	
		Animale cane = new Cane("Ettore");
		Animale gatto = new Gatto("Umbro");
		Animale gatto2 = new Gatto("Tigro");
		
		rifugio.aggiungiAnimale(cane);
		rifugio.aggiungiAnimale(gatto);
		rifugio.aggiungiAnimale(gatto2);
		
		rifugio.stampaVersi();
	}

}
