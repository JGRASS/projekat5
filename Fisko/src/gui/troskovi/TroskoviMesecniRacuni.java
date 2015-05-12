package gui.troskovi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import sistem.utils.UtilsObjekti;
import java.awt.GridLayout;
/**
 * Graficka klasa za unos troska iz kategorije Mesecni racuni
 * 
 * @author Ana
 *
 */
public class TroskoviMesecniRacuni extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * privatni panel
	 */
	private JPanel contentPane;
	
	/**
	 * privatni jlabel za iznos
	 */
	private JLabel lblIznos;
	
	/**
	 * privatni textField za iznos
	 * troska mesecnih racuna
	 */
	private JTextField textFieldIznosMesRacuni;
	
	/**
	 * privatno dugme za potvrdjivanje akcije
	 */
	private JButton btnGotovo;
	
	/**
	 * privatno dugme za odustajanje od akcije
	 */
	private JButton btnOdustani;

	/**
	 * Kreiranje prozora
	 */
	public TroskoviMesecniRacuni() {
		setTitle("Mesecni racuni");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 240, 100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(new GridLayout(0, 2, 20, 10));
		contentPane.add(getLblIznos());
		contentPane.add(getTextField_1());
		contentPane.add(getBtnGotovo());
		contentPane.add(getBtnOdustani());}

	/**
	 * Metoda vraca vrednost atributa LblIznos
	 * @return vrednost atributa LblIznos kao JLabel
	 */
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(10, 11, 55, 14);
		}
		return lblIznos;
	}
	/**
	 * Metoda vraca vrednost atributa TextField_1
	 * @return vrednost atributa TextField_1 kao JTextField
	 */
	private JTextField getTextField_1() {
		if ( textFieldIznosMesRacuni == null) {
			 textFieldIznosMesRacuni = new JTextField();
			 textFieldIznosMesRacuni.setBounds(10, 36, 196, 23);
			 textFieldIznosMesRacuni.setColumns(10);
		}
		return textFieldIznosMesRacuni;
	}
	/**
	 * Metoda vraca vrednost atributa BtnGotovo
	 * @return vrednost atributa BtnGotovo kao JButton
	 */
	private JButton getBtnGotovo() {
		if (btnGotovo == null) {
			btnGotovo = new JButton("Gotovo");
			btnGotovo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					napraviObjekat();
					dispose();
				}
			});
			btnGotovo.setBounds(10, 70, 84, 23);
		}
		return btnGotovo;
	}
	/**
	 * Metoda vraca vrednost atributa BtnOdustani
	 * @return vrednost atributa BtnOdustani kao JButton
	 */
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(93, 70, 113, 23);
		}
		return btnOdustani;
	}
	/**
	 * Metoda koja vrednost atributa textFieldIznosMesRacuni prosledjuje kao ulazni parametar
	 * metodi napraviObjekatMesRacuni klase UtilsTroskovi
	 */
	public void napraviObjekat(){
		UtilsObjekti.napraviObjekatMesRacuni(textFieldIznosMesRacuni);
	}
}
