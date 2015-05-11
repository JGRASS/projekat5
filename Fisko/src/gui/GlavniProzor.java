package gui;

import gui.budzet.BudzetGUI;
import gui.troskovi.Troskovi;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Graficka klasa koja predstavlja glavni prozor aplikacije
 * 
 * @author Ana
 *
 */
public class GlavniProzor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * privatni panel
	 */
	private JPanel contentPane;
	
	/**
	 * privatni natpis sa sloganom aplikacije
	 */
	private JLabel lblFiskoVa;
	
	/**
	 * privatni panel
	 */
	private JPanel panel;
	
	/**
	 * privatno dugme koje vodi
	 * ka prozoru za unos budzeta
	 */
	private JButton btnBudget;
	
	/**
	 * privatno dugme koje vodi
	 * ka prozoru za unos troskova
	 */
	private JButton btnTroskovi;
	
	/**
	 * privatno dugme koje vodi
	 * ka prozoru za prikaz izvestaja
	 * i statistike
	 */
	private JButton btnStatistika;
	
	/**
	 * privatno natpis sa imenima
	 * programera aplikacije
	 */
	private JLabel lblCopyrightByAna;
	
	/**
	 * privatni natpis sa imenom
	 * idejnog tvorca aplikacije
	 */
	private JLabel lblIdejniTvoracJakov;

	/**
	 * Kreiranje prozora
	 */

	public GlavniProzor() {
		setResizable(false);
		setTitle("Fisko");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 129);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getLblFiskoVa(), BorderLayout.NORTH);
		contentPane.add(getPanel(), BorderLayout.CENTER);
	}
	/**
	 * Metoda vraca vrednost atributa LblFiskoVa
	 * @return vrednost atributa LblFiskoVa kao JLabel
	 */
	private JLabel getLblFiskoVa() {
		if (lblFiskoVa == null) {
			lblFiskoVa = new JLabel("Va\u0161 finansijski planer");
			lblFiskoVa.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblFiskoVa;
	}
	/**
	 * Metoda vraca vrednost atributa Panel
	 * @return vrednost atributa Panel kao JPanel
	 */
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getBtnBudget());
			panel.add(getBtnTroskovi());
			panel.add(getBtnStatistika());
			panel.add(getLblCopyrightByAna());
			panel.add(getLblIdejniTvoracJakov());
		}
		return panel;
	}
	
	/**
	 * Metoda vraca vrednost atributa BtnBudget
	 * @return vrednost atributa BtnBudget kao JButton
	 */
	private JButton getBtnBudget() {
		if (btnBudget == null) {
			btnBudget = new JButton("Bud\u017Eet");
			btnBudget.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziBudzetProzor();
				}
			});
		}
		return btnBudget;
	}
	/**
	 * Metoda vraca vrednost atributa BtnTroskovi
	 * @return vrednost atributa BtnTroskovi kao JButton
	 */
	private JButton getBtnTroskovi() {
		if (btnTroskovi == null) {
			btnTroskovi = new JButton("Tro\u0161kovi");
			btnTroskovi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviProzor();
				}
			});
		}
		return btnTroskovi;
	}
	/**
	 * Metoda vraca vrednost atributa BtnStatistika
	 * @return vrednost atributa BtnStatistika kao JButton
	 */
	private JButton getBtnStatistika() {
		if (btnStatistika == null) {
			btnStatistika = new JButton("Statistika");
			btnStatistika.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Statistika stat = new Statistika();
					stat.setLocationRelativeTo(contentPane);
					stat.setVisible(true);
				}
			});
		}
		return btnStatistika;
	}
	
	/**
	 * Metoda koja omogucava vidljivost prozora Budzet
	 */
	private void prikaziBudzetProzor() {
		BudzetGUI prozor = new BudzetGUI ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
}
	/**
	 * Metoda koja omogucava vidljivost prozora Troskovi
	 */
	private void prikaziTroskoviProzor() {
		Troskovi prozor = new Troskovi ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	
	/**
	 * privatna metoda koja kreira novi natpis
	 * @return jlabel sa imenom programera aplikacije
	 */
	private JLabel getLblCopyrightByAna() {
		if (lblCopyrightByAna == null) {
			lblCopyrightByAna = new JLabel("Copyright by Ana & Putnich");
		}
		return lblCopyrightByAna;
	}
	
	/**
	 * privatna metoda koja kreira novi natpis
	 * @return jlabel sa imenom idejnog tvorca aplikacije
	 */
	private JLabel getLblIdejniTvoracJakov() {
		if (lblIdejniTvoracJakov == null) {
			lblIdejniTvoracJakov = new JLabel("Idejni tvorac: Jakov");
		}
		return lblIdejniTvoracJakov;
	}
}
