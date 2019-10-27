package controller;

import view.CalculatorInterface;

public class App {
	public static void main(String[] args) {
		CalculatorInterface calculator = new CalculatorInterface();
		CalculatorActions actions = new CalculatorActions(calculator);
		calculator.initActions(actions);
	}
}