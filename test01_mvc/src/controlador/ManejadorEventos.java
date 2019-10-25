package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaPrincipal;

/**
 * ManejadorEventos
 */


public class ManejadorEventos implements ActionListener {
	private VentanaPrincipal ventana;

	// En el constructor nos traemos el objeto ventana para acceder a su contenido.
	public ManejadorEventos(VentanaPrincipal ventana){
		this.ventana = ventana;
	}

	// Al implementar Action Listener sobrescribimos sus metodos, solo tiene uno. Aqui es donde se hace la accion a realizar.
	@Override
	public void actionPerformed(ActionEvent e) {
		// e tiene toda la informacion sobre el evento, entre ellas el objeto sobre el que ha producico ese evento.

		// getSource(Object) nos permite saber que objeto ejecuta la acción.
		if(e.getSource() == ventana.getBoton()) {
			ventana.setTitle("Robot: " + ventana.getCajaTexto().getText());
		}

		// Ponemos el foco en la caja de texto
		if (e.getSource() == ventana.getBotonReset()) {
			// Se borra el texto
			ventana.getCajaTexto().setText("");

			// STUDY requestFocus() Se lleva el focus a la caja de texto para volver a escribir.
			ventana.getCajaTexto().requestFocus();
		}
	}
}