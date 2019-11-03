package controller;

import view.AppInterface;
import view.AppMouseListener;

/**
 * App. Clase principal que arranca el programa.
 * @author Juan Antonio Pavón Carmona
 * @category ITT DAM Desarrollo de Interfaces
 * @see AppInterface
 * @see AppActionListener
 * @see AppListeners
 * @see https://github.com/japc78/itt-dam2-ws_interface_java.git
 * @version 1.0
 *
 */


public class App {
	public static void main(String[] args) {
		AppInterface calculator = new AppInterface();
		AppActionListener actions = new AppActionListener(calculator);
		AppMouseListener mouse = new AppMouseListener(calculator);
		// AppListener listener = new AppListener(calculator);
		calculator.initActions(actions, mouse);
	}
}