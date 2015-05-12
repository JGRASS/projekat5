package gui.budzet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import sistem.utils.UtilsBudzet;
import sistem.utils.UtilsTroskovi;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Graficka klasa za unos budzeta za odredjeni vremenski period
 * 
 * @author Ana
 *
 */
	public class BudzetGUI extends JFrame {

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
		 * privatni textField za unos iznosa budzeta
		 */
		private JTextField textFieldznosBudzet;
		
		/**
		 * privatno dugme za potvrdjivanje akcije
		 */
		private JButton btnPotvrdi;
		
		/**
		 * privatno dugme za odustajanje od akcije
		 */
		private JButton btnOdustani;

		/**
		 * Startovanje aplikacije
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						BudzetGUI frame = new BudzetGUI();
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
		public BudzetGUI() {
			setTitle("Budzet");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 257, 91);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(new GridLayout(0, 2, 10, 7));
			contentPane.add(getLblIznos());
			contentPane.add(getTextFieldznosBudzet());
			contentPane.add(getBtnPotvrdi());
			contentPane.add(getBtnOdustani());
		}
		
		/**
		 * Metoda vraca vrednost atributa LblIznos
		 * @return vrednost atributa LblIznos kao JLabel
		 */
		private JLabel getLblIznos() {
			if (lblIznos == null) {
				lblIznos = new JLabel("Iznos");
			}
			return lblIznos;
		}
		/**
		 * Metoda vraca vrednost atributa TextFieldznosBudzet
		 * @return vrednost atributa TextFieldznosBudzet kao JTextField
		 */
		private JTextField getTextFieldznosBudzet() {
			if (textFieldznosBudzet == null) {
				textFieldznosBudzet = new JTextField();
				textFieldznosBudzet.setColumns(10);
			}
			return textFieldznosBudzet;
		}
		/**
		 * Metoda vraca vrednost atributa BtnPotvrdi
		 * poziva metodu za prosledjivanje limita
		 * gasi prozor ukoliko je dugme kliknuto
		 * @return vrednost atributa BtnPotvrdi kao JButton
		 */
		private JButton getBtnPotvrdi() {
			if (btnPotvrdi == null) {
				btnPotvrdi = new JButton("Potvrdi");
				btnPotvrdi.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						proslediLimite();
						dispose();
						UtilsTroskovi.kreirajFajlove();
					}
				});
			}
			return btnPotvrdi;
		}
		/**
		 * Metoda vraca vrednost atributa BtnOdustani
		 * gasi prozor ukoliko je dugme kliknuto
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
			}
			return btnOdustani;
		}
		
		/**
		 * Metoda koja vrednost atributa textFieldznosBudzet 
		 * prosledjuje kao ulazni parametar metodi postaviLimite 
		 * klase UtilsBudzet
		 */
		public void proslediLimite (){
			double iznos = Double.parseDouble(textFieldznosBudzet.getText());
			UtilsBudzet.postaviLimite(iznos);
		}
	}

