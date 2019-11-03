package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.PanelButtons;
import view.PanelScreen;

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
	private PanelButtons panelButtons;
	private PanelScreen panelScreen;

	public AppActionListener(PanelButtons panelButtons) {
		this.panelButtons = panelButtons;
		panelScreen = new PanelScreen();
	}

	// Se implementa en el método la lógica para el funcionamiento del programa.
	@Override
	public void actionPerformed(ActionEvent e) {
		// if (e.getSource().equals(panelButtons.getBtns().get(17)) ) {
		// 	System.out.println("Pasa - " + panelButtons.getBtns().get(17).getName());
		// }

		for (JButton btn : panelButtons.getBtns()) {
			// Solo para los numeros del 0 al 9
			if (e.getSource().equals(btn) ) {
				System.out.println(btn.getText());
				// panelTop.getLbl2().setText(btn.getText());
			}
		}

		panelScreen.getLbl2().setText("Prueba");
	}
}