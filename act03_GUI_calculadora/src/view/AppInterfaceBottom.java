package view;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.AppEvents;
import controller.AppListener;


/**
 * AppInterfaceBottom
 */
public class AppInterfaceBottom extends JPanel{

	/**
	 *
	 */
	private static final long serialVersionUID = -1550040107325142497L;
	private static ArrayList<JButton> btns = new ArrayList<>();

	public AppInterfaceBottom() {
		setLayout(new GridLayout(5,4));

		initComponents();

		setVisible(true);
	}

	public void initComponents() {
		AppInterfaceFont font = new AppInterfaceFont();
		// Se crean los botones
		int n = 9;
		for (int i = 0; i < 20; i++) {
			// Solo para los numeros del 0 al 9
			if ((i > 3) && (i < 15) && ((i+1)%4 != 0) || (i == 12) || (i == 17)) {
				btns.add(new JButton(String.valueOf(n)));
				btns.get(i).setFont(font.getFontButtom());
				btns.get(i).setFocusPainted(false);
				add(btns.get(i));
				n--;
			} else {
				btns.add(new JButton(String.valueOf("")));
				btns.get(i).setFont(font.getFontButtom());
				btns.get(i).setFocusPainted(false);
				add(btns.get(i));
			}
		}

		btns.get(18).setText(",");
		btns.get(3).setText("÷");
		btns.get(7).setText("×");
		btns.get(11).setText("-");
		btns.get(15).setText("+");
		btns.get(19).setText("=");
		btns.get(16).setText("±");
	}

	public void initActions(AppEvents e, AppListener l) {

	}

	/**
	 * @return the btns
	 */
	public static ArrayList<JButton> getBtns() {
		return btns;
	}
}