package geometria;

public class Cerchio extends Forma{
	private double raggio;
	private double piGreco;
	
	public Cerchio(double raggio) {
		this.raggio = raggio;
		this.piGreco = 3.14;
	}
	
	public double getRaggio() {
		return raggio;
	}
	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}
	public double getPiGreco() {
		return piGreco;
	}
	public void setPiGreco(double piGreco) {
		this.piGreco = piGreco;
	}

	@Override
	public double calcolaArea() {
		double area;
		area = raggio * raggio * piGreco;
		return area;
	}
	
	@Override
	public double calcolaPerimetro() {
		double perimetro;
		perimetro = raggio * 2 * piGreco;
		return perimetro;
	}

	@Override
	public String toString() {
		return "Cerchio [raggio=" + raggio + ", piGreco=" + piGreco + "]";
	}
	
}
