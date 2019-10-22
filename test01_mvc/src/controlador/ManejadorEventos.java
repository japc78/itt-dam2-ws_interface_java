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

		// getSource(Object) nos permite saber sober que objeto se ejecuta la acción.
		if(e.getSource() == ventana.getBoton()) {
			ventana.setTitle("Hola" + ventana.getCajaTexto().getText());
		} else {
			ventana.getCajaTexto().setText(null);
		}
	}
}