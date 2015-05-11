package gui.statistika;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

import sistem.utils.UtilsStatistika;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

/**
 * Graficka klasa Statistika
 * koja predstvlja izvestaj
 * @author marcus
 *
 */
public class Statistika extends JFrame {

	private static final long serialVersionUID = 1L;
	
	/**
	 * privatni panel
	 */
	private JPanel contentPane;

	/**
	 * kreiranje prozora
	 */
	public Statistika() {
		setTitle("Statistika");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		/**
		 * panel sa scroll opcijom
		 */
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		/**
		 * tekstualno polje za prikaz izvestaja
		 */
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		/**
		 * panel za dugmad
		 */
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setHgap(40);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		/**
		 * dugme za prikazivanje izvestaja
		 */
		JButton btnPri = new JButton("Prikaži");
		btnPri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UtilsStatistika.prikaziIzvestaj();
			}
		});
		panel.add(btnPri);
		
		/**
		 * dugme za odustajanje od akcije
		 */
		JButton btnGotovo = new JButton("Odustani");
		panel.add(btnGotovo);
		btnGotovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

}
