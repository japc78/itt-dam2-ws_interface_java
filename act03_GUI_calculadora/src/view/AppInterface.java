package view;

import java.awt.*;
import javax.swing.*;

import controller.AppActionListener;

import java.io.IOException;


/**
 * AppInterface. Clase que implementa la interface de la Calculadora.
 * @author Juan Antonio Pavón Carmona
 * @category ITT DAM Desarrollo de Interfaces
 * @see JFrame
 * @see JButton
 * @see JLabel
 * @see JTextField
 * @see https://github.com/japc78/itt-dam2-ws_interface_java.git
 * @version 1.0
 *
 */

public class AppInterface extends JFrame {
	private static final long serialVersionUID = 3294244089057792643L;
	private GridBagConstraints grid;
	private PanelScreen panelScreen;
	private PanelButtons panelButtons;

	/**
	 * Constructor sin parametros de la interface de la Caculadora.
	 */
	public AppInterface() {
		super("Act3 - GUI");

		// Appico
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/resources/rocket.png"));

		// Se define en el tamaño de la ventana
		setSize(300, 480);

		// Se define el comportamiento al cerrar la aplicación.
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Con GridBagLayout creamos un grid es posible posiciona elemementos segun la retícula.
		setLayout(new GridBagLayout());
		grid = new GridBagConstraints();

		// Se define la regla para definir el tamaño de cada celda y la distribución.
		grid.weightx = 1;
		grid.weighty = 1;

		// Se indica que cada componente se expanda en horizontal y vertial.
		grid.fill = GridBagConstraints.BOTH;

		// Se indica que aparezca en el centro de la pantalla.
		setLocationRelativeTo(null);

		// Se inicializa los componentes
		initComponets();

		// Se visualiza la aplicacion.
		setVisible(true);
	}

	public void initComponets() {
		// Panel superior
			panelScreen = new PanelScreen();
			// Posición en el grid, eje x y.
			grid.gridx = 0;
			grid.gridy = 0;

			// Tamaño cuantas celdas ocupara en el grid.
			grid.gridwidth = 4;
			grid.gridheight = 3;

			// Se añade el panel pasandole grid con los voleres anteriormente declardos.
			add(panelScreen, grid);

		// Panel inferior
			panelButtons = new PanelButtons();
			panelButtons.setBorder(null);
			// Posición en el grid, eje x y.
			grid.gridx = 0;
			grid.gridy = 3;

			// Tamaño cuantas celdas ocupara en el grid.
			grid.gridwidth = 4;
			grid.gridheight = 5;

			// Se añade el panel pasandole grid con los voleres anteriormente declardos.
			add(panelButtons, grid);
	}

	public void initActions(AppActionListener actions) {
		for (JButton btn : panelButtons.getBtns()) {
			btn.addActionListener(new AppActionListener(this));
		}
	}

	/**
	 * @return the panelScreen
	 */
	public PanelScreen getPanelScreen() {
		return panelScreen;
	}

	/**
	 * @param panelScreen the panelScreen to set
	 */
	public void setPanelScreen(PanelScreen panelScreen) {
		this.panelScreen = panelScreen;
	}

	/**
	 * @return the panelButtons
	 */
	public PanelButtons getPanelButtons() {
		return panelButtons;
	}

	/**
	 * @param panelButtons the panelButtons to set
	 */
	public void setPanelButtons(PanelButtons panelButtons) {
		this.panelButtons = panelButtons;
	}
}