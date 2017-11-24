package controlador;

import java.util.ArrayList;

import modelo.dao.ProductoDao;
import modelo.vo.Clientes;
import modelo.vo.LineasPedido;
import modelo.vo.Productos;
import modelo.vo.Proveedor;
import modeloLogica.Logica;
import vista.AuxCrearFactura;	
import vista.AuxFacturasMes;
import vista.AuxMinimos;
import vista.AuxNuevoPedido;
import vista.AuxTablaBeneficios;
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
	VentanaProductos ventanaProductos; 
	VentanaPedidosFacturas ventanaPedidosFacturas;
	VentanaMinimos ventanaMinimos;
	VentanaIncrementarPrecio ventanaIncrementarPrecio;
	VentanaBeneficios ventanaBeneficios;
	VentanaValoracionExistencias ventanaValoracionExistencias;
	VentanaNuevoPedido ventanaNuevoPedido;
	VentanaConsultarPedidos ventanaConsultarPedidos;
	VentanaModificarPedido ventanaModificarPedido;
	VentanaEliminarPedido ventanaEliminarPedido;
	VentanaFacturasCliente ventanaFacturasCliente;
	VentanaFacturasMes ventanaFacturasMes;
	VentanaCrearFactura ventanaCrearFactura;

	Logica logica;


	ProductoDao productoDao = new ProductoDao();

	//Setters ventanas e lóxica


	public void setVentanaProductos(VentanaProductos ventanaProductos) {
		this.ventanaProductos = ventanaProductos;
	}

	public void setVentanaPedidosFacturas(VentanaPedidosFacturas ventanaPedidosFacturas) {
		this.ventanaPedidosFacturas = ventanaPedidosFacturas;
	}

	public void setVentanaMinimos(VentanaMinimos ventanaMinimos) {
		this.ventanaMinimos = ventanaMinimos;
	}

	public void setVentanaIncrementarPrecio(VentanaIncrementarPrecio ventanaIncrementarPrecio) {
		this.ventanaIncrementarPrecio = ventanaIncrementarPrecio;
	}

	public void setVentanaBeneficios(VentanaBeneficios ventanaBeneficios) {
		this.ventanaBeneficios = ventanaBeneficios;
	}

	public void setVentanaValoracionExistencias(VentanaValoracionExistencias ventanaValoracionExistencias) {
		this.ventanaValoracionExistencias = ventanaValoracionExistencias;
	}

	public void setVentanaNuevoPedido(VentanaNuevoPedido ventanaNuevoPedido) {
		this.ventanaNuevoPedido = ventanaNuevoPedido;
	}

	public void setVentanaConsultarPedidos(VentanaConsultarPedidos ventanaConsultarPedidos) {
		this.ventanaConsultarPedidos = ventanaConsultarPedidos;
	}

	public void setVentanaModificarPedido(VentanaModificarPedido ventanaModificarPedido) {
		this.ventanaModificarPedido = ventanaModificarPedido;
	}

	public void setVentanaEliminarPedido(VentanaEliminarPedido ventanaEliminarPedido) {
		this.ventanaEliminarPedido = ventanaEliminarPedido;
	}

	public void setVentanaFacturasCliente(VentanaFacturasCliente ventanaFacturasCliente) {
		this.ventanaFacturasCliente = ventanaFacturasCliente;
	}

	public void setVentanaFacturasMes(VentanaFacturasMes ventanaFacturasMes) {
		this.ventanaFacturasMes = ventanaFacturasMes;
	}

	public void setVentanaCrearFactura(VentanaCrearFactura ventanaCrearFactura) {
		this.ventanaCrearFactura = ventanaCrearFactura;
	}

	public void setLogica(Logica logica) {
		this.logica=logica;

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


	public ArrayList<Productos> cargarProductos() {
		// TODO Auto-generated method stub
		ArrayList<Productos> list = null;
		return list;
	}

	public ArrayList<Clientes> cargarClientes() {
		// TODO Auto-generated method stub
		ArrayList<Clientes> list = null;
		return list;
	}

	public ArrayList<AuxNuevoPedido> cargarPedido() {
		// TODO Auto-generated method stub
		return null;
	}


	public void mostrarVentanaPedidosFacturas() {
		ventanaPedidosFacturas = new VentanaPedidosFacturas();
		ventanaPedidosFacturas.setVisible(true);

	}

	public void mostrarVentanaProductos() {
		ventanaProductos = new VentanaProductos();
		ventanaProductos.setVisible(true);

	}

	public void mostrarVentanaMinimos() {
		ventanaMinimos = new VentanaMinimos();
		ventanaMinimos.setVisible(true);

	}

	public void mostrarVentanaIncrementarPrecio() {
		ventanaIncrementarPrecio = new VentanaIncrementarPrecio();
		ventanaIncrementarPrecio.setVisible(true);

	}

	public void mostrarVentanaBeneficios() {
		ventanaBeneficios = new VentanaBeneficios();
		ventanaBeneficios.setVisible(true);
	}

	public void mostrarVentanaValoracionExistencias() {
		ventanaValoracionExistencias = new VentanaValoracionExistencias();
		ventanaValoracionExistencias.setVisible(true);
	}

	public void mostrarVentanaNuevoPedido() {
		ventanaNuevoPedido = new VentanaNuevoPedido();
		ventanaNuevoPedido.setVisible(true);

	}

	public void mostrarVentanaModificarPedido() {
		ventanaModificarPedido = new VentanaModificarPedido();
		ventanaModificarPedido.setVisible(true);

	}

	public void mostrarVentanaEliminarPedidos() {
		ventanaEliminarPedido = new VentanaEliminarPedido();
		ventanaEliminarPedido.setVisible(true);

	}

	public void mostrarVentanaConsultarPedidos() {
		ventanaConsultarPedidos = new VentanaConsultarPedidos();
		ventanaConsultarPedidos.setVisible(true);

	}

	public void mostrarVentanaCrearFactura() {
		ventanaCrearFactura = new VentanaCrearFactura();
		ventanaCrearFactura.setVisible(true);

	}

	public void mostrarVentanaFacturaMes() {
		ventanaFacturasMes = new VentanaFacturasMes();
		ventanaFacturasMes.setVisible(true);
	}

	public void mostrarVentanaFacturaCliente(){
		ventanaFacturasCliente = new VentanaFacturasCliente();
		ventanaFacturasCliente.setVisible(true);
	}

	public ArrayList<AuxFacturasMes> cargarFacturasMes() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<AuxMinimos> cargarMinimos() {
		// TODO
		return productoDao.cargarMinimos();
	}
	
	public static void main(String[] args) {
		Controlador x = new Controlador();
		System.out.println(x.cargarMinimos());
		
	}



	public ArrayList<AuxTablaBeneficios> cargarBeneficio() {
		return productoDao.cargarBeneficios();
	}

	public ArrayList<AuxCrearFactura> cargarNuevaFactura() {
		// TODO Auto-generated method stub
		return null;
	}









}