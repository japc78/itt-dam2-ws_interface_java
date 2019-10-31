package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.AppEvents;
import controller.AppListener;

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
	private static final long serialVersionUID = -4701354891093024527L;
	private JLabel lbl1, lbl2, lbl3;
	private JButton btn1, btn2, btn3, btn4, btn5;
	private JTextField num1, num2;

	/**
	 * Constructor sin parametros de la interface de la Caculadora.
	 */
	public AppInterface() {
		super("Act3 - GUI");

		// Se define en el tamaño de la ventana
		setSize(235, 315);

		// Se indica que aparezca en el centro de la pantalla.
		setLocationRelativeTo(null);

		// Se define el comportamiento al cerrar la aplicación.
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Para no permitir redimesionar
		setResizable(false);

		// Se desactiva al organización automática de los elementos en la
		setLayout(null);

		// Se inicializan los componentes de la interface.
		initComponents();

		// Se visualiza la aplicacion.
		setVisible(true);
	}

	/**
	 * Metodo para inicializar los componentes de la interface.
	 */
	public void initComponents() {
		// Etiquetas
		lbl1 = new JLabel("Numero 1");
		lbl1.setBounds(15, 15, 75, 30);
		add(lbl1);

		lbl2 = new JLabel("Numero 2");
		lbl2.setBounds(15, 65, 75, 30);
		add(lbl2);

		lbl3 = new JLabel("");
		lbl3.setBounds(15, 225, 210, 30);
		add(lbl3);

		// Entrada de datos
		num1 = new JTextField();
		num1.setBounds(100, 15, 115, 30);
		add(num1);

		num2 = new JTextField();
		num2.setBounds(100, 65, 115, 30);
		add(num2);

		// Botones
		btn1 = new JButton("Sumar");
		btn1.setBounds(15, 115, 97, 30);
		add(btn1);

		btn2 = new JButton("Restar");
		btn2.setBounds(116, 115, 97, 30);
		add(btn2);

		btn3 = new JButton("Multiplicar");
		btn3.setBounds(15, 150, 97, 30);
		add(btn3);

		btn4 = new JButton("Dividir");
		btn4.setBounds(116, 150, 97, 30);
		add(btn4);

		btn5 = new JButton("Reset");
		btn5.setBounds(15, 185, 97, 30);
		btn5.setEnabled(false);
		add(btn5);
	}


	/**
	 * Metodo que añade los eventos a los componentes.
	 * @param actions
	 * @param listener
	 */
	public void initActions(AppEvents actions, AppListener listener) {
		btn1.addActionListener(new AppEvents(this));
		btn2.addActionListener(new AppEvents(this));
		btn3.addActionListener(new AppEvents(this));
		btn4.addActionListener(new AppEvents(this));
		btn5.addActionListener(new AppEvents(this));
		num1.addActionListener(new AppEvents(this));
		num2.addActionListener(new AppEvents(this));
		num1.addKeyListener(new AppListener(this));
		num2.addKeyListener(new AppListener(this));
	}

	// Getters and Setters
		public JLabel getLbl3() {
			return this.lbl3;
		}

		public void setLbl3(JLabel lbl3) {
			this.lbl3 = lbl3;
		}

		public JButton getBtn1() {
			return this.btn1;
		}

		public void setBtn1(JButton btn1) {
			this.btn1 = btn1;
		}

		public JButton getBtn2() {
			return this.btn2;
		}

		public void setBtn2(JButton btn2) {
			this.btn2 = btn2;
		}

		public JButton getBtn3() {
			return this.btn3;
		}

		public void setBtn3(JButton btn3) {
			this.btn3 = btn3;
		}

		public JButton getBtn4() {
			return this.btn4;
		}

		public void setBtn4(JButton btn4) {
			this.btn4 = btn4;
		}

		public JButton getBtn5() {
			return this.btn5;
		}

		public void setBtn5(JButton btn4) {
			this.btn4 = btn5;
		}

		public JTextField getNum1() {
			return this.num1;
		}

		public void setNum1(JTextField num1) {
			this.num1 = num1;
		}

		public JTextField getNum2() {
			return this.num2;
		}

		public void setNum2(JTextField num2) {
			this.num2 = num2;
		}
}