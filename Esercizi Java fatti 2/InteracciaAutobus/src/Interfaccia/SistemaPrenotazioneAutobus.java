package Interfaccia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SistemaPrenotazioneAutobus extends JFrame {

    private static final int CAPIENZA_MASSIMA_PASSEGGERI = 20;
    private static final int CAPIENZA_MASSIMA_AUTISTI = 2;

    private List<UtenteAutobus> utentiABordo;

    private int postiPasseggeroRimanenti = CAPIENZA_MASSIMA_PASSEGGERI;
    private int postiAutistaRimanenti = CAPIENZA_MASSIMA_AUTISTI;

    private JLabel labelPasseggeri;
    private JLabel labelAutisti;
    private JButton bottoneAggiungiPasseggero;
    private JButton bottoneAggiungiAutista;

    public SistemaPrenotazioneAutobus() {
        super("Sistema Prenotazione Autobus");
        utentiABordo = new ArrayList<>();

        labelPasseggeri = new JLabel("Passeggeri rimanenti: " + postiPasseggeroRimanenti);
        labelAutisti = new JLabel("Autisti rimanenti: " + postiAutistaRimanenti);
        bottoneAggiungiPasseggero = new JButton("Aggiungi Passeggero");
        bottoneAggiungiAutista = new JButton("Aggiungi Autista");

        setLayout(new GridLayout(4, 1, 10, 10));

        Font font = new Font("Arial", Font.BOLD, 16);
        labelPasseggeri.setFont(font);	
        labelPasseggeri.setHorizontalAlignment(SwingConstants.CENTER);
        labelAutisti.setFont(font);
        labelAutisti.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panelPulsanti = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panelPulsanti.add(bottoneAggiungiPasseggero);
        panelPulsanti.add(bottoneAggiungiAutista);

        add(labelPasseggeri);
        add(labelAutisti);
        add(panelPulsanti);

        bottoneAggiungiPasseggero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    aggiungiPasseggero();
                } catch (PostiEsauritiPasseggeroException ex) {
                    JOptionPane.showMessageDialog(SistemaPrenotazioneAutobus.this, ex.getMessage(), "Errore", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        bottoneAggiungiAutista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    aggiungiAutista();
                } catch (PostiEsauritiAutistaException ex) {
                    JOptionPane.showMessageDialog(SistemaPrenotazioneAutobus.this, ex.getMessage(), "Errore", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void aggiungiPasseggero() throws PostiEsauritiPasseggeroException {
        if (postiPasseggeroRimanenti <= 0) {
            throw new PostiEsauritiPasseggeroException("Impossibile aggiungere un nuovo passeggero. Posti esauriti!");
        }
        Passeggero p = new Passeggero("Mario", "Rossi", "RSSMRA80A01H501U", "Roma", true);
        utentiABordo.add(p);
        postiPasseggeroRimanenti--;
        aggiornaEtichette();
        System.out.println("Aggiunto utente: " + p.getTipo());
    }

    private void aggiungiAutista() throws PostiEsauritiAutistaException {
        if (postiAutistaRimanenti <= 0) {
            throw new PostiEsauritiAutistaException("Impossibile aggiungere un nuovo autista. Posti esauriti!");
        }
        Autista a = new Autista("Giuseppe", "Verdi", "VRDGPP75B04F205Z", "D", 10);
        utentiABordo.add(a);
        postiAutistaRimanenti--;
        aggiornaEtichette();
        System.out.println("Aggiunto utente: " + a.getTipo());
    }

    private void aggiornaEtichette() {
        labelPasseggeri.setText("Passeggeri rimanenti: " + postiPasseggeroRimanenti);
        labelAutisti.setText("Autisti rimanenti: " + postiAutistaRimanenti);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SistemaPrenotazioneAutobus();
            }
        });
    }

}