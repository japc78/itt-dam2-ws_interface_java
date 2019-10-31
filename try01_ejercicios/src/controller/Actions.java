package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.AppWindows;

/**
 * Actions
 */
public class Actions implements ActionListener {
	private AppWindows windows;

	public Actions(AppWindows o) {
		this.windows = o;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		windows.setTitle(btn.getText());
	}
}