package view;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

/**
 * AppMouseListener
 */
public class AppMouseListener implements MouseListener {
	private AppInterface i;
	private AppStyles styles;

	public AppMouseListener(AppInterface i) {
		this.i = i;
		styles = new AppStyles();
	}


	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {


	}

	@Override
	public void mouseEntered(MouseEvent e) {
		for (JButton btn : i.getPanelButtons().getBtns()) {
			if (e.getSource().equals(btn)) {
				btn.setContentAreaFilled(true);
			}
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		for (JButton btn : i.getPanelButtons().getBtns()) {
			if (e.getSource().equals(btn)) {
				btn.setContentAreaFilled(false);
			}
		}

	}


}