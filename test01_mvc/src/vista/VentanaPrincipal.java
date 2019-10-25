package vista;

// Paquetes
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.io.IOException;

import controlador.ManejadorEventos;

/**
 * VentanaPrincipal
 */

public class VentanaPrincipal extends JFrame { // STUDY Para crear las ventanas la clase debe de derivar de Jframe

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JLabel etiqueta, logo, appName;
	private JTextField cajaTexto;
	private JButton boton, botonReset;
	private Font font;

	// Constructor sin retorno ni void. Cosntructor por defecto sin parametros.
	public VentanaPrincipal() {
		// Se define el size de la ventana en px y la localización.
		// setBounds(x,y,w,h) Es el equivalente de las dos propiedades anteriores ya que
		// le pasamos ubicacion y tamaño.
		setSize(285, 445);
		setLocationRelativeTo(null);

		// Ahora se establece el comportamiento al cerrar la ventana. Tiene varias
		// opciones de comporatmiento EXIT_ON_CLOSE se cierra al pulsar en el boton x.
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Para no permitir redimesionar
		setResizable(false);

		// Definimos un titulo de la ventana
		setTitle("We are the robots");

		// Para add un icono, y sustituir el icono de Java
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/resources/rocket.png"));

		// Organiza los elemetnos en la interface. Lo desactivamos para ubicar los
		// componentes establecidos en la posiciones indicadas.
		setLayout(null); // STUDY setLayout a Null para establecer los componentes de forma
							// personalizada.

		// STUDY Se crea un metodo para inicializar los componentes de la ventana
		inicializarComponentes();

		// Con esto hacemos visible la ventana.
		setVisible(true);
	}

	private void inicializarComponentes() {
		Color color1 = new Color(0, 0, 0);
		Color color2 = new Color(75, 215, 200);
		Border border = BorderFactory.createLineBorder(Color.BLACK, 3);

		Image img = new ImageIcon("src/resources/logo.png").getImage();
		;

		logo = new JLabel(new ImageIcon(img.getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		logo.setBounds(40, 35, 200, 200);
		add(logo);

		// Se crea la fuente
		try {
			font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("../resources/lightsider.ttf"));
		} catch (FontFormatException e)  {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		appName = new JLabel("BitCero");
		appName.setHorizontalAlignment(SwingConstants.CENTER);
		appName.setFont(font.deriveFont(Font.PLAIN ,28));
		appName.setBounds(0, 240, 285, 50);
		appName.setForeground(Color.BLACK);
		add(appName);


		etiqueta = new JLabel(new ImageIcon("src/resources/avatar.png"));
		etiqueta.setBounds(15,300,30,30);
		add(etiqueta);

		cajaTexto = new JTextField();
		cajaTexto.setBounds(60, 300, 197, 30);
		cajaTexto.setBorder(border);
		cajaTexto.setFont(new Font("Dialog", Font.BOLD, 14));
		cajaTexto.setForeground(color1);
		cajaTexto.setBorder(BorderFactory.createCompoundBorder(cajaTexto.getBorder(),
			BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		add(cajaTexto);

		Font fontButtom = font.deriveFont(Font.PLAIN ,14);

		boton = new JButton("Entrar");
		boton.setFont(fontButtom);
		boton.setBounds(20, 340, 115, 30);
		boton.setForeground(color1);
		boton.setBackground(color2);
		boton.setFocusPainted(false);
		boton.setBorder(border);
		add(boton);

		botonReset = new JButton("Borrar");
		botonReset.setFont(fontButtom);
		botonReset.setBounds(142, 340, 115, 30);
		botonReset.setForeground(color1);
		botonReset.setBackground(color2);
		botonReset.setFocusPainted(false);
		botonReset.setBorder(border);
		add(botonReset);

		// Ponemos el boton al eschucha, y pasamo una instancia del ManejadorEventos con el objeto actual de ventana. this.
		botonReset.addActionListener(new ManejadorEventos(this));
		// Al poner componentes en una ventana
	}

	public void establecerManejador (ManejadorEventos manejador) {
		boton.addActionListener(new ManejadorEventos(this));
		botonReset.addActionListener(new ManejadorEventos(this));
	}

	// Getters and Setters
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