package gui.troskovi;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.SystemColor;

import java.util.GregorianCalendar;



/**
 * Graficka klasa koja omogucava izbor kategorije troskova 
 * za koju zelimo uneti trosak
 * 
 * @author Ana
 *
 */
public class TroskoviGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * privatni pane;
	 */
	private JPanel contentPane;
	
	/**
	 * privatno dugme koje vodi na prozor
	 * za dodavanje troska za hranu i pice
	 */
	private JButton btnHranaIPice;
	
	/**
	 * privatno dugme koje vodi na prozor
	 * za dodavanje troska odeca i obuca
	 */
	private JButton btnOdecaIObuca;
	
	/**
	 * privatno dugme koje vodi na prozor
	 * za dodavanje troska briga o sebi
	 */
	private JButton btnBrigaOSebi;
	
	/**
	 * privatno dugme koje vodi na prozor
	 * za dodavanje troska stanovanja
	 */
	private JButton btnTroskoviStanovanja;
	
	/**
	 * privatno dugme koje vodi na prozor 
	 * za dodavanje troska mesecnih racuna
	 */
	private JButton btnMesecniRacuni;
	
	/**
	 * privatni atribut koji vodi na prozor
	 * za dodavanje troska sporta i 
	 * rekreacije
	 */
	private JButton btnSportIRekreacija;
	
	/**
	 * privatno dugme koje vodi na prozor
	 * za dodavanje troska prevoza
	 */
	private JButton btnPrevoz;
	
	/**
	 * privatno dugme koje vodi na prozor
	 * za dodavanje troska edukacije
	 */
	private JButton btnEdukacija;
	
	/**
	 * privatno dugme koje vodi na prozor
	 * za dodavanje troska izlazaka
	 */
	private JButton btnIzlasci;
	
	/**
	 * privatno dugme koje vodi na prozor
	 * za dodavanje troska luksuza
	 */
	private JButton btnLuksuz;
	
	/**
	 * privatno dugme za potvrdjivanje akcije
	 * i upisivanja troskova
	 */
	private JButton btnGotovo;
	
	/**
	 * privatni panel
	 */
	private JPanel panel;
	
	/**
	 * privatno dugme za postavljanje trenutnog datuma
	 */
	private JButton btnCal;
	
	/**
	 * staticka vrednost kalendara, tj. 
	 * datuma koji se postavlja
	 */
	public static GregorianCalendar date;

	/**
	 * Kreiranje prozora
	 */
	public TroskoviGUI() {
		setTitle("Troškovi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 193, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 10, 7));
		contentPane.add(getPanel());
		contentPane.add(getBtnHranaIPice());
		contentPane.add(getBtnOdecaIObuca());
		contentPane.add(getBtnBrigaOSebi());
		contentPane.add(getBtnTroskoviStanovanja());
		contentPane.add(getBtnMesecniRacuni());
		contentPane.add(getBtnSportIRekreacija());
		contentPane.add(getBtnPrevoz());
		contentPane.add(getBtnEdukacija());
		contentPane.add(getBtnIzlasci());
		contentPane.add(getBtnLuksuz());
		contentPane.add(getBtnGotovo());
	}

	/**
	 * Metoda vraca vrednost atributa BtnHranaIPice
	 * @return vrednost atributa BtnHranaIPice kao JButton
	 */
	private JButton getBtnHranaIPice() {
		if (btnHranaIPice == null) {
			btnHranaIPice = new JButton("Hrana i pi\u0107e");
			btnHranaIPice.setEnabled(false);
			btnHranaIPice.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviHranaProzor();
				}
			});
		}
		return btnHranaIPice;
	}
	/**
	 * Metoda vraca vrednost atributa BtnOdecaIObuca
	 * @return vrednost atributa BtnOdecaIObuca kao JButton
	 */
	private JButton getBtnOdecaIObuca() {
		if (btnOdecaIObuca == null) {
			btnOdecaIObuca = new JButton("Ode\u0107a i obu\u0107a");
			btnOdecaIObuca.setEnabled(false);
			btnOdecaIObuca.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviOdecaiObucaProzor();
				}
			});
		}
		return btnOdecaIObuca;
	}
	/**
	 * Metoda vraca vrednost atributa BtnBrigaOSebi
	 * @return vrednost atributa BtnBrigaOSebi kao JButton
	 */
	private JButton getBtnBrigaOSebi() {
		if (btnBrigaOSebi == null) {
			btnBrigaOSebi = new JButton("Briga o sebi");
			btnBrigaOSebi.setEnabled(false);
			btnBrigaOSebi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviBrigaOSebi();
				}
			});
		}
		return btnBrigaOSebi;
	}
	/**
	 * Metoda vraca vrednost atributa BtnTroskoviStanovanja
	 * @return vrednost atributa BtnTroskoviStanovanja kao JButton
	 */
	private JButton getBtnTroskoviStanovanja() {
		if (btnTroskoviStanovanja == null) {
			btnTroskoviStanovanja = new JButton("Tro\u0161kovi \r\nstanovanja");
			btnTroskoviStanovanja.setEnabled(false);
			btnTroskoviStanovanja.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviStanovanja();
				}
			});
		}
		return btnTroskoviStanovanja;
	}
	/**
	 * Metoda vraca vrednost atributa BtnMesecniRacuni
	 * @return vrednost atributa BtnMesecniRacuni kao JButton
	 */
	private JButton getBtnMesecniRacuni() {
		if (btnMesecniRacuni == null) {
			btnMesecniRacuni = new JButton("Mese\u010Dni ra\u010Duni");
			btnMesecniRacuni.setEnabled(false);
			btnMesecniRacuni.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviMesecniRacuni();
				}
			});
		}
		return btnMesecniRacuni;
	}
	/**
	 * Metoda vraca vrednost atributa BtnSportIRekreacija
	 * @return vrednost atributa BtnSportIRekreacija kao JButton
	 */
	private JButton getBtnSportIRekreacija() {
		if (btnSportIRekreacija == null) {
			btnSportIRekreacija = new JButton("Sport i rekreacija");
			btnSportIRekreacija.setEnabled(false);
			btnSportIRekreacija.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviSportIRekreacija();
				}
			});
		}
		return btnSportIRekreacija;
	}
	/**
	 * Metoda vraca vrednost atributa BtnPrevoz
	 * @return vrednost atributa BtnPrevoz kao JButton
	 */
	private JButton getBtnPrevoz() {
		if (btnPrevoz == null) {
			btnPrevoz = new JButton("Prevoz");
			btnPrevoz.setEnabled(false);
			btnPrevoz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviPrevoz();
				}
			});
		}
		return btnPrevoz;
	}
	/**
	 * Metoda vraca vrednost atributa BtnEdukacija
	 * @return vrednost atributa BtnEdukacija kao JButton
	 */
	private JButton getBtnEdukacija() {
		if (btnEdukacija == null) {
			btnEdukacija = new JButton("Edukacija");
			btnEdukacija.setEnabled(false);
			btnEdukacija.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviEdukacija();
				}
			});
		}
		return btnEdukacija;
	}
	/**
	 * Metoda vraca vrednost atributa BtnIzlasci
	 * @return vrednost atributa BtnIzlasci kao JButton
	 */
	private JButton getBtnIzlasci() {
		if (btnIzlasci == null) {
			btnIzlasci = new JButton("Izlasci");
			btnIzlasci.setEnabled(false);
			btnIzlasci.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviIzlasci();
				}
			});
		}
		return btnIzlasci;
	}
	/**
	 * Metoda vraca vrednost atributa BtnLuksuz
	 * @return vrednost atributa BtnLuksuz kao JButton
	 */
	private JButton getBtnLuksuz() {
		if (btnLuksuz == null) {
			btnLuksuz = new JButton("Luksuz");
			btnLuksuz.setEnabled(false);
			btnLuksuz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviLuksuz();
				}
			});
		}
		return btnLuksuz;
	}
	/**
	 * Metoda koja omogucava vidljivost prozora TroskoviHrana
	 */
	private void prikaziTroskoviHranaProzor() {
		TroskoviHrana prozor = new TroskoviHrana ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	/**
	 * Metoda koja omogucava vidljivost prozora TroskoviBrigaOSebi
	 */
	private void prikaziTroskoviBrigaOSebi() {
		TroskoviBrigaOSebi prozor = new TroskoviBrigaOSebi ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	/**
	 * Metoda koja omogucava vidljivost prozora TroskoviStanovanja
	 */
	private void prikaziTroskoviStanovanja() {
		TroskoviStanovanja prozor = new TroskoviStanovanja ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	/**
	 * Metoda koja omogucava vidljivost prozora TroskoviOdecaiObuca
	 */
	private void prikaziTroskoviOdecaiObucaProzor() {
		TroskoviOdecaiObuca prozor = new TroskoviOdecaiObuca ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	/**
	 * Metoda koja omogucava vidljivost prozora TroskoviMesecniRacuni
	 */
	private void prikaziTroskoviMesecniRacuni() {
		TroskoviMesecniRacuni prozor = new TroskoviMesecniRacuni ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	/**
	 * Metoda koja omogucava vidljivost prozora TroskoviSportIRekreacija
	 */
	private void prikaziTroskoviSportIRekreacija() {
		TroskoviSportIRekreacija prozor = new TroskoviSportIRekreacija ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	/**
	 * Metoda koja omogucava vidljivost prozora TroskoviPrevoz
	 */
	private void prikaziTroskoviPrevoz() {
		TroskoviPrevoz prozor = new TroskoviPrevoz ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	/**
	 * Metoda koja omogucava vidljivost prozora TroskoviEdukacija
	 */
	private void prikaziTroskoviEdukacija() {
		TroskoviEdukacija prozor = new TroskoviEdukacija ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	/**
	 * Metoda koja omogucava vidljivost prozora TroskoviIzlasci
	 */
	private void prikaziTroskoviIzlasci() {
		TroskoviIzlasci prozor = new TroskoviIzlasci ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	/**
	 * Metoda koja omogucava vidljivost prozora TroskoviLuksuz
	 */
	private void prikaziTroskoviLuksuz() {
		TroskoviLuksuz prozor = new TroskoviLuksuz ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	/**
	 * Metoda vraca vrednost atributa BtnGotovo
	 * @return vrednost atributa BtnGotovo kao JButton
	 */
	private JButton getBtnGotovo() {
		if (btnGotovo == null) {
			btnGotovo = new JButton("Gotovo");
			btnGotovo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnGotovo.setEnabled(false);
			btnGotovo.setBackground(SystemColor.activeCaption);
		}
		return btnGotovo;
	}
	
	/**
	 * Metoda vraca vrednost atributa Panel
	 * @return vrednost atributa Panel kao JPanel
	 */
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getBtnPotvrdi());
		}
		return panel;
	}
	/**
	 * Metoda vraca vrednost atributa BtnCal
	 * @return vrednost atributa BtnCal kao JButton
	 */
	private JButton getBtnPotvrdi() {
		if (btnCal == null) {
			btnCal = new JButton("Postavi datum");
			btnCal.setBounds(12, 0, 159, 18);
			btnCal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					btnBrigaOSebi.setEnabled(true);
					btnEdukacija.setEnabled(true);
					btnGotovo.setEnabled(true);
					btnHranaIPice.setEnabled(true);
					btnIzlasci.setEnabled(true);
					btnLuksuz.setEnabled(true);
					btnMesecniRacuni.setEnabled(true);
					btnOdecaIObuca.setEnabled(true);
					btnCal.setEnabled(true);
					btnPrevoz.setEnabled(true);
					btnSportIRekreacija.setEnabled(true);
					btnTroskoviStanovanja.setEnabled(true);
					date = new GregorianCalendar();
				}
			});
		}
		return btnCal;
	}
}
