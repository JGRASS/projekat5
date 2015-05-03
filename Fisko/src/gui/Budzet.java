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
		private JTextField textField;
		private JLabel lblOdeaIObua;
		private JTextField textField_1;
		private JLabel lblBrigaOSebi;
		private JTextField textField_2;
		private JLabel lblTrokoviStanovanja;
		private JTextField textField_3;
		private JLabel lblMeseniRauni;
		private JTextField textField_4;
		private JLabel lblSportIRekreacija;
		private JTextField textField_5;
		private JLabel lblPrevoz;
		private JTextField textField_6;
		private JLabel lblEdukacija;
		private JTextField textField_7;
		private JLabel lblIzlasci;
		private JTextField textField_8;
		private JLabel lblLuksuz;
		private JTextField textField_9;

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
			contentPane.add(getTextField());
			contentPane.add(getLblOdeaIObua());
			contentPane.add(getTextField_1());
			contentPane.add(getLblBrigaOSebi());
			contentPane.add(getTextField_2());
			contentPane.add(getLblTrokoviStanovanja());
			contentPane.add(getTextField_3());
			contentPane.add(getLblMeseniRauni());
			contentPane.add(getTextField_4());
			contentPane.add(getLblSportIRekreacija());
			contentPane.add(getTextField_5());
			contentPane.add(getLblPrevoz());
			contentPane.add(getTextField_6());
			contentPane.add(getLblEdukacija());
			contentPane.add(getTextField_7());
			contentPane.add(getLblIzlasci());
			contentPane.add(getTextField_8());
			contentPane.add(getLblLuksuz());
			contentPane.add(getTextField_9());
		}
		private JLabel getLblHranaIPie() {
			if (lblHranaIPie == null) {
				lblHranaIPie = new JLabel("Hrana i pi\u0107e");
			}
			return lblHranaIPie;
		}
		private JTextField getTextField() {
			if (textField == null) {
				textField = new JTextField();
				textField.setColumns(10);
			}
			return textField;
		}
		private JLabel getLblOdeaIObua() {
			if (lblOdeaIObua == null) {
				lblOdeaIObua = new JLabel("Ode\u0107a i obu\u0107a");
			}
			return lblOdeaIObua;
		}
		private JTextField getTextField_1() {
			if (textField_1 == null) {
				textField_1 = new JTextField();
				textField_1.setColumns(10);
			}
			return textField_1;
		}
		private JLabel getLblBrigaOSebi() {
			if (lblBrigaOSebi == null) {
				lblBrigaOSebi = new JLabel("Briga o sebi");
			}
			return lblBrigaOSebi;
		}
		private JTextField getTextField_2() {
			if (textField_2 == null) {
				textField_2 = new JTextField();
				textField_2.setColumns(10);
			}
			return textField_2;
		}
		private JLabel getLblTrokoviStanovanja() {
			if (lblTrokoviStanovanja == null) {
				lblTrokoviStanovanja = new JLabel("Tro\u0161kovi stanovanja");
			}
			return lblTrokoviStanovanja;
		}
		private JTextField getTextField_3() {
			if (textField_3 == null) {
				textField_3 = new JTextField();
				textField_3.setColumns(10);
			}
			return textField_3;
		}
		private JLabel getLblMeseniRauni() {
			if (lblMeseniRauni == null) {
				lblMeseniRauni = new JLabel("Mese\u010Dni ra\u010Duni");
			}
			return lblMeseniRauni;
		}
		private JTextField getTextField_4() {
			if (textField_4 == null) {
				textField_4 = new JTextField();
				textField_4.setColumns(10);
			}
			return textField_4;
		}
		private JLabel getLblSportIRekreacija() {
			if (lblSportIRekreacija == null) {
				lblSportIRekreacija = new JLabel("Sport i rekreacija");
			}
			return lblSportIRekreacija;
		}
		private JTextField getTextField_5() {
			if (textField_5 == null) {
				textField_5 = new JTextField();
				textField_5.setColumns(10);
			}
			return textField_5;
		}
		private JLabel getLblPrevoz() {
			if (lblPrevoz == null) {
				lblPrevoz = new JLabel("Prevoz");
			}
			return lblPrevoz;
		}
		private JTextField getTextField_6() {
			if (textField_6 == null) {
				textField_6 = new JTextField();
				textField_6.setColumns(10);
			}
			return textField_6;
		}
		private JLabel getLblEdukacija() {
			if (lblEdukacija == null) {
				lblEdukacija = new JLabel("Edukacija");
			}
			return lblEdukacija;
		}
		private JTextField getTextField_7() {
			if (textField_7 == null) {
				textField_7 = new JTextField();
				textField_7.setColumns(10);
			}
			return textField_7;
		}
		private JLabel getLblIzlasci() {
			if (lblIzlasci == null) {
				lblIzlasci = new JLabel("Izlasci");
			}
			return lblIzlasci;
		}
		private JTextField getTextField_8() {
			if (textField_8 == null) {
				textField_8 = new JTextField();
				textField_8.setColumns(10);
			}
			return textField_8;
		}
		private JLabel getLblLuksuz() {
			if (lblLuksuz == null) {
				lblLuksuz = new JLabel("Luksuz");
			}
			return lblLuksuz;
		}
		private JTextField getTextField_9() {
			if (textField_9 == null) {
				textField_9 = new JTextField();
				textField_9.setColumns(10);
			}
			return textField_9;
		}
	}

