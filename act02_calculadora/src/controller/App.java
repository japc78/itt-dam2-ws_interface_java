package controller;

import view.AppInterface;

public class App {
	public static void main(String[] args) {
		AppInterface calculator = new AppInterface();
		AppEvents actions = new AppEvents(calculator);
		AppListener listener = new AppListener(calculator);
		calculator.initActions(actions,listener);
	}
}