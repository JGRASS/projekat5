package sistem;

import gui.GlavniProzor;

import java.awt.EventQueue;

/**
 * klasa Main koja sadrzi metodu koja
 * startuje glavni prozor aplikacije, tj.
 * samu aplikaciju
 * @author marcus
 *
 */
public class MainGuiControler {

	/**
	 * staticka metoda koja startuje aplkaciju
	 * @param args u vidu String[]
	 * @throws new Exception
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GlavniProzor frame = new GlavniProzor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
