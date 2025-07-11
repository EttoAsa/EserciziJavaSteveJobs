package geometria;

public abstract class Forma {
	public abstract double calcolaArea();
	public abstract double calcolaPerimetro();
	
	@Override
	public String toString() {
		return "Forma []";
	}
}
