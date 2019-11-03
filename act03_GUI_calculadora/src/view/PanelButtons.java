package view;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controller.AppActionListener;
import controller.AppKeyListener;


/**
 * AppInterfaceBottom
 */
public class PanelButtons extends JPanel{

	/**
	 *
	 */
	private static final long serialVersionUID = -1550040107325142497L;
	private ArrayList<JButton> btns = new ArrayList<>();

	public PanelButtons() {
		setLayout(new GridLayout(5,4));
		initComponents();
		setVisible(true);
	}

	public void initComponents() {
		AppStyles styles = new AppStyles();
		// Se crean los botones
		int n = 9;
		for (int i = 0; i < 20; i++) {
			// Solo para los numeros del 0 al 9
			if ((i > 3) && (i < 15) && ((i+1)%4 != 0) || (i == 12) || (i == 17)) {
				btns.add(new JButton(String.valueOf(n)));
				n--;
			} else {
				btns.add(new JButton(String.valueOf("")));
			}

			btns.get(i).setFont(styles.getFontButtom());
			btns.get(i).setBorder(null);
			btns.get(i).setBorder(styles.empyBorder);
			btns.get(i).setBorderPainted(false);
			btns.get(i).setContentAreaFilled(false);
			btns.get(i).setBackground(styles.color1);
			btns.get(i).setFocusPainted(false);
			btns.get(i).setHorizontalAlignment(SwingConstants.CENTER);
			add(btns.get(i));
		}

		btns.get(2).setText("CE");
		btns.get(18).setText(",");
		btns.get(3).setText("÷");
		btns.get(7).setText("×");
		btns.get(11).setText("-");
		btns.get(15).setText("+");
		btns.get(19).setText("=");
		btns.get(16).setText("±");

		for (JButton btn : btns) {
			btn.setName("btn" + btn.getText());
		}
	}

	public void initActions(AppActionListener e, AppKeyListener l) {

	}

	/**
	 * @return the btns
	 */
	public ArrayList<JButton> getBtns() {
		return btns;
	}
}