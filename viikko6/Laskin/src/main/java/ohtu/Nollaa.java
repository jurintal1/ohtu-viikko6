package ohtu;

import javax.swing.JTextField;

public class Nollaa implements Komento {

    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private int syote;
    private int vanhaTulos;

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        this.vanhaTulos = sovellus.tulos();
        sovellus.nollaa();
        tuloskentta.setText("0");
    }

    @Override
    public void peru() {
        sovellus.setTulos(vanhaTulos);
        tuloskentta.setText("" +vanhaTulos);
    }

}
