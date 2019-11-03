package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 * AppInterfaceTop
 */
public class PanelScreen extends JPanel {
	private GridBagConstraints grid;
	private JLabel lbl1, lbl2;
	double result;
	String operation;

	/**
	 *
	 */
	private static final long serialVersionUID = 374177693461494474L;

	public PanelScreen() {
		operation = "";
		result = 0;
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
		AppStyles styles = new AppStyles();
		// Label donde se ven los resultados.
			lbl1 = new JLabel(operation);

			// Posición en el grid, eje x y.
			grid.gridx = 0;
			grid.gridy = 0;

			// Tamaño, cuantas celdas ocupara en el grid.
			grid.gridwidth = 4;
			grid.gridheight = 1;

			add(lbl1, grid);

		// Label donde se la operacion.
			lbl2 = new JLabel(String.valueOf(result));
			lbl2.setFont(styles.getFontScreen());
			lbl2.setHorizontalAlignment(JTextField.RIGHT);
			lbl2.setBorder(BorderFactory.createCompoundBorder(lbl2.getBorder(), styles.getEmpyBorder()));

			// Posición en el grid, eje x y.
			grid.gridx = 0;
			grid.gridy = 1;

			// Para este elemento se le indica que su altura sera el doble.
			grid.weighty = 2;

			// Tamaño cuantas celdas ocupara en el grid.
			grid.gridwidth = 4;
			grid.gridheight = 2;
			add(lbl2, grid);
	}

	/**
	 * @return the lbl1
	 */
	public JLabel getLbl1() {
		return lbl1;
	}

	/**
	 * @param lbl1 the lbl1 to set
	 */
	public void setLbl1(JLabel lbl1) {
		this.lbl1 = lbl1;
	}

	/**
	 * @return the lbl2
	 */
	public JLabel getLbl2() {
		return lbl2;
	}

	/**
	 * @param lbl2 the lbl2 to set
	 */
	public void setLbl2(JLabel lbl2) {
		this.lbl2 = lbl2;
	}

	/**
	 * @return the result
	 */
	public double getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(double result) {
		this.result = result;
	}

	/**
	 * @return the operation
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * @param operation the operation to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}

}