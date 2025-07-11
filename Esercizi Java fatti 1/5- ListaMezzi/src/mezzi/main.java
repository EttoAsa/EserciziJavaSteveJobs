package mezzi;

public class main {

	public static void main(String[] args) {
		Macchina m1 = new Macchina("Fiat", "Verde", 120, 5);
		Autobus b1 = new Autobus("Solaris", "Grigio", 120, 50);
		Aereo a1 = new Aereo("ITA", "Bianco", 1200, 1000);
		System.out.println(m1.toString() + "\n" + b1.toString() + "\n" + a1.toString());
	}

}
