
package ohtu;

import javax.swing.JTextField;


public class Summa implements Komento {

    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private int syote;
    private int vanhaTulos;
    
    
    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }
    
    

    @Override
    public void suorita() {
        this.vanhaTulos = sovellus.tulos();
        try {
            syote = Integer.parseInt(syotekentta.getText());
        } catch (Exception e) {
        }
        sovellus.plus(syote);
        int laskunTulos = sovellus.tulos();
        System.out.println(laskunTulos);
        syotekentta.setText("");
        tuloskentta.setText("" + laskunTulos);
        
    }

    @Override
    public void peru() {
        sovellus.setTulos(vanhaTulos);
        tuloskentta.setText("" +vanhaTulos);
        
    }

}
