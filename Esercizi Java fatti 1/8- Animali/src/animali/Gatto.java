package animali;

public class Gatto extends Animale{

	public Gatto(String nome) {
		super(nome);
	}

	public void emettiVerso() {
		System.out.println("Meow!");
	}

	public void stampaNome() {
		System.out.print("Mi presento, sono un gatto e mi chiamo " + getNome() + "...");
	}
}
