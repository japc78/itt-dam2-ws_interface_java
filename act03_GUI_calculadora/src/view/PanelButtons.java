package view;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.AppActionListener;


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
		AppFonts font = new AppFonts();
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
			btns.get(i).setFont(font.getFontButtom());
			btns.get(i).setFocusPainted(false);
			btns.get(i).setFont(font.getFontButtom());
			add(btns.get(i));
		}

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

	public void initActions(AppActionListener e) {
		for (JButton btn : btns) {
			btn.addActionListener(new AppActionListener(this));
		}
	}

    /**
     * @return ArrayList<JButton> return the btns
     */
    public ArrayList<JButton> getBtns() {
        return btns;
    }

    /**
     * @param btns the btns to set
     */
    public void setBtns(ArrayList<JButton> btns) {
        this.btns = btns;
    }
}