package Interfaccia;


public class Autista implements UtenteAutobus {
 private String nome;
 private String cognome;
 private String codiceFiscale;
 private String tipoPatente;
 private int anniDiEsperienza;

 public Autista(String nome, String cognome, String codiceFiscale, String tipoPatente, int anniDiEsperienza) {
     this.nome = nome;
     this.cognome = cognome;
     this.codiceFiscale = codiceFiscale;
     this.tipoPatente = tipoPatente;
     this.anniDiEsperienza = anniDiEsperienza;
 }

 @Override
 public String getTipo() {
     return "Autista";
 }

 // Getters e Setters (omessi per brevità)
}
