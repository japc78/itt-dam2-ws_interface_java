package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import view.AppInterface;

/**
 * ControlListener
 */
public class AppListener implements KeyListener {
	private AppInterface i;

	public AppListener(AppInterface i) {
		this.i = i;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(!i.getNum1().getText().isEmpty() || !i.getNum2().getText().isEmpty()) {
			i.getBtn5().setEnabled(true);
		} else {
			i.getBtn5().setEnabled(false);
		}

		// TODO Auto-generated method stub
	}
}