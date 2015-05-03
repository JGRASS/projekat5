package gui;

	import java.awt.EventQueue;

	import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;

	public class Budzet extends JFrame {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JLabel lblHranaIPie;
		private JTextField textFieldHrana;
		private JLabel lblOdeaIObua;
		private JTextField textFieldOdeca;
		private JLabel lblBrigaOSebi;
		private JTextField textFieldBriga;
		private JLabel lblTrokoviStanovanja;
		private JTextField textFieldStanovanje;
		private JLabel lblMeseniRauni;
		private JTextField textFieldMesecni;
		private JLabel lblSportIRekreacija;
		private JTextField textFieldRekreacija;
		private JLabel lblPrevoz;
		private JTextField textFieldPrevoz;
		private JLabel lblEdukacija;
		private JTextField textFieldEdukacija;
		private JLabel lblIzlasci;
		private JTextField textFieldIzlasci;
		private JLabel lblLuksuz;
		private JTextField textFieldLuksuz;

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
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(new GridLayout(0, 2, 10, 7));
			contentPane.add(getLblHranaIPie());
			contentPane.add(getTextFieldHrana());
			contentPane.add(getLblOdeaIObua());
			contentPane.add(getTextFieldOdeca());
			contentPane.add(getLblBrigaOSebi());
			contentPane.add(getTextFieldBriga());
			contentPane.add(getLblTrokoviStanovanja());
			contentPane.add(getTextFieldStanovanje());
			contentPane.add(getLblMeseniRauni());
			contentPane.add(getTextFieldMesecni());
			contentPane.add(getLblSportIRekreacija());
			contentPane.add(getTextFieldRekreacija());
			contentPane.add(getLblPrevoz());
			contentPane.add(getTextFieldPrevoz());
			contentPane.add(getLblEdukacija());
			contentPane.add(getTextFieldEdukacija());
			contentPane.add(getLblIzlasci());
			contentPane.add(getTextFieldIzlasci());
			contentPane.add(getLblLuksuz());
			contentPane.add(getTextFieldLuksuz());
		}
		private JLabel getLblHranaIPie() {
			if (lblHranaIPie == null) {
				lblHranaIPie = new JLabel("Hrana i pi\u0107e");
			}
			return lblHranaIPie;
		}
		private JTextField getTextFieldHrana() {
			if (textFieldHrana == null) {
				textFieldHrana = new JTextField();
				textFieldHrana.setColumns(10);
			}
			return textFieldHrana;
		}
		private JLabel getLblOdeaIObua() {
			if (lblOdeaIObua == null) {
				lblOdeaIObua = new JLabel("Ode\u0107a i obu\u0107a");
			}
			return lblOdeaIObua;
		}
		private JTextField getTextFieldOdeca() {
			if (textFieldOdeca == null) {
				textFieldOdeca = new JTextField();
				textFieldOdeca.setColumns(10);
			}
			return textFieldOdeca;
		}
		private JLabel getLblBrigaOSebi() {
			if (lblBrigaOSebi == null) {
				lblBrigaOSebi = new JLabel("Briga o sebi");
			}
			return lblBrigaOSebi;
		}
		private JTextField getTextFieldBriga() {
			if (textFieldBriga == null) {
				textFieldBriga = new JTextField();
				textFieldBriga.setColumns(10);
			}
			return textFieldBriga;
		}
		private JLabel getLblTrokoviStanovanja() {
			if (lblTrokoviStanovanja == null) {
				lblTrokoviStanovanja = new JLabel("Tro\u0161kovi stanovanja");
			}
			return lblTrokoviStanovanja;
		}
		private JTextField getTextFieldStanovanje() {
			if (textFieldStanovanje == null) {
				textFieldStanovanje = new JTextField();
				textFieldStanovanje.setColumns(10);
			}
			return textFieldStanovanje;
		}
		private JLabel getLblMeseniRauni() {
			if (lblMeseniRauni == null) {
				lblMeseniRauni = new JLabel("Mese\u010Dni ra\u010Duni");
			}
			return lblMeseniRauni;
		}
		private JTextField getTextFieldMesecni() {
			if (textFieldMesecni == null) {
				textFieldMesecni = new JTextField();
				textFieldMesecni.setColumns(10);
			}
			return textFieldMesecni;
		}
		private JLabel getLblSportIRekreacija() {
			if (lblSportIRekreacija == null) {
				lblSportIRekreacija = new JLabel("Sport i rekreacija");
			}
			return lblSportIRekreacija;
		}
		private JTextField getTextFieldRekreacija() {
			if (textFieldRekreacija == null) {
				textFieldRekreacija = new JTextField();
				textFieldRekreacija.setColumns(10);
			}
			return textFieldRekreacija;
		}
		private JLabel getLblPrevoz() {
			if (lblPrevoz == null) {
				lblPrevoz = new JLabel("Prevoz");
			}
			return lblPrevoz;
		}
		private JTextField getTextFieldPrevoz() {
			if (textFieldPrevoz == null) {
				textFieldPrevoz = new JTextField();
				textFieldPrevoz.setColumns(10);
			}
			return textFieldPrevoz;
		}
		private JLabel getLblEdukacija() {
			if (lblEdukacija == null) {
				lblEdukacija = new JLabel("Edukacija");
			}
			return lblEdukacija;
		}
		private JTextField getTextFieldEdukacija() {
			if (textFieldEdukacija == null) {
				textFieldEdukacija = new JTextField();
				textFieldEdukacija.setColumns(10);
			}
			return textFieldEdukacija;
		}
		private JLabel getLblIzlasci() {
			if (lblIzlasci == null) {
				lblIzlasci = new JLabel("Izlasci");
			}
			return lblIzlasci;
		}
		private JTextField getTextFieldIzlasci() {
			if (textFieldIzlasci == null) {
				textFieldIzlasci = new JTextField();
				textFieldIzlasci.setColumns(10);
			}
			return textFieldIzlasci;
		}
		private JLabel getLblLuksuz() {
			if (lblLuksuz == null) {
				lblLuksuz = new JLabel("Luksuz");
			}
			return lblLuksuz;
		}
		private JTextField getTextFieldLuksuz() {
			if (textFieldLuksuz == null) {
				textFieldLuksuz = new JTextField();
				textFieldLuksuz.setColumns(10);
			}
			return textFieldLuksuz;
		}
	}

