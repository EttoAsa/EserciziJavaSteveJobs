package geometria;

public class Quadrato extends Forma{
	private double lato;

	public Quadrato(double lato) {
		this.lato = lato;
	}

	public double getLato() {
		return lato;
	}
	public void setLato(double lato) {
		this.lato = lato;
	}

	@Override
	public double calcolaArea() {
		double area;
		area = lato * lato;
		return area;
	}
	
	@Override
	public double calcolaPerimetro() {
		double perimetro;
		perimetro = lato * 4;
		return perimetro;
	}
	
	@Override
	public String toString() {
		return "Quadrato [lato=" + lato + "]";
	}
}
