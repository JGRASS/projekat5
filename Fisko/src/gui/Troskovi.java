package gui;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;

public class Troskovi extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnGotovo;
	private JButton btnOdustani;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 193, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 10, 7));
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getBtnNewButton_4());
		contentPane.add(getBtnNewButton_5());
		contentPane.add(getBtnNewButton_6());
		contentPane.add(getBtnNewButton_7());
		contentPane.add(getBtnNewButton_8());
		contentPane.add(getBtnNewButton_9());
		contentPane.add(getBtnGotovo());
		contentPane.add(getBtnOdustani());
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Hrana i pi\u0107e");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviHranaProzor();
				}
			});
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Ode\u0107a i obu\u0107a");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviOdecaiObucaProzor();
				}
			});
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Briga o sebi");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviBrigaOSebi();
				}
			});
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("Tro\u0161kovi \r\nstanovanja");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviStanovanja();
				}
			});
		}
		return btnNewButton_3;
	}
	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("Mese\u010Dni ra\u010Duni");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviMesecniRacuni();
				}
			});
		}
		return btnNewButton_4;
	}
	private JButton getBtnNewButton_5() {
		if (btnNewButton_5 == null) {
			btnNewButton_5 = new JButton("Sport i rekreacija");
			btnNewButton_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviSportIRekreacija();
				}
			});
		}
		return btnNewButton_5;
	}
	private JButton getBtnNewButton_6() {
		if (btnNewButton_6 == null) {
			btnNewButton_6 = new JButton("Prevoz");
			btnNewButton_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviPrevoz();
				}
			});
		}
		return btnNewButton_6;
	}
	private JButton getBtnNewButton_7() {
		if (btnNewButton_7 == null) {
			btnNewButton_7 = new JButton("Edukacija");
			btnNewButton_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviEdukacija();
				}
			});
		}
		return btnNewButton_7;
	}
	private JButton getBtnNewButton_8() {
		if (btnNewButton_8 == null) {
			btnNewButton_8 = new JButton("Izlasci");
			btnNewButton_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviIzlasci();
				}
			});
		}
		return btnNewButton_8;
	}
	private JButton getBtnNewButton_9() {
		if (btnNewButton_9 == null) {
			btnNewButton_9 = new JButton("Luksuz");
			btnNewButton_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziTroskoviLuksuz();
				}
			});
		}
		return btnNewButton_9;
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
			btnGotovo.setBackground(SystemColor.activeCaption);
		}
		return btnGotovo;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBackground(SystemColor.activeCaption);
		}
		return btnOdustani;
	}
}
