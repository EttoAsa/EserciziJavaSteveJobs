package pila;

public class main {

	public static void main(String[] args) {
		Browser Edge = new Browser();
		
		Edge.visitPage("https://www.google.com/");
		Edge.visitPage("https://www.opera.com/");
		Edge.visitPage("https://www.brave.com/");
		
		
		Edge.prevPage();
		
		Edge.stampaCronologia();
		
		Edge.goBack();
		Edge.goBack();
		Edge.goBack();
		Edge.goBack();
		
	}

}
