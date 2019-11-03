package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;

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
		// Implementación de metodo OnlyNumbers para los botones para validar que los datos introducidos es un valor numérico valido.

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// Logica para el Boton Reset. Si Num1 y Num2 estan vacíos se deshabilita el boton

	}

	// Métodos propios.
	/**
	 * Metodo que verifica que el conteido introudcido por teclado en los JTextField sea numérico.
	 * @param e -> KeyEvent. Tipo de evento.
	 * @param t -> JTextfiel sobre el que se chekea el evento.
	 */
	private void onlyNumbers(KeyEvent e, JTextField t) {

	}

	/**
	 * Método para corregir la inserción, por error, un guion en medio de un número (Ej. 23232-2323).
	 * @param t -> JTextfiel sobre el que se realiza la correción.
	 */
	private void fixHyphen(JTextField t) {

	}
}