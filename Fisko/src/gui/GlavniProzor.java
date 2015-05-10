package gui;

import gui.budzet.Budzet;
import gui.troskovi.Troskovi;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GlavniProzor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblFiskoVa;
	private JPanel panel;
	private JMenuBar menuBar;
	private JMenu mnPodeavanja;
	private JMenu mnONama;
	private JMenu mnPodaci;
	private JMenuItem mntmOtvoriIzvetaj;
	private JMenuItem mntmNewMenuItem;
	private JButton btnBudget;
	private JButton btnTroskovi;
	private JButton btnStatistika;
	private JMenu mnPomo;

	public GlavniProzor() {
		setResizable(false);
		setTitle("Fisko");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 116);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getLblFiskoVa(), BorderLayout.NORTH);
		contentPane.add(getPanel(), BorderLayout.CENTER);
	}
	private JLabel getLblFiskoVa() {
		if (lblFiskoVa == null) {
			lblFiskoVa = new JLabel("Va\u0161 finansijski planer");
			lblFiskoVa.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblFiskoVa;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getBtnBudget());
			panel.add(getBtnTroskovi());
			panel.add(getBtnStatistika());
		}
		return panel;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnPodaci());
			menuBar.add(getMnPodeavanja());
			menuBar.add(getMnONama());
			menuBar.add(getMnPomo());
		}
		return menuBar;
	}
	private JMenu getMnPodeavanja() {
		if (mnPodeavanja == null) {
			mnPodeavanja = new JMenu("Pode\u0161avanja");
		}
		return mnPodeavanja;
	}
	private JMenu getMnONama() {
		if (mnONama == null) {
			mnONama = new JMenu("O nama");
		}
		return mnONama;
	}
	private JMenu getMnPodaci() {
		if (mnPodaci == null) {
			mnPodaci = new JMenu("Podaci");
			mnPodaci.add(getMntmOtvoriIzvetaj());
			mnPodaci.add(getMntmNewMenuItem());
		}
		return mnPodaci;
	}
	private JMenuItem getMntmOtvoriIzvetaj() {
		if (mntmOtvoriIzvetaj == null) {
			mntmOtvoriIzvetaj = new JMenuItem("Otvori izve\u0161taj");
		}
		return mntmOtvoriIzvetaj;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("Sa\u010Duvaj izve\u0161taj");
		}
		return mntmNewMenuItem;
	}
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
	private JButton getBtnStatistika() {
		if (btnStatistika == null) {
			btnStatistika = new JButton("Statistika");
		}
		return btnStatistika;
	}
	private JMenu getMnPomo() {
		if (mnPomo == null) {
			mnPomo = new JMenu("Pomo\u0107");
		}
		return mnPomo;
	}
	
	private void prikaziBudzetProzor() {
		Budzet prozor = new Budzet ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
}
	private void prikaziTroskoviProzor() {
		Troskovi prozor = new Troskovi ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
}
