package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 * AppInterfaceTop
 */
public class PanelScreen extends JPanel {
	private GridBagConstraints grid;
	private JTextField  screen;
	private JLabel history;
	private double result;
	private String number;
	private char operation;
	private Boolean newoperation;

	/**
	 *
	 */
	private static final long serialVersionUID = 374177693461494474L;

	public PanelScreen() {
		number = "0";
		result = 0;
		// Se define un grid para el panel.
		setLayout(new GridBagLayout());
		grid = new GridBagConstraints();
		grid.weightx = 1;
		grid.weighty = 1;
		grid.insets = new Insets(2, 2, 2, 2);
		grid.fill = GridBagConstraints.BOTH;

		initComponents();

		setVisible(true);
	}

	public void initComponents() {
		AppStyles styles = new AppStyles();
		// Label donde se ven los resultados.
			history = new JLabel(number);

			// Posición en el grid, eje x y.
			grid.gridx = 0;
			grid.gridy = 0;

			// Tamaño, cuantas celdas ocupara en el grid.
			grid.gridwidth = 4;
			grid.gridheight = 1;

			add(history, grid);

		// Label donde se la operacion.
			screen = new JTextField(String.valueOf(result));
			screen.setFont(styles.getFontScreen());
			screen.setCaretColor(styles.getColorCursor());
			screen.setCaretPosition(0);
			screen.setBackground(null);
			screen.setHorizontalAlignment(JTextField.RIGHT);
			screen.setBorder(null);
			screen.requestFocus();
			screen.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

			// Posición en el grid, eje x y.
			grid.gridx = 0;
			grid.gridy = 1;

			// Para este elemento se le indica que su altura sera el doble.
			grid.weighty = 2;

			// Tamaño cuantas celdas ocupara en el grid.
			grid.gridwidth = 4;
			grid.gridheight = 2;
			add(screen, grid);
	}

	// Getters and Setters
		/**
		 * @return the screen
		 */
		public JTextField getScreen() {
			return screen;
		}

		/**
		 * @param screen the screen to set
		 */
		public void setScreen(JTextField screen) {
			this.screen = screen;
		}

		/**
		 * @return the history
		 */
		public JLabel getHistory() {
			return history;
		}

		/**
		 * @param history the history to set
		 */
		public void setHistory(JLabel history) {
			this.history = history;
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
		 * @return the number
		 */
		public String getNumber() {
			return number;
		}

		/**
		 * @param number the number to set
		 */
		public void setNumber(String number) {
			this.number = number;
		}

		/**
		 * @return the operation
		 */
		public char getOperation() {
			return operation;
		}

		/**
		 * @param operation the operation to set
		 */
		public void setOperation(char operation) {
			this.operation = operation;
		}

		/**
		 * @return the newoperation
		 */
		public Boolean getNewoperation() {
			return newoperation;
		}

		/**
		 * @param newoperation the newoperation to set
		 */
		public void setNewoperation(Boolean newoperation) {
			this.newoperation = newoperation;
		}
}