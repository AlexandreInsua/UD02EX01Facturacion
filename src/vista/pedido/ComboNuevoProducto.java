package vista.pedido;

import java.util.ArrayList;

import javax.swing.JComboBox;

import controlador.Controlador;
import modelo.vo.Productos;
import modelo.vo.Proveedor;

public class ComboNuevoProducto extends JComboBox<Productos> {

	ArrayList<Productos> producto = null;
	Controlador controlador = new Controlador();

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public ComboNuevoProducto() {
		cargarProductos();
	}

	private void cargarProductos() {

		producto = controlador.cargarProductos();
		for (Productos producto : producto) {
			this.addItem(producto);
		}
	}
}