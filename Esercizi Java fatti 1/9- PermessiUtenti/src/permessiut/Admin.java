package permessiut;


import java.util.ArrayList;

public class Admin extends Utente{

	public Admin(String username, String email) {
		super(username, email);
	}

	public ArrayList<String> getPermessi() {
		ArrayList<String> permessi = new ArrayList<>();
		permessi.add("READ");
		permessi.add("WRITE");
		permessi.add("DELETE");
		return permessi;
	}
}
