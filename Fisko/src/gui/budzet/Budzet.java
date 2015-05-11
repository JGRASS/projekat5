package gui.budzet;

	import java.awt.EventQueue;

	import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import sistem.utils.UtilsBudzet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Graficka klasa za unos budzeta za odredjeni vremeski period
 * 
 * @author Ana
 *
 */
	public class Budzet extends JFrame {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JLabel lblIznos;
		private JTextField textFieldznosBudzet;
		private JLabel lblPeriod;
		private JComboBox comboBox;
		private JButton btnPotvrdi;
		private JButton btnOdustani;

		/**
		 * Startovanje apliacije
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Budzet frame = new Budzet();
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
		public Budzet() {
			setTitle("Budzet");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 328, 129);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(new GridLayout(0, 2, 10, 7));
			contentPane.add(getLblPeriod());
			contentPane.add(getComboBox());
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
		 * Metoda vraca vrednost atributa LblPeriod
		 * @return vrednost atributa LblPeriod kao JLabel
		 */
		private JLabel getLblPeriod() {
			if (lblPeriod == null) {
				lblPeriod = new JLabel("Period (u danima)");
			}
			return lblPeriod;
		}
		/**
		 * Metoda vraca vrednost atributa ComboBox
		 * @return vrednost atributa ComboBox kao JComboBox
		 */
		private JComboBox getComboBox() {
			if (comboBox == null) {
				comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"7", "15", "30"}));
			}
			return comboBox;
		}
		/**
		 * Metoda vraca vrednost atributa BtnPotvrdi
		 * @return vrednost atributa BtnPotvrdi kao JButton
		 */
		private JButton getBtnPotvrdi() {
			if (btnPotvrdi == null) {
				btnPotvrdi = new JButton("Potvrdi");
				btnPotvrdi.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						proslediLimite();
						dispose();
					}
				});
			}
			return btnPotvrdi;
		}
		/**
		 * Metoda vraca vrednost atributa BtnOdustani
		 * @return vrednost atributa BtnOdustani kao JButton
		 */
		private JButton getBtnOdustani() {
			if (btnOdustani == null) {
				btnOdustani = new JButton("Odustani");
			}
			return btnOdustani;
		}
		
		/**
		 * Metoda koja vrednost atributa textFieldznosBudzet 
		 * prosledjuje kao ulazni parametar metodi postaviLimite klase UtilsBudzet
		 */
		public void proslediLimite (){
			double iznos = Double.parseDouble(textFieldznosBudzet.getText());
			UtilsBudzet.postaviLimite(iznos);
		}
	}

