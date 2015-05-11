package gui.troskovi;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import sistem.utils.UtilsTroskovi;

import java.awt.GridLayout;

/**
 * Graficka klasa za unos troska iz kategorije Edukacija
 * 
 * @author Ana
 *
 */
public class TroskoviEdukacija extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblIznos;
	private JTextField textFieldIznosEdu;
	private JButton btnGotovo;
	private JButton btnOdustani;
	private JLabel label;
	private JLabel label_1;

	/**
	 * Startovanje apliacije
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TroskoviEdukacija frame = new TroskoviEdukacija();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Kreiranje prozora
	 */
	public TroskoviEdukacija() {
		setTitle("Edukacija");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 220, 100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(new GridLayout(0, 2, 12, 0));
		contentPane.add(getLblIznos());
		contentPane.add(getTextField_1());
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
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
		if (textFieldIznosEdu == null) {
			textFieldIznosEdu = new JTextField();
			textFieldIznosEdu.setBounds(10, 36, 196, 23);
			textFieldIznosEdu.setColumns(10);
		}
		return textFieldIznosEdu;
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
	 * Metoda vraca vrednost atributa Label
	 * @return vrednost atributa Label kao JLabel
	 */
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
		}
		return label;
	}
	/**
	 * Metoda vraca vrednost atributa Label_1
	 * @return vrednost atributa Label_1 kao JLabel
	 */
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("");
		}
		return label_1;
	}
	/**
	 * Metoda koja vrednost atributa textFieldIznosEdu prosledjuje kao ulazni parametar
	 * metodi napraviObjekatEdu klase UtilsTroskovi
	 */
	public void napraviObjekat(){
		UtilsTroskovi.napraviObjekatEdu(textFieldIznosEdu);
	}
}
