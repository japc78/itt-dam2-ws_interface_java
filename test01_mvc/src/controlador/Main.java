package controlador;

import vista.VentanaPrincipal;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		VentanaPrincipal miVentana = new VentanaPrincipal();
		ManejadorEventos manejador = new ManejadorEventos(miVentana);

		miVentana.establecerManejador(manejador);
	}
}