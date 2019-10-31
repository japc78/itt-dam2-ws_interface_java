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
public class AppListener implements KeyListener {
	private AppInterface i;

	public AppListener(AppInterface i) {
		this.i = i;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// Implementación de metodo OnlyNumbers para los botones para validar que los datos introducidos es un valor numérico valido.
		if (e.getSource() == i.getNum1()) {
			onlyNumbers(e, i.getNum1());
		} else if (e.getSource() == i.getNum2()) {
			onlyNumbers(e, i.getNum2());
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// Logica para el Boton Reset. Si Num1 y Num2 estan vacíos se deshabilita el boton
		if(!i.getNum1().getText().isEmpty() || !i.getNum2().getText().isEmpty()) {
			i.getBtn5().setEnabled(true);
		} else {
			i.getBtn5().setEnabled(false);
		}

		// Implementación de metodo para corregir el error del - en el número.
		fixHyphen(i.getNum1());
		fixHyphen(i.getNum2());
	}

	// Métodos propios.
	/**
	 * Metodo que verifica que el conteido introudcido por teclado en los JTextField sea numérico.
	 * @param e -> KeyEvent. Tipo de evento.
	 * @param t -> JTextfiel sobre el que se chekea el evento.
	 */
	private void onlyNumbers(KeyEvent e, JTextField t) {
		char c = e.getKeyChar();
		if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))
		&& ((c != '.') || (t.getText().contains(".")))
		&& ((c != '-') || (t.getText().contains("-")) && (t.getText().startsWith("-")))) {
			i.getToolkit().beep();
			e.consume();
		}
	}

	/**
	 * Método para corregir la inserción, por error, un guion en medio de un número (Ej. 23232-2323).
	 * @param t -> JTextfiel sobre el que se realiza la correción.
	 */
	private void fixHyphen(JTextField t) {
		if (t.getText().indexOf("-", 1) != -1) {
			t.setText(t.getText().substring(0, t.getText().indexOf("-")));
			i.getToolkit().beep();
		}
	}
}