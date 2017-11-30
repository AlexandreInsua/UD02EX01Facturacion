package vista;

import java.util.ArrayList;

import javax.swing.JComboBox;

import controlador.Controlador;
import modelo.vo.Proveedor;

public class ComboIncrementar extends JComboBox<Proveedor> {
	ArrayList<Proveedor> proveedor = null;
	Controlador controlador = new Controlador();

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public ComboIncrementar() {
		cargarProveedores();
	}

	private void cargarProveedores() {

		proveedor = controlador.cargarProveedor();
		for (Proveedor proveedor : proveedor) {
			this.addItem(proveedor);
		}
	}
}
