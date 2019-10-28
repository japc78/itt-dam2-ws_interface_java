package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CalculatorInterface;

public class CalculatorActions implements ActionListener {
	private CalculatorInterface i;

	public CalculatorActions(CalculatorInterface i) {
		this.i = i;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String resultado = "";

		if ((!i.getNum1().getText().isEmpty()) && (!i.getNum2().getText().isEmpty())) {

			try {
				double n1 = Double.parseDouble(i.getNum1().getText());
				double n2 =  Double.parseDouble(i.getNum2().getText());

				if (e.getSource() == i.getBtn1()) {
					resultado = String.valueOf(n1+n2);
				} else if (e.getSource() == i.getBtn2()) {
					resultado = String.valueOf(n1-n2);
				} else if (e.getSource() == i.getBtn3()) {
					resultado = String.valueOf(n1*n2);
				} else if (e.getSource() == i.getBtn4()) {
					resultado = (n2 > 0 )? String.valueOf(n1/n2):"No es posible dividir por 0";
				}
				i.getLbl3().setText("Resultado: " + resultado);

			} catch (NumberFormatException | NullPointerException  ex) {
				i.getLbl3().setText ("Error en los datos introducidos");
			}

		} else {
			i.getLbl3().setText ("Los campos no pueden estar vacíos");
		}

		if (e.getSource() == i.getBtn5()) {
			i.getNum1().setText("");
			i.getNum2().setText("");
			i.getNum1().requestFocus();
			i.getLbl3().setText("Resultado: ");
		}
	}
}