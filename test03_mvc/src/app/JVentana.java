package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JVentana extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -5913923769009650253L;

    // Constructor sin parametros es necesario para crear la ventana. En el se
    // añaden como mínimo
    // Título de la ventana, tamaño y posición y visualización de la ventana.
    public JVentana() {
        super("Mi primera ventana");

        // setLayout determina la forma de verse de los controles, por defecto los apila
        // uno encima del otro haciendo que ocupen toda la dimension de la ventana. Para
        // anularlo se le pasa por parametro Null, y asi se puede posicionar de manera
        // absoulta cada elemento.
        this.setLayout(null);

        // setDefacultCloseOperacion representa el comportamiento del boton de cierre de
        // la ventana. Se debe incluir en el constructro si queremos asignarle una
        // funciolidad distinta a la de por defecto (se cierra la ventana pero sigue en
        // ejecución). Hay que añadiro justo antes de darle posición y tamaño.
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(MAXIMIZED_BOTH, ABORT, 800, 400);

        // Permite centrar la ventana en el centro de la pantalla al ejecutar el
        // programa.
        this.setLocationRelativeTo(null);

        // Inicializamos los componentes de la interface.
        initComponents();

        // Se hace visible la ventana, siempre al final del constructor.
        this.setVisible(true);
    }

    public void initComponents() {
        // Creación de un botón.
        JButton jb1 = new JButton("Pulsar aquí");
        jb1.setBounds(100, 100, 150, 60);
        this.add(jb1);

        // Creación de etiquetas. Se le para por parametros el texto y la alinación
        // LEFT, RIGHT O CENTER.
        JLabel jlb1 = new JLabel("Introduce dato: ", JLabel.LEFT);
        jlb1.setBounds(275, 100, 150, 60);
        this.add(jlb1);

        // Creamos controles de menu
        JMenuBar jmb = new JMenuBar();
        JMenu jmArchivo = new JMenu("Archivo");

        JMenuItem jmiAbrir = new JMenuItem("Abrir");
        jmArchivo.add(jmiAbrir);

        JMenuItem jmiGuardar = new JMenuItem("Guardar");
        jmArchivo.add(jmiGuardar);

        jmArchivo.addSeparator();

        // submenú en opción "Archivo"
        JMenu jsubmenuArchivo = new JMenu("Otras");
        JMenuItem jmiRecordar = new JMenuItem("Recordar");
        jsubmenuArchivo.add(jmiRecordar);
        JMenuItem jmiSalir = new JMenuItem("Salir");
        jsubmenuArchivo.add(jmiSalir);
        jmArchivo.add(jsubmenuArchivo);
        jmb.add(jmArchivo);
        this.setJMenuBar(jmb);

        // gestión de evento
        // jmiSalir.addActionListener(new ActionListener() {

        // @Override
        // public void actionPerformed(ActionEvent e) {
        // System.exit(0);
        // }
        // });

        jmiSalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });

    }
}