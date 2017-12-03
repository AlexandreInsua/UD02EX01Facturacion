package vista.pedido;

import java.util.ArrayList;

import javax.swing.JComboBox;

import controlador.Controlador;
import modelo.vo.Clientes;
import modelo.vo.Productos;

public class ComboClientes extends JComboBox<Clientes> {
	ArrayList<Clientes> cliente = null;
	Controlador controlador = new Controlador();

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public ComboClientes() {
		cargarClientes();
	}

	private void cargarClientes() {

		cliente = controlador.cargarClientes();
		for (Clientes clientes : cliente) {
			this.addItem(clientes);
		}
	}

}
