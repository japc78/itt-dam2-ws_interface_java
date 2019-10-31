package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.AppInterface;

/**
 * AppEvents. Clase que recoge e implementa los eventos en botones.
 * @author Juan Antonio Pavón Carmona
 * @category ITT DAM Desarrollo de Interfaces
 * @see ActionEvent
 * @see ActionListener
 * @see https://github.com/japc78/itt-dam2-ws_interface_java.git
 * @version 1.0
 *
 */

public class AppEvents implements ActionListener {
	private AppInterface i;

	public AppEvents(AppInterface i) {
		this.i = i;
	}

	// Se implementa en el método la lógica para el funcionamiento del programa.
	@Override
	public void actionPerformed(ActionEvent e) {
		if ((!i.getNum1().getText().isEmpty()) && (!i.getNum2().getText().isEmpty()) && (e.getSource() != i.getBtn5())) {
			String resultado = "";
			try {
				double n1 = Double.parseDouble(i.getNum1().getText());
				double n2 =  Double.parseDouble(i.getNum2().getText());

				// Asignación de operaciones a los botones (Sumar, Restar, Multiplicar, dividir)
				if (e.getSource() == i.getBtn1()) {
					resultado = String.valueOf(n1+n2);
				} else if (e.getSource() == i.getBtn2()) {
					resultado = String.valueOf(n1-n2);
				} else if (e.getSource() == i.getBtn3()) {
					resultado = String.valueOf(n1*n2);
				} else if (e.getSource() == i.getBtn4()) {
					// Se comprueba que si el segundo número es 0
					resultado = (n2 != 0 )? String.valueOf(n1/n2):"Error al dividir por 0";
				}

				// Para quitar los decimales si el número es entero
				String[] r = resultado.split("[.]");
				if (Long.parseLong(r[1]) == 0) resultado = r[0];

				// Se muestra el resultado
				i.getLbl3().setText("Resultado: " + resultado);

				// Se controlan las posibles excepciones que se puedan producir.
			} catch (NumberFormatException | NullPointerException  ex) {
				i.getLbl3().setText ("Error en los datos introducidos");
				ex.printStackTrace();
			}
		} else {
			i.getLbl3().setText ("Los campos no pueden estar vacíos");
			i.getNum1().requestFocus();
		}

		// Reset.
		if (e.getSource() == i.getBtn5()) {
			i.getNum1().setText("");
			i.getNum2().setText("");
			i.getNum1().requestFocus();
			i.getBtn5().setEnabled(false);
			i.getLbl3().setText("");
		}
	}
}