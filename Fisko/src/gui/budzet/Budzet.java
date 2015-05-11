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
		 * Launch the application.
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
		 * Create the frame.
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
		private JLabel getLblIznos() {
			if (lblIznos == null) {
				lblIznos = new JLabel("Iznos");
			}
			return lblIznos;
		}
		private JTextField getTextFieldznosBudzet() {
			if (textFieldznosBudzet == null) {
				textFieldznosBudzet = new JTextField();
				textFieldznosBudzet.setColumns(10);
			}
			return textFieldznosBudzet;
		}
		private JLabel getLblPeriod() {
			if (lblPeriod == null) {
				lblPeriod = new JLabel("Period (u danima)");
			}
			return lblPeriod;
		}
		private JComboBox getComboBox() {
			if (comboBox == null) {
				comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"7", "15", "30"}));
			}
			return comboBox;
		}
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
		private JButton getBtnOdustani() {
			if (btnOdustani == null) {
				btnOdustani = new JButton("Odustani");
			}
			return btnOdustani;
		}
		
		public void proslediLimite (){
			double iznos = Double.parseDouble(textFieldznosBudzet.getText());
			UtilsBudzet.postaviLimite(iznos);
		}
	}

