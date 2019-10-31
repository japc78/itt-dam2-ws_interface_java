package controller;

import view.AppWindows;

public class App {
	public static void main(String[] args) {

		AppWindows app = new AppWindows();
		Actions actions = new Actions(app);
		app.runActions(actions);
	}
}
