package gui.troskovi;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import sistem.utils.UtilsTroskovi;
import troskovi.BrigaOSebi;
import troskovi.Edukacija;
import troskovi.HranaIPice;
import troskovi.Izlasci;
import troskovi.Luksuz;
import troskovi.MesecniRacuni;
import troskovi.OdecaIObuca;
import troskovi.Prevoz;
import troskovi.SportIRekreacija;

import java.awt.SystemColor;

import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JTextField;

public class Troskovi extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnHranaIPice;
	private JButton btnOdecaIObuca;
	private JButton btnBrigaOSebi;
	private JButton btnTroskoviStanovanja;
	private JButton btnMesecniRacuni;
	private JButton btnSportIRekreacija;
	private JButton btnPrevoz;
	private JButton btnEdukacija;
	private JButton btnIzlasci;
	private JButton btnLuksuz;
	private JButton btnGotovo;
	private JButton btnOdustani;
	private JPanel panel;
	private JButton btnPotvrdi;
	public static GregorianCalendar date;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Troskovi frame = new Troskovi();
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
	public Troskovi() {
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
		contentPane.add(getBtnOdustani());
	}

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
	
	private void prikaziTroskoviHranaProzor() {
		TroskoviHrana prozor = new TroskoviHrana ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	
	private void prikaziTroskoviBrigaOSebi() {
		TroskoviBrigaOSebi prozor = new TroskoviBrigaOSebi ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	private void prikaziTroskoviStanovanja() {
		TroskoviStanovanja prozor = new TroskoviStanovanja ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	private void prikaziTroskoviOdecaiObucaProzor() {
		TroskoviOdecaiObuca prozor = new TroskoviOdecaiObuca ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	private void prikaziTroskoviMesecniRacuni() {
		TroskoviMesecniRacuni prozor = new TroskoviMesecniRacuni ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	private void prikaziTroskoviSportIRekreacija() {
		TroskoviSportIRekreacija prozor = new TroskoviSportIRekreacija ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	private void prikaziTroskoviPrevoz() {
		TroskoviPrevoz prozor = new TroskoviPrevoz ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	private void prikaziTroskoviEdukacija() {
		TroskoviEdukacija prozor = new TroskoviEdukacija ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	private void prikaziTroskoviIzlasci() {
		TroskoviIzlasci prozor = new TroskoviIzlasci ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	private void prikaziTroskoviLuksuz() {
		TroskoviLuksuz prozor = new TroskoviLuksuz ();
		prozor.setLocationRelativeTo(contentPane);
		prozor.setVisible(true);
	}
	private JButton getBtnGotovo() {
		if (btnGotovo == null) {
			btnGotovo = new JButton("Gotovo");
			btnGotovo.setEnabled(false);
			btnGotovo.setBackground(SystemColor.activeCaption);
		}
		return btnGotovo;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.setEnabled(false);
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBackground(SystemColor.activeCaption);
		}
		return btnOdustani;
	}
	
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getBtnPotvrdi());
		}
		return panel;
	}
	private JButton getBtnPotvrdi() {
		if (btnPotvrdi == null) {
			btnPotvrdi = new JButton("Postavi datum");
			btnPotvrdi.setBounds(12, 0, 159, 18);
			btnPotvrdi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					btnBrigaOSebi.setEnabled(true);
					btnEdukacija.setEnabled(true);
					btnGotovo.setEnabled(true);
					btnHranaIPice.setEnabled(true);
					btnIzlasci.setEnabled(true);
					btnLuksuz.setEnabled(true);
					btnMesecniRacuni.setEnabled(true);
					btnOdecaIObuca.setEnabled(true);
					btnOdustani.setEnabled(true);
					btnPotvrdi.setEnabled(true);
					btnPrevoz.setEnabled(true);
					btnSportIRekreacija.setEnabled(true);
					btnTroskoviStanovanja.setEnabled(true);
					date = new GregorianCalendar();
				}
			});
		}
		return btnPotvrdi;
	}
}
