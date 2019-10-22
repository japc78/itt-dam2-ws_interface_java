package vista;

import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.ManejadorEventos;

/**
 * VentanaPrincipal
 */

//
public class VentanaPrincipal extends JFrame { // STUDY Para crear las ventanas la clase debe de derivar de Jframe

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JLabel etiqueta;
	private JTextField cajaTexto;
	private JButton boton, botonReset;


	// Constructor sin retorno ni void. Cosntructor por defecto sin parametros.
	public VentanaPrincipal () {
		// Se define el size de la ventana en px y la localización.
		// setBounds(x,y,w,h) Es el equivalente de las dos propiedades anteriores ya que le pasamos ubicacion y tamaño.
		setSize(300, 300);
		setLocationRelativeTo(null);

		// Ahora se establece el comportamiento al cerrar la ventana. Tiene varias opciones de comporatmiento EXIT_ON_CLOSE se cierra al pulsar en el boton x.
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Para no permitir redimesionar
		setResizable(false);

		// Definimos un titulo de la ventana
		setTitle("Mi primera GUI");

		// Para add un icono, y sustituir el icono de Java
		setIconImage(Toolkit.getDefaultToolkit().getImage("rocket.png"));

		// Organiza los elemetnos en la interface. Lo desactivamos para ubicar los componentes establecidos en la posiciones indicadas.
		setLayout(null); // STUDY setLayout a Null para establecer los componentes de forma personalizada.

		//STUDY Se crea un metodo para inicializar los componentes de la ventana
		inicializarComponentes();

		// Con esto hacemos visible la ventana.
		setVisible(true);
	}

	private void inicializarComponentes() {
		etiqueta = new JLabel("Nombre");
		etiqueta.setBounds(50,30,50,30);
		add(etiqueta);

		cajaTexto = new JTextField();
		cajaTexto.setBounds(110, 30, 110, 30);
		add(cajaTexto);

		boton = new JButton("Saludar");
		boton.setBounds(50, 80, 170, 30);
		add(boton);

		botonReset = new JButton("Borrar");
		botonReset.setBounds(50, 120, 170, 30);
		add(botonReset);

		// Ponemos el boton al eschucha, y pasamo una instancia del ManejadorEventos con el objeto actual de ventana. this.
		botonReset.addActionListener(new ManejadorEventos(this));
		// Al poner componentes en una ventana
	}

	public void establecerManejador (ManejadorEventos manejador) {
		boton.addActionListener(new ManejadorEventos(this));
		botonReset.addActionListener(new ManejadorEventos(this));
	}


	/**
	 * @return the etiqueta
	 */
	public JLabel getEtiqueta() {
		return etiqueta;
	}

	/**
	 * @param etiqueta the etiqueta to set
	 */
	public void setEtiqueta(JLabel etiqueta) {
		this.etiqueta = etiqueta;
	}

	/**
	 * @return the cajaTexto
	 */
	public JTextField getCajaTexto() {
		return cajaTexto;
	}

	/**
	 * @param cajaTexto the cajaTexto to set
	 */
	public void setCajaTexto(JTextField cajaTexto) {
		this.cajaTexto = cajaTexto;
	}

	/**
	 * @return the boton
	 */
	public JButton getBoton() {
		return boton;
	}

	/**
	 * @param boton the boton to set
	 */
	public void setBoton(JButton boton) {
		this.boton = boton;
	}

	/**
	 * @return the botonReset
	 */
	public JButton getBotonReset() {
		return botonReset;
	}

	/**
	 * @param botonReset the botonReset to set
	 */
	public void setBotonReset(JButton botonReset) {
		this.botonReset = botonReset;
	}
}