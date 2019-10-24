package app;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// STUDY Diferentes tipos de eventos sin MVC

// Para convertir una clase en ventana es necesairo que extienda de JFrame
public class App extends JFrame {
    // Los componentes de una ventana son sus atributos, y son privados. Se declaran para posteriormente declararlos en la funcion de inicializarComponentes()
    // Las etiquetas son del tipo JLabel.
    private JLabel imagen;

    // Checkbox
    private JCheckBox check;

    // Boton
    private JButton boton;

    /**
     *
     */
    private static final long serialVersionUID = 5430513214412853815L;

    // Constructor de la clase para constrir la ventana.
    public App() {
		// Dimesiones de la ventana
		setSize(650, 270);

		// Ubicacion de salida de la ventana. Con null decimos que la centre en la pantalla.
		setLocationRelativeTo(null);

		// Boton de cierre, se le da funcionalidad, al hacer click que cierre la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Se desactiva el organizador de componetes para asi poder colocar cada componente en una posicion deseada mediante coordenadas. Vallor a null para que no se active ningun organizador.
        setLayout(null);

        // Incicializamos los componentes con la funcion.
        inicializarComponentes();

        // Hacemos visible la ventana.
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        // Instanciamos la clase en el main para crear la ventana.
        new App();
    }

    // Funcion para inicializar los componentes, sin parametros. Se llama en el constructor, y se encargar de dar un tamaño a los componentes y posicionarlos.
    private void inicializarComponentes() {
        // STUDY getContentPane().setBackground(Color).-> Ponemos el fondo de color de la ventanan en blanco.
        getContentPane().setBackground(Color.WHITE);

        // Creamos la etiqueta imagen.
        imagen = new JLabel(new ImageIcon("imagen01.png"));

        // Le damos una posicion y tamaño
        imagen.setBounds(0, 0, 256, 256);
        add(imagen);

        // Añadimos un escuchador (relacionado con el raton),un Listener, para que la etiqueta esté a la escucha.
        // Es necesario implementar la interfae MouseListener(), al instanciarlo al ser una interface se sobreescriben sus metodos, no es necesrio implementarlos todos sino solo aquellos que nos sean necesarios. En este caso mouseEntered y mouseExited para la salida y entrada del raton en la etiqueta.
        imagen.addMouseListener(new MouseListener(){
            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            // Al Salir el raton.
            @Override
            public void mouseExited(MouseEvent e) {
                imagen.setIcon(new ImageIcon("imagen01.png"));
            }

            // Al entrar el raton.
            @Override
            public void mouseEntered(MouseEvent e) {
                imagen.setIcon(new ImageIcon("imagen02.png"));
            }

            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });

        // Checkbox
        // Se instancia el checkbox
        check = new JCheckBox("Acepta las condiciones");

        // Se posiciona y se le da un tamaño, y se le quita el fondo por defecto.
        check.setBounds(350, 50, 200, 30);
        check.setBackground(null);

        // Se añade al a ventana.
        add(check);

        // Se pone el checkbox a la escucha. la eschua
        check.addChangeListener(new ChangeListener(){

            @Override
            public void stateChanged(ChangeEvent e) {
                if (check.isSelected()) {
                    boton.setEnabled(true);
                } else {
                    boton.setEnabled(false);
                }
            }
        } );


        // Boton
        // Se instancia el boton
        boton = new JButton("Continuar");

        // Se posiciona y se le da un tamaño.
        boton.setBounds(350, 100, 145, 30);

        // Se inabilita para solo activarlo en cuando el check este en checked.
        boton.setEnabled(false);

        // Se añade al a ventana.
        add(boton);

        boton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Genial", "", JOptionPane.PLAIN_MESSAGE );
            }
        });
    }

}