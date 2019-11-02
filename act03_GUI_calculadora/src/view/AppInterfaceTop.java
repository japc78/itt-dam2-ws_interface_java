package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 * AppInterfaceTop
 */
public class AppInterfaceTop extends JPanel {
	private JLabel lbl1, lbl2;
	private GridBagConstraints grid;

	/**
	 *
	 */
	private static final long serialVersionUID = 374177693461494474L;

	public AppInterfaceTop() {
		// Se define un grid para el panel.
		setLayout(new GridBagLayout());
		grid = new GridBagConstraints();
		grid.weightx = 1;
		grid.weighty = 1;
		grid.fill = GridBagConstraints.BOTH;

		initComponents();

		setVisible(true);
	}

	public void initComponents() {
		Border borderBlack = BorderFactory.createLineBorder(Color.BLACK, 2);
		Border borderRed = BorderFactory.createLineBorder(Color.RED, 2);
		// Label donde se ven los resultados.
			lbl1 = new JLabel("Operacion");

			// Posición en el grid, eje x y.
			grid.gridx = 0;
			grid.gridy = 0;

			// Tamaño, cuantas celdas ocupara en el grid.
			grid.gridwidth = 4;
			grid.gridheight = 1;

			lbl1.setBorder(borderBlack);
			add(lbl1, grid);

		// Label donde se la operacion.
			lbl2 = new JLabel("Resultados");

			// Posición en el grid, eje x y.
			grid.gridx = 0;
			grid.gridy = 1;

			// Para este elemento se le indica que su altura sera el doble.
			grid.weighty = 2;

			// Tamaño cuantas celdas ocupara en el grid.
			grid.gridwidth = 4;
			grid.gridheight = 2;
			lbl2.setBorder(borderRed);
			add(lbl2, grid);
	}
}