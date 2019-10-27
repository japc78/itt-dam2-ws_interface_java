package vista;

// Paquetes
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import controlador.ManejadorEventos;

import java.io.IOException;


/**
 * VentanaPrincipal
 */

public class VentanaSecundaria extends JDialog { // STUDY Para crear las ventanas la clase debe de derivar de Jframe

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JLabel userFoto, appName;
	private JButton boton;
	private Font font;
	private ManejadorEventos controlador;

	// Constructor sin retorno ni void. Cosntructor por defecto sin parametros.
	public VentanaSecundaria(ManejadorEventos controlador) {
		this.controlador = controlador;
		// Se define el size de la ventana en px y la localización.
		// setBounds(x,y,w,h) Es el equivalente de las dos propiedades anteriores ya que
		// le pasamos ubicacion y tamaño.
		setSize(285, 445);
		setLocationRelativeTo(null);

		// Ahora se establece el comportamiento al cerrar la ventana. Tiene varias
		// opciones de comporatmiento EXIT_ON_CLOSE se cierra al pulsar en el boton x.
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

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
		Border border5 = BorderFactory.createLineBorder(Color.BLACK, 5);

		// Se crea la fuente
		try {
			font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("../resources/lightsider.ttf"));
		} catch (FontFormatException e)  {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Image userImg = new ImageIcon("src/resources/human.png").getImage();
		userFoto = new JLabel(new ImageIcon(userImg.getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		userFoto.setBounds(15,15,250,250);
		userFoto.setBorder(border5);
		add(userFoto);

		appName = new JLabel("Hi!, ");
		appName.setHorizontalAlignment(SwingConstants.CENTER);
		appName.setFont(font.deriveFont(Font.PLAIN ,28));
		appName.setBounds(0, 265, 285, 50);
		appName.setForeground(Color.BLACK);
		add(appName);

		Font fontButtom = font.deriveFont(Font.PLAIN ,14);

		boton = new JButton("Cerrar");
		boton.setFont(fontButtom);
		boton.setBounds(73, 350, 115, 30);
		boton.setForeground(color1);
		boton.setBackground(color2);
		boton.setFocusPainted(false);
		boton.setBorder(border);
		add(boton);

		boton.addActionListener(controlador);
	}

	public void pasaNombre(String user) {
		appName.setText(user);
	}

	// Getters and Setters
		/**
		 * @return the etiqueta
		 */
		public JLabel getEtiqueta() {
			return userFoto;
		}

		/**
		 * @param etiqueta the etiqueta to set
		 */
		public void setEtiqueta(JLabel userFoto) {
			this.userFoto = userFoto;
		}

		/**
		 * @return the boton
		 */
		public JButton getBoton() {
			return boton;
		}

}