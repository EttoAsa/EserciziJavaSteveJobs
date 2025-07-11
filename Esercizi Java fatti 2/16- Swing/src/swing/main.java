package swing;


import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Studente> studenti = new ArrayList<>();
        ArrayList<Docente> docenti = new ArrayList<>();

        new ManagePersone(studenti, docenti);
    }
}
