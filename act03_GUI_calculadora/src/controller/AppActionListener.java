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
	double result;
	String number = "";
	char operation;

	public AppActionListener(AppInterface i) {
		this.i = i;
	}

	// Se implementa en el método la lógica para el funcionamiento del programa.
	@Override
	public void actionPerformed(ActionEvent e) {
		number = i.getPanelScreen().getOperation();
		switch (e.getActionCommand()) {
			case "+":
				operation = '+';
			break;

			case "-":
				operation = '-';
			break;

			case "×":
				operation = 'x';
			break;

			case "÷":
				operation = '/';
			break;

			case "±":
				number =  (Double.parseDouble(number) > 0)? "-" + number : number.substring(1);
				i.getPanelScreen().setOperation(number);
			break;

			case ",":
				if (i.getPanelScreen().getOperation().indexOf(".") == -1) {
					number += ".";
					i.getPanelScreen().setOperation(number);
				}
			break;

			case "=":


			break;

			case "CE":
				i.getPanelScreen().setOperation("");
			break;

			default:
				for (JButton btn : i.getPanelButtons().getBtns()) {
					if (e.getSource().equals(btn)) {
						number += btn.getText();
						i.getPanelScreen().setOperation(number);
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
		i.getPanelScreen().getLbl2().setText(number);


	}
}