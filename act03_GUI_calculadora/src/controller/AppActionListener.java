package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

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

public class AppActionListener implements ActionListener {
	private AppInterface i;
	double result = 0;
	String number;
	char operation;
	int cont;

	public AppActionListener(AppInterface i) {
		this.i = i;
	}

	// Se implementa en el método la lógica para el funcionamiento del programa.
	@Override
	public void actionPerformed(ActionEvent e) {
		number = i.getPanelScreen().getNumber();
		cont = 0;
		operation = i.getPanelScreen().getOperation();
		switch (e.getActionCommand()) {
			case "+":
				operation('+');
			break;

			case "-":
				operation('-');
			break;

			case "×":
				operation('*');
			break;

			case "÷":
				operation('/');
			break;

			case "±":
				number =  (Double.parseDouble(number) > 0)? "-" + number : number.substring(1);
				i.getPanelScreen().setNumber(number);
			break;

			case ",":
				if (i.getPanelScreen().getNumber().indexOf(".") == -1) {
					number += ".";
					i.getPanelScreen().setNumber(number);
				}
			break;

			case "=":
				// Asignación de operaciones a los botones (Sumar, Restar, Multiplicar, dividir)
				try {
					if (operation == '+') {
						result+= Double.parseDouble(number);
						System.out.println("Resultado: " + result);
					} else if (operation == '-') {
						result-= Double.parseDouble(number);
						System.out.println("Resultado: " + result);
					} else if (operation == '*') {
						result*= Double.parseDouble(number);
						System.out.println("Resultado: " + result);
					} else if (operation == '/') {
						// Se comprueba que si el segundo número es 0
						result /= Double.parseDouble(number);
						System.out.println("Resultado: " + result);
					}
				} catch (NullPointerException | NumberFormatException ex) {
					number = "ERROR";
					ex.printStackTrace();
				}
				i.getPanelScreen().setNumber(String.valueOf(result));
				i.getPanelScreen().setOperation('0');
			break;

			case "CE":
				i.getPanelScreen().setNumber("");
			break;

			default:
				for (JButton btn : i.getPanelButtons().getBtns()) {
					if (e.getSource().equals(btn)) {
						if (cont == 1) {
							i.getPanelScreen().setNumber("");
							//number += btn.getText();
							i.getPanelScreen().setNumber(number + btn.getText());
							cont = 0;
						} else {
							i.getPanelScreen().setNumber(number + btn.getText());
						}

						// i.getPanelScreen().getLbl2().setText(btn.getText());
					}
				}
			break;
		}

/* 		for (JButton btn : i.getPanelButtons().getBtns()) {

			if ((e.getSource().equals(btn)) && ((btn.getText().charAt(0) >= 0) || ((btn.getText().charAt(0) <= 9)))) {
				System.out.println("pasa");
				operation += btn.getText();
				// i.getPanelScreen().getLbl2().setText(btn.getText());
			}
		}*/
		i.getPanelScreen().getScreen().setText(number);


	}

	private void operation(char c) {
		i.getPanelScreen().setOperation(c);
		result = Double.parseDouble(i.getPanelScreen().getNumber());
		System.out.println("Pasa " + result);
		cont = 1;
	}
}