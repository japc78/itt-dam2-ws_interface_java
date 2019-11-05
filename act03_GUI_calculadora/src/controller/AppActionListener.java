package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

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
	private String result, history;
	private char operation;
	private boolean newOperation, newNumber;

	public AppActionListener(AppInterface i) {
		this.i = i;
	}

	// Se implementa en el método la lógica para el funcionamiento del programa.
	@Override
	public void actionPerformed(ActionEvent e) {
		result = i.getPanelScreen().getScreen().getText();
		history = i.getPanelScreen().getHistory().getText();
		newOperation = i.getPanelScreen().isNewOperation();
		operation = i.getPanelScreen().getOperation();
		numberTmp = i.getPanelScreen().getNumberTmp();
		newNumber = i.getPanelScreen().isNewNumber();
		newOperation = i.getPanelScreen().isNewOperation();

		switch (e.getActionCommand()) {
			case "+":
				operation('+');
			break;

			case "-":
				operation('-');
			break;

			case "×":
				operation('×');
			break;

			case "÷":
				operation('/');
			break;

			case "±":
				result =  (Double.parseDouble(result) > 0)? "-" + result : result.substring(1);
				i.getPanelScreen().getScreen().setText(result);
				i.getPanelScreen().setNewOperation(false);
			break;

			case ",":
				if (i.getPanelScreen().getResult().indexOf(".") == -1) {
					System.out.println("Decimal");
					result += ".";
					i.getPanelScreen().getScreen().setText(result);;
				}
			break;

			case "<":
				if (!newNumber) {
					result = (result.length() > 1)? result.substring(0, result.length()-1):"0";
					i.getPanelScreen().getScreen().setText(result);
				}
			break;

			case "CE":
				i.getPanelScreen().getScreen().setText("0");
				i.getPanelScreen().setNumberTmp(0);
				i.getPanelScreen().setOperation('0');
				i.getPanelScreen().setNewOperation(false);
				i.getPanelScreen().setNewNumber(true);
				i.getPanelScreen().getHistory().setText(" ");;


				System.out.println("Reset Pantalla: "  + i.getPanelScreen().getScreen().getText());
				System.out.println("Reset NewNumber: "  + i.getPanelScreen().isNewNumber());
				System.out.println("Reset NewOperatio: "  + i.getPanelScreen().isNewOperation());
				System.out.println("Reset NewOperatio: "  + i.getPanelScreen().getOperation());
			break;

			case "=":
				// Asignación de operaciones a los botones (Sumar, Restar, Multiplicar, dividir)
				if (i.getPanelScreen().getOperation() != '0') {
					history += result + operation;
					i.getPanelScreen().getHistory().setText(history);
					try {
						if (operation == '+') {
							result = String.valueOf(numberTmp + Double.parseDouble(result));
						} else if (operation == '-') {
							result = String.valueOf(numberTmp - Double.parseDouble(result));
						} else if (operation == '×') {
							result = String.valueOf(numberTmp * Double.parseDouble(result));
						} else if (operation == '/') {
							// Se comprueba que si el segundo número es 0
							result = (Double.parseDouble(result) != 0 )? String.valueOf(numberTmp/Double.parseDouble(result)):"Error / por 0";
						}

						result = isInteger(result);

					} catch (NullPointerException | NumberFormatException ex) {
						result = "ERROR";
						ex.printStackTrace();
					}

					i.getPanelScreen().getScreen().setText(result);
					i.getPanelScreen().setOperation('0');
					i.getPanelScreen().setNewOperation(true);
					i.getPanelScreen().setNewNumber(true);
				}
			break;

			default:
				for (JButton btn : i.getPanelButtons().getBtns()) {
					if (e.getSource().equals(btn)) {
						// System.out.println("Operation: " + i.getPanelScreen().isNewOperation());
						System.out.println("NewNumber: " + i.getPanelScreen().isNewNumber());

						if (newNumber) {
							result = "";
							i.getPanelScreen().getScreen().setText("");
							i.getPanelScreen().setNewNumber(false);
						}

						// if (i.getPanelScreen().getOperation() != '0') result = ""; i.getPanelScreen().getScreen().setText("");
						// if (i.getPanelScreen().isNewOperation()) result = ""; i.getPanelScreen().getScreen().setText(""); i.getPanelScreen().setNewOperation(false);
						i.getPanelScreen().getScreen().setText(result + btn.getText());
						i.getPanelScreen().setNewOperation(true);
						System.out.println("Foreach JButton");
						System.out.println("Operation: " + i.getPanelScreen().getOperation());
						System.out.println("NewNumber: " + i.getPanelScreen().isNewNumber());
						System.out.println("NewOperation: " + i.getPanelScreen().isNewOperation());
						System.out.println("Pantalla: " + i.getPanelScreen().getScreen().getText());
						System.out.println("-----------");
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

	/**
	 * Metodo para comprobar si el numero es entero y no es necesario mostar los decimales
	 * @param result Se le pasa el resultado como cadena de Texto.
	 * @return Retorna el numero sin decimales si es entero.
	 */
	private String isInteger(String result) {
		// Para quitar los decimales si el número es entero
		String[] r = result.split("[.]");

		System.out.println("IsInteger splid: " + Arrays.toString(r));
		System.out.println("IsInteger splid length: " + r.length);

		// Se comprueba que el resultado no sea un numero largo del tipo E(elevado), para que no salte la excepción al pasear con el Long.
		if ((r.length > 1)  && (result.indexOf("E") == -1)){
			if (Long.parseLong(r[1]) == 0) result = r[0];
		}
		return result;
	}

	// Metodo de operaciones
	private void operation(char c) {
		i.getPanelScreen().setOperation(c);
		history += result + c;
		i.getPanelScreen().getHistory().setText(history);
		// System.out.println("numberTmp: " + numberTmp);

		try {
			if ((operation == '+') && (newOperation)) {
				// System.out.println("Result: " + result);
				result = String.valueOf(numberTmp + Double.parseDouble(result));
				// System.out.println("Resultado: "  + result);
			} else if ((operation == '-') && (newOperation)) {
				result = String.valueOf(numberTmp - Double.parseDouble(result));
			} else if ((operation == '×') && (newOperation)) {
				result = String.valueOf(numberTmp * Double.parseDouble(result));
			} else if ((operation == '/') && (newOperation)) {
				// Se comprueba que si el segundo número es 0
				result = (Double.parseDouble(result) != 0 )? String.valueOf(numberTmp/Double.parseDouble(result)):"Error / por 0";
			}

			result = isInteger(result);

		} catch (NullPointerException | NumberFormatException ex) {
			result = "ERROR";
			ex.printStackTrace();
		}
		i.getPanelScreen().setNumberTmp(Double.parseDouble(result));
		i.getPanelScreen().getScreen().setText(result);
		i.getPanelScreen().setNewNumber(true);
		i.getPanelScreen().setNewOperation(false);
		// System.out.println("Operation: " + c);
		// System.out.println("Result: " + result);
		// System.out.println("newOperation: " + i.getPanelScreen().isNewOperation());
	}
}