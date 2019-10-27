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
		int resultado = 0;
		int n1 = Integer.parseInt(i.getNum1().getText());
		int n2 = Integer.parseInt(i.getNum2().getText());


		if (e.getSource() == i.getBtn1()) {
			resultado = n1+n2;
		} else if (e.getSource() == i.getBtn2()) {
			resultado = n1-n2;
		} else if (e.getSource() == i.getBtn3()) {
			resultado = n1*n2;
		} else if (e.getSource() == i.getBtn4()) {
			resultado = n1/n2;
		} else {
			i.getNum1().setText("");
			i.getNum2().setText("");
			i.getNum1().requestFocus();
		}

		i.getLbl3().setText("Resultado: " + resultado);

	}
}