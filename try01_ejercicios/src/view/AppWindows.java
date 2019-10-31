package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import controller.Actions;

/**
 * AppWindows
 */
public class AppWindows extends JFrame {
	private JButton btn1, btn2, btn3;

	/**
	 *
	 */
	private static final long serialVersionUID = -300020964324873620L;


	public AppWindows() {
		// Se deficne el nombre de la ventana y el SelLayout en una misma linea pasados por argumentos a traves de super, accediendo a los metodos de la clase JFrame a través de la herencia.
		super("Mi pagina");

		// Se define en el tamaño de la ventana
		this.setSize(285, 445);

		// Se inica que aparezca en el centro de la ventana.
		this.setLocationRelativeTo(null);

		// Se define el comportamiento al cerrar la ventana, al cerrar se cierra la ventana y se para la ejeción del programa.
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Se define el Layout de la ventana
		this.setLayout(new GridLayout(3,1));

		// Se llama al método para iniciazar los componentes de la ventana.
		initComponents();

		// Se hace visible
		this.setVisible(true);
	}

	// Método para inicializar los componentes de la ventana.
	public void initComponents() {
		btn1 = new JButton("Number 1");
		add(btn1);

		btn2 = new JButton("Number 2");
		add(btn2);

		btn3 = new JButton("Number 3");
		add(btn3);
	}

	public void runActions (Actions a) {
		btn1.addActionListener(new Actions(this));
		btn2.addActionListener(new Actions(this));
		btn3.addActionListener(new Actions(this));
	}



	/**
	 * @return the btn1
	 */
	public JButton getBtn1() {
		return btn1;
	}

	/**
	 * @param btn1 the btn1 to set
	 */
	public void setBtn1(JButton btn1) {
		this.btn1 = btn1;
	}

	/**
	 * @return the btn2
	 */
	public JButton getBtn2() {
		return btn2;
	}

	/**
	 * @param btn2 the btn2 to set
	 */
	public void setBtn2(JButton btn2) {
		this.btn2 = btn2;
	}

	/**
	 * @return the btn3
	 */
	public JButton getBtn3() {
		return btn3;
	}

	/**
	 * @param btn3 the btn3 to set
	 */
	public void setBtn3(JButton btn3) {
		this.btn3 = btn3;
	}

}