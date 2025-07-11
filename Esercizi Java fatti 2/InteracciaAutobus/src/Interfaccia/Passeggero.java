package Interfaccia;

public class Passeggero implements UtenteAutobus {
 private String nome;
 private String cognome;
 private String codiceFiscale;
 private String destinazione;
 private boolean haBagaglio;

 public Passeggero(String nome, String cognome, String codiceFiscale, String destinazione, boolean haBagaglio) {
     this.nome = nome;
     this.cognome = cognome;
     this.codiceFiscale = codiceFiscale;
     this.destinazione = destinazione;
     this.haBagaglio = haBagaglio;
 }

 @Override
 public String getTipo() {
     return "Passeggero";
 }

 // Getters e Setters (omessi per brevità)
}