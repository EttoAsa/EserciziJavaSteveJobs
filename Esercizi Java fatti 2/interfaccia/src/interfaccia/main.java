package interfaccia;


public class main {

	public static void main(String[] args) {
		Auto_Ibrida macchina1 = new Auto_Ibrida(50);
		System.out.println("Carica della batteria " + macchina1.getBatteria() + "%");
		
		macchina1.ricarica();
		System.out.println("Carica della batteria " + macchina1.getBatteria() + "%");
		
		System.out.println("Lo stato del dispositivo: " + macchina1.isConnesso());
		macchina1.connetti();
		System.out.println("Lo stato del dispositivo è: " + macchina1.isConnesso());
		macchina1.disconnetti();
		System.out.println("Lo stato dispositivo è: " + macchina1.isConnesso());

	}

}

