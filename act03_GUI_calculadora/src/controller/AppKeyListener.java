package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import view.AppInterface;

/**
 * AppLister. Clase que recoge e implementa los eventos de teclado.
 * @author Juan Antonio Pavón Carmona
 * @category ITT DAM Desarrollo de Interfaces
 * @see KeyEvent
 * @see KeyListener
 * @see https://github.com/japc78/itt-dam2-ws_interface_java.git
 * @version 1.0
 *
 */
public class AppKeyListener implements KeyListener {
	private AppInterface i;

	public AppKeyListener(AppInterface i) {
		this.i = i;
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		i.getToolkit().beep();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}