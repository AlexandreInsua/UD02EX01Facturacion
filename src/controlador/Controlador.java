package controlador;

import java.util.ArrayList;


import modelo.vo.Clientes;
import modelo.vo.LineasPedido;
import modelo.vo.Productos;
import modelo.vo.Proveedor;
import vista.VentanaClientes;
import vista.VentanaPedidosFacturas;
import vista.VentanaProductos;



public class Controlador {
	VentanaProductos ventanaProductos = new VentanaProductos();
	VentanaPedidosFacturas ventanaPedidosFacturas = new VentanaPedidosFacturas();
	VentanaClientes ventanaClientes = new VentanaClientes();

	public ArrayList<Productos> cargarProductos() {
		// TODO Auto-generated method stub
		ArrayList<Productos> list = null;
		return list;
	}


	public ArrayList<LineasPedido> cargarLineasPedido() {
		// TODO Auto-generated method stub
		ArrayList<LineasPedido> list = null;
		return list;
	
	}

	public ArrayList<Proveedor> cargarProveedores() {
		// TODO Auto-generated method stub
		ArrayList<Proveedor> list = null;
		return list;
	
	}


	public ArrayList<Clientes> cargarClientes() {
		// TODO Auto-generated method stub
		ArrayList<Clientes> list = null;
		return list;
	}


	public void mostrarVentanaPedidosFacturas() {
			ventanaPedidosFacturas.setVisible(true);
		
	}


	public void mostrarVentanaProductos() {
		ventanaProductos.setVisible(true);
		
	}


	public void mostrarVentanaClientes() {
		ventanaClientes.setVisible(true);
		
	}

	

}
