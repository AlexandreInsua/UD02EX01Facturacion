package controlador;

import java.util.ArrayList;

import modelo.vo.Clientes;
import modelo.vo.LineasPedido;
import modelo.vo.Productos;
import modelo.vo.Proveedor;
import vista.facturas.VentanaCrearFactura;
import vista.facturas.VentanaFacturasCliente;
import vista.facturas.VentanaFacturasMes;
import vista.facturas.VentanaPedidosFacturas;
import vista.pedido.VentanaConsultarPedidos;
import vista.pedido.VentanaEliminarPedido;
import vista.pedido.VentanaModificarPedido;
import vista.pedido.VentanaNuevoPedido;
import vista.productos.VentanaBeneficios;
import vista.productos.VentanaIncrementarPrecio;
import vista.productos.VentanaMinimos;
import vista.productos.VentanaProductos;
import vista.productos.VentanaValoracionExistencias;

public class Controlador {
	VentanaProductos ventanaProductos = new VentanaProductos();
	VentanaPedidosFacturas ventanaPedidosFacturas = new VentanaPedidosFacturas();
	VentanaMinimos ventanaMinimos = new VentanaMinimos();
	VentanaIncrementarPrecio ventanaIncrementarPrecio = new VentanaIncrementarPrecio();
	VentanaBeneficios ventanaBeneficios = new VentanaBeneficios();
	VentanaValoracionExistencias ventanaValoracionExistencias = new VentanaValoracionExistencias();
	VentanaNuevoPedido ventanaNuevoPedido = new VentanaNuevoPedido();
	VentanaConsultarPedidos ventanaConsultarPedidos = new VentanaConsultarPedidos();
	VentanaModificarPedido ventanaModificarPedido = new VentanaModificarPedido();
	VentanaEliminarPedido ventanaEliminarPedido = new VentanaEliminarPedido();
	VentanaFacturasCliente ventanaFacturasCliente = new VentanaFacturasCliente();
	VentanaFacturasMes ventanaFacturasMes = new VentanaFacturasMes();
	VentanaCrearFactura ventanaCrearFactura = new VentanaCrearFactura();

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

	public void mostrarVentanaMinimos() {
		ventanaMinimos.setVisible(true);

	}

	public void mostrarVentanaIncrementarPrecio() {
		ventanaIncrementarPrecio.setVisible(true);

	}

	public void mostrarVentanaBeneficios() {
		ventanaBeneficios.setVisible(true);
	}

	public void mostrarVentanaValoracionExistencias() {
		ventanaValoracionExistencias.setVisible(true);
	}

	public void mostrarVentanaNuevoPedido() {
		ventanaNuevoPedido.setVisible(true);
		
	}

	public void mostrarVentanaModificarPedido() {
		ventanaModificarPedido.setVisible(true);
		
	}

	public void mostrarVentanaEliminarPedidos() {
ventanaEliminarPedido.setVisible(true);
		
	}

	public void mostrarVentanaConsultarPedidos() {
	ventanaConsultarPedidos.setVisible(true);
		
	}

	public void mostrarVentanaCrearFactura() {
		ventanaCrearFactura.setVisible(true);
		
	}

	public void mostrarVentanaFacturaMes() {
		ventanaFacturasMes.setVisible(true);
	}
	
	public void mostrarVentanaFacturaCliente(){
		ventanaFacturasCliente.setVisible(true);
	}

	
}
