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

public class TroskoviIzlasci extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblIznos;
	private JTextField textFieldNazivIzlasci;
	private JButton btnGotovo;
	private JButton btnOdustani;
	private JLabel label;
	private JLabel label_1;
	private JLabel lblNewLabel;
	private JTextField textFieldIznosIzlasci;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TroskoviIzlasci frame = new TroskoviIzlasci();
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
	public TroskoviIzlasci() {
		setTitle("Izlasci");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 231, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(new GridLayout(0, 2, 12, 0));
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblIznos());
		contentPane.add(getTextField_1());
		contentPane.add(getTextField_1_1());
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
		contentPane.add(getBtnGotovo());
		contentPane.add(getBtnOdustani());}

	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(10, 11, 55, 14);
		}
		return lblIznos;
	}
	private JTextField getTextField_1() {
		if (textFieldNazivIzlasci == null) {
			textFieldNazivIzlasci = new JTextField();
			textFieldNazivIzlasci.setBounds(10, 36, 196, 23);
			textFieldNazivIzlasci.setColumns(10);
		}
		return textFieldNazivIzlasci;
	}
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
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("");
		}
		return label_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Naziv");
		}
		return lblNewLabel;
	}
	private JTextField getTextField_1_1() {
		if (textFieldIznosIzlasci == null) {
			textFieldIznosIzlasci = new JTextField();
			textFieldIznosIzlasci.setColumns(10);
		}
		return textFieldIznosIzlasci;
	}
	
	public void napraviObjekat(){
		UtilsTroskovi.napraviObjekatHr(textFieldNazivIzlasci, textFieldIznosIzlasci);
	}
}
