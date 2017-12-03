package vista.pedido;

import java.util.ArrayList;

import javax.swing.JComboBox;

import controlador.Controlador;
import modelo.vo.Clientes;
import modelo.vo.Pedidos;
import modelo.vo.Productos;

public class ComboPedido extends JComboBox<Pedidos> {
	ArrayList<Pedidos> pedido = null;
	Controlador controlador = new Controlador();

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public ComboPedido() {
		cargarId();
	}

	private void cargarId() {

		pedido = controlador.cargarId();
		for (Pedidos pedido : pedido) {
			this.addItem(pedido);
		}
	}

}
