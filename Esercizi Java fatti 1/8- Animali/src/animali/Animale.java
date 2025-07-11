package animali;

public abstract class Animale {
	private String nome;
	
	public Animale(String nome) {
		this.nome = nome;
	}
	
	public abstract void emettiVerso();
	
	public String getNome() {
		return nome;
	}

	public abstract void stampaNome();
}
