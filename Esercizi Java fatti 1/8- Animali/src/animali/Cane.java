package animali;

public class Cane extends Animale{
	public Cane(String nome) {
		super(nome);
	}

	public void emettiVerso() {
		System.out.println("Woof!");
	}
	
	public void stampaNome() {
		System.out.print("Mi presento, sono un cane e mi chiamo " + getNome() + "...");
	}

}
