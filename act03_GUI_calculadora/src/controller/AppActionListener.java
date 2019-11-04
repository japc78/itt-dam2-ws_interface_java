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
	private double numberTmp;
	private String result;
	private char operation;
	private boolean newOperation;

	public AppActionListener(AppInterface i) {
		this.i = i;
	}

	// Se implementa en el método la lógica para el funcionamiento del programa.
	@Override
	public void actionPerformed(ActionEvent e) {
		result = i.getPanelScreen().getScreen().getText();
		newOperation = i.getPanelScreen().isNewOperation();
		operation = i.getPanelScreen().getOperation();
		numberTmp = i.getPanelScreen().getNumberTmp();
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
				result = i.getPanelScreen().getScreen().getText();
				result =  (Double.parseDouble(result) > 0)? "-" + result : result.substring(1);
				i.getPanelScreen().getScreen().setText(result);
			break;

			case ",":
				if (i.getPanelScreen().getResult().indexOf(".") == -1) {
					result += ".";
					i.getPanelScreen().setResult(result);
				}
			break;

			case "CE":
				i.getPanelScreen().getScreen().setText("0");
				i.getPanelScreen().setNewOperation(true);
			break;

			case "=":
				// Asignación de operaciones a los botones (Sumar, Restar, Multiplicar, dividir)
				try {
					if (operation == '+') {
						result = String.valueOf(numberTmp + Double.parseDouble(result));
						System.out.println("Resultado: "  + numberTmp);
					} else if (operation == '-') {
						result = String.valueOf(numberTmp - Double.parseDouble(result));
						System.out.println("Resultado: " + numberTmp);
					} else if (operation == '*') {
						result = String.valueOf(numberTmp * Double.parseDouble(result));
						System.out.println("Resultado: " + numberTmp);
					} else if (operation == '/') {
						// Se comprueba que si el segundo número es 0
						result = (Double.parseDouble(result) != 0 )? String.valueOf(numberTmp/Double.parseDouble(result)):"Error / por 0";
						System.out.println("Resultado: " + numberTmp);
					}

					// Para quitar los decimales si el número es entero
					String[] r = result.split("[.]");

					// Se comprueba que el resultado no sea un numero largo del tipo E(elevado), para que no salte la excepción al pasear con el Long.
					if (result.indexOf("E") == -1) {
						if (Long.parseLong(r[1]) == 0) result = r[0];
					}

				} catch (NullPointerException | NumberFormatException ex) {
					result = "ERROR";
					ex.printStackTrace();
				}

				i.getPanelScreen().getScreen().setText(result);
				i.getPanelScreen().setOperation('0');
				i.getPanelScreen().setNewOperation(true);
			break;

			default:
				for (JButton btn : i.getPanelButtons().getBtns()) {
					if (e.getSource().equals(btn)) {

						if (i.getPanelScreen().getOperation() != '0') result = ""; i.getPanelScreen().getScreen().setText("");
						if (!i.getPanelScreen().isNewOperation()) result = ""; i.getPanelScreen().getScreen().setText("");
						i.getPanelScreen().getScreen().setText(result + btn.getText());
					}
				}
				// i.getPanelScreen().getScreen().setText(number);
			break;
		}

/* 		for (JButton btn : i.getPanelButtons().getBtns()) {

			if ((e.getSource().equals(btn)) && ((btn.getText().charAt(0) >= 0) || ((btn.getText().charAt(0) <= 9)))) {
				System.out.println("pasa");
				operation += btn.getText();
				// i.getPanelScreen().getLbl2().setText(btn.getText());
			}
		}*/



	}

	// Metodo de operaciones
	private void operation(char c) {
		i.getPanelScreen().setOperation(c);
		numberTmp = Double.parseDouble(i.getPanelScreen().getScreen().getText());
		i.getPanelScreen().setNumberTmp(numberTmp);
		i.getPanelScreen().setNewOperation(false);
		System.out.println("Pasa a " + c + " " + numberTmp);
	}
}