package controlador;

import modeloLogica.Logica;
import vista.VentanaPrincipal;
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

public class Principal {
	
	VentanaPrincipal ventanaPrincipal;
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
	Controlador controlador;

	Logica logica;

	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.iniciar();

	}

	private void iniciar() {
		ventanaPrincipal= new VentanaPrincipal();
		ventanaProductos = new VentanaProductos();
		ventanaPedidosFacturas = new VentanaPedidosFacturas();
		ventanaMinimos = new VentanaMinimos();
		ventanaIncrementarPrecio = new VentanaIncrementarPrecio();
		ventanaBeneficios = new VentanaBeneficios();
		ventanaValoracionExistencias = new VentanaValoracionExistencias();
		ventanaNuevoPedido = new VentanaNuevoPedido();
		ventanaConsultarPedidos = new VentanaConsultarPedidos();
		ventanaModificarPedido = new VentanaModificarPedido();
		ventanaEliminarPedido = new VentanaEliminarPedido();
		ventanaFacturasCliente = new VentanaFacturasCliente();
		ventanaFacturasMes = new VentanaFacturasMes();
		ventanaCrearFactura = new VentanaCrearFactura();
		controlador = new Controlador();
		logica = new Logica();
		
		//Chamada ao método setControlador
		
		ventanaProductos.setControlador(controlador);
		ventanaPedidosFacturas.setControlador(controlador);
		ventanaMinimos.setControlador(controlador);
		ventanaIncrementarPrecio.setControlador(controlador);
		ventanaBeneficios.setControlador(controlador);
		ventanaValoracionExistencias.setControlador(controlador);
		ventanaNuevoPedido.setControlador(controlador);
		ventanaConsultarPedidos.setControlador(controlador);
		ventanaModificarPedido.setControlador(controlador);
		ventanaEliminarPedido.setControlador(controlador);
		ventanaFacturasCliente.setControlador(controlador);
		ventanaFacturasMes.setControlador(controlador);
		ventanaCrearFactura.setControlador(controlador);
		logica.setControlador(controlador);
		
		
		controlador.setVentanaProductos(ventanaProductos);
		controlador.setVentanaPedidosFacturas(ventanaPedidosFacturas);
		controlador.setVentanaMinimos(ventanaMinimos);
		controlador.setVentanaIncrementarPrecio(ventanaIncrementarPrecio);
		controlador.setVentanaBeneficios(ventanaBeneficios);
		controlador.setVentanaValoracionExistencias(ventanaValoracionExistencias);
		controlador.setVentanaNuevoPedido(ventanaNuevoPedido);
		controlador.setVentanaConsultarPedidos(ventanaConsultarPedidos);
		controlador.setVentanaModificarPedido(ventanaModificarPedido);
		controlador.setVentanaEliminarPedido(ventanaEliminarPedido);
		controlador.setVentanaFacturasCliente(ventanaFacturasCliente);
		controlador.setVentanaFacturasMes(ventanaFacturasMes);
		controlador.setVentanaCrearFactura(ventanaCrearFactura);
		controlador.setLogica(logica);
		
		
		ventanaPrincipal.setVisible(true);
		

	}

}
