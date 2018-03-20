package vista;

import java.util.ArrayList;

import javax.swing.JComboBox;

import controlador.Controlador;
import modelo.vo.Pedidos;

public class ComboPedidos extends JComboBox<Pedidos>{
	ArrayList<Pedidos> pedidos = null;
	Controlador controlador = new Controlador();
	
	public void setControldador(Controlador controlador){
		this.controlador = controlador;
	}

	public ComboPedidos(){
		cargarPedidos();
	}

	private void cargarPedidos() {
		pedidos = controlador.cargarPedidos();
		for (Pedidos pedido : pedidos){
			this.addItem(pedido);
		}
		
	}
}
