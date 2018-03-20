package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.sql.Connection;

import javax.swing.JOptionPane;

import conexion.Conexion;
import modelo.vo.Clientes;
import modelo.vo.LineasPedido;
import modelo.vo.Pedidos;
import modelo.vo.Productos;
import modelo.vo.Proveedor;
import utilidades.ConvertirFechas;
import vista.AuxCrearFactura;
import vista.AuxFacturasClientes;
import vista.AuxListadoPedidos;
import vista.AuxMinimos;
import vista.DatosPedidoFacturaCliente;
import vista.DatosPedidoFacturaTotal;

public class PedidosDao {
	private static Conexion conexion = null;
	ArrayList<AuxCrearFactura> lineasPedido = null;

	public static ArrayList<Productos> cargarProductos() {
		// conexion
		Conexion conexion = new Conexion();

		// Perapramos a consulta de actualizacion
		PreparedStatement ps = null;
		ResultSet resultado = null;

		Productos minimo = null;
		ArrayList<Productos> lista = new ArrayList<Productos>();

		// limpar dados
		lista.clear();

		// Consulta - A SENTENZA NON LEVA PUNTO E COMA
		String consulta = "SELECT pdNombre FROM productos";

		// Conecta e executa a sentenza
		try {
			ps = conexion.getConexion().prepareStatement(consulta);
			resultado = ps.executeQuery();
			while (resultado.next()) {
				minimo = new Productos();
				minimo.setProducto(resultado.getString("pdNombre"));
				lista.add(minimo);

			}
			ps.close();
			resultado.close();
			conexion.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, non se conectó");
			System.out.println(e);
		}
		// System.out.println(lista);
		return lista;

	} // fin cargaProveedor

	public static ArrayList<Clientes> cargarClientes() {
		// conexion
		Conexion conexion = new Conexion();

		// Perapramos a consulta de actualizacion
		PreparedStatement ps = null;
		ResultSet resultado = null;

		Clientes minimo = null;
		ArrayList<Clientes> lista = new ArrayList<Clientes>();

		// limpar dados
		lista.clear();

		// Consulta - A SENTENZA NON LEVA PUNTO E COMA
		String consulta = "SELECT clNombre FROM clientes";

		// Conecta e executa a sentenza
		try {
			ps = conexion.getConexion().prepareStatement(consulta);
			resultado = ps.executeQuery();
			while (resultado.next()) {
				minimo = new Clientes();
				minimo.setNombre(resultado.getString("clNombre"));
				lista.add(minimo);

			}
			ps.close();
			resultado.close();
			conexion.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, non se conectó");
			System.out.println(e);
		}
		// System.out.println(lista);
		return lista;

	} // fin cargaClientes

	public static String obtenerDniCliente(String nombre) {
		// conexion
		Conexion conexion = new Conexion();

		// Perapramos a consulta de actualizacion
		PreparedStatement ps = null;
		ResultSet resultado = null;

		String dni = null;

		// Consulta - A SENTENZA NON LEVA PUNTO E COMA
		String consulta = "SELECT clNif FROM clientes Where clNombre = '" + nombre + "'";

		// Conecta e executa a sentenza
		try {
			ps = conexion.getConexion().prepareStatement(consulta);
			resultado = ps.executeQuery();
			while (resultado.next()) {
				dni = (resultado.getString("clNif"));

			}
			ps.close();
			resultado.close();
			conexion.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, non se conectó");
			System.out.println(e);
		}
		// System.out.println(lista);
		return dni;

	} // fin cargaClientes

	public static String contarPedidos() {
		// conexion
		Conexion conexion = new Conexion();

		// Perapramos a consulta de actualizacion
		PreparedStatement ps = null;
		ResultSet resultado = null;

		int ultimoPedido = 0;

		// Consulta - A SENTENZA NON LEVA PUNTO E COMA
		String consulta = "SELECT COUNT(peNumPedido) FROM pedidos";

		// Conecta e executa a sentenza
		try {
			ps = conexion.getConexion().prepareStatement(consulta);
			resultado = ps.executeQuery();
			while (resultado.next()) {
				ultimoPedido = resultado.getInt("COUNT(peNumPedido)");

			}
			ps.close();
			resultado.close();
			conexion.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, non se conectó");
			System.out.println(e);
		}
		// System.out.println(ultimoPedido);
		ultimoPedido++;
		String ultimo = ultimoPedido + "";
		return ultimo;

	} // fin

	public static ArrayList<Pedidos> cargarId() {
		// conexion
		Conexion conexion = new Conexion();

		// Perapramos a consulta de actualizacion
		PreparedStatement ps = null;
		ResultSet resultado = null;

		Pedidos minimo = null;
		ArrayList<Pedidos> lista = new ArrayList<Pedidos>();

		// limpar dados
		lista.clear();

		// Consulta - A SENTENZA NON LEVA PUNTO E COMA
		String consulta = "SELECT peNumPedido FROM pedidos";

		// Conecta e executa a sentenza
		try {
			ps = conexion.getConexion().prepareStatement(consulta);
			resultado = ps.executeQuery();
			while (resultado.next()) {
				minimo = new Pedidos();
				minimo.setNumPedido(resultado.getInt("peNumPedido"));
				lista.add(minimo);

			}
			ps.close();
			resultado.close();
			conexion.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, non se conectó");
			System.out.println(e);
		}
		// System.out.println(lista);
		return lista;

	} // fin cargaId

	public static ArrayList<AuxListadoPedidos> listarPedidos(int codigo) {
		// conexion
		Conexion conexion = new Conexion();

		// Perapramos a consulta de actualizacion
		PreparedStatement ps = null;
		ResultSet resultado = null;

		AuxListadoPedidos minimo = null;
		ArrayList<AuxListadoPedidos> lista = new ArrayList<AuxListadoPedidos>();

		// limpar dados
		lista.clear();

		// Consulta - A SENTENZA NON LEVA PUNTO E COMA
		String consulta = " SELECT liId, peFecha, clNombre, pdId, pdNombre, pdPrecioVenta, liCantidad,"
				+ " (pdPrecioVenta * liCantidad) AS 'Importe'"
				+ " FROM ((pedidos JOIN clientes ON peNifCliente = clNif) JOIN lineaspedido ON peNumPedido = liNumPedido) JOIN productos ON liIdProducto = pdid"
				+ " where liNumPedido=" + codigo;
		// Conecta e executa a sentenza
		try {
			ps = conexion.getConexion().prepareStatement(consulta);
			resultado = ps.executeQuery();
			while (resultado.next()) {
				minimo = new AuxListadoPedidos();
				minimo.setFechaPedido(resultado.getDate("peFecha"));
				minimo.setNombreCliente(resultado.getString("clNombre"));
				minimo.setNumLinea(resultado.getShort("liId"));
				minimo.setProducto(resultado.getString("pdNombre"));
				minimo.setPrecioVenta(resultado.getFloat("pdPrecioVenta"));
				minimo.setCantidad(resultado.getInt("liCantidad"));
				minimo.setImporte(resultado.getFloat("Importe"));

				lista.add(minimo);

			}
			ps.close();
			resultado.close();
			conexion.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, non se conectó");
			System.out.println(e);
		}
		// System.out.println(lista.get(3));
		return lista;

	} // fin

	// public static void main(String[] args) {
	// listarPedidos(2);
	// }

	public static int obtenerNumLinea(int codigo, String descripcion) {
		// conexion
		Conexion conexion = new Conexion();

		// Perapramos a consulta de actualizacion
		PreparedStatement ps = null;
		ResultSet resultado = null;

		int id = 0;

		// Consulta - A SENTENZA NON LEVA PUNTO E COMA
		String consulta = "SELECT liId FROM lineasPedido JOIN productos ON pdId=liIdProducto WHERE pdNombre ="
				+ descripcion + " and liNumPedido =" + codigo;

		// Conecta e executa a sentenza
		try {
			ps = conexion.getConexion().prepareStatement(consulta);
			resultado = ps.executeQuery();
			while (resultado.next()) {
				id = (resultado.getInt("liId"));

			}
			ps.close();
			resultado.close();
			conexion.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, non se conectó");
			System.out.println(e);
		}
		// System.out.println(lista);
		return id;

	} // fin cargaId

	public static void eliminarPedido(int codigo) {
		Conexion conexion = new Conexion();
		// Perapramos a consulta de actualizacion
		PreparedStatement ps = null;

		// Consulta - A SENTENZA NON LEVA PUNTO E COMA

		String consulta = " DELETE FROM lineasPedido where liNumPedido=" + codigo;
		String consulta2 = " DELETE FROM pedidos where peNumPedido=" + codigo;
		// Conecta e executa a sentenza
		try {
			ps = conexion.getConexion().prepareStatement(consulta);
			ps.execute();
			ps = conexion.getConexion().prepareStatement(consulta2);
			ps.execute();

			ps.close();

			conexion.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, non se conectó");
			System.out.println(e);
		}

	}

	public static void eliminarLineaPedido(int codigo, int numLineaPedido) {
		Conexion conexion = new Conexion();
		// Perapramos a consulta de actualizacion
		PreparedStatement ps = null;

		// Consulta - A SENTENZA NON LEVA PUNTO E COMA

		String consulta = " DELETE FROM lineasPedido where liNumPedido=" + codigo + " and liId=" + numLineaPedido;

		// Conecta e executa a sentenza
		try {
			ps = conexion.getConexion().prepareStatement(consulta);
			ps.execute();

			ps.close();

			conexion.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, non se conectó");
			System.out.println(e);
		}

	}

	public static Productos recuperarProducto(String descripcion) {
		// conexion
		Conexion conexion = new Conexion();

		// Perapramos a consulta de actualizacion
		PreparedStatement ps = null;
		ResultSet resultado = null;

		Productos producto = null;

		// Consulta - A SENTENZA NON LEVA PUNTO E COMA
		String consulta = "select pdId, pdPrecioVenta from productos where pdNombre='" + descripcion + "'";
		// Conecta e executa a sentenza
		try {
			ps = conexion.getConexion().prepareStatement(consulta);
			resultado = ps.executeQuery();
			while (resultado.next()) {
				producto = new Productos();
				producto.setCodigo(resultado.getShort("pdId"));
				producto.setPrecioVenta(resultado.getFloat("pdPrecioVenta"));

			}
			ps.close();
			resultado.close();
			conexion.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, non se conectó");
			System.out.println(e);
		}
		// System.out.println(lista);
		return producto;
	}

	public static void introducirNuevoPedido(Pedidos pedido, ArrayList<LineasPedido> lineas) {

		Conexion conexion = new Conexion();
		Connection conn = conexion.getConexion();
		// Perapramos a consulta de actualizacion
		PreparedStatement ps = null;
		ResultSet resultado = null;
		java.util.Date fechaJAVA = ParseFecha(pedido.getFechaPedido());
		java.sql.Date fechaSQL = convertirJavaDateASqlDate(fechaJAVA);
		String consulta1 = "INSERT INTO pedidos (peNumPedido, peFecha, peNifCliente,peDescuento)" + " VALUES("
				+ pedido.getNumPedido() + ",'" + fechaSQL + "','" + pedido.getNifCliente() + "' ,"
				+ pedido.getDescuento() + ")";

		// Conecta e executa a sentenza
		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(consulta1);
			ps.executeUpdate();
			for (LineasPedido lineasPedido : lineas) {
				String consulta2 = "INSERT INTO lineaspedido (liNumPedido, liIdProducto, liCantidad)" + " VALUES("
						+ lineasPedido.getNumPedido() + "," + lineasPedido.getIdProducto() + ","
						+ lineasPedido.getCantidad() + ")";
				ps = conn.prepareStatement(consulta2);
				ps.executeUpdate();
			}
			conn.commit();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, ao insertar datos");
			System.out.println(e);
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public static Date ParseFecha(String fecNac) {
		try {
			// convertir la fecha de un String a un tipo Date
			SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaNac = (Date) formatoDelTexto.parse(fecNac);
			return fechaNac;
		} catch (ParseException pe) {
			JOptionPane.showMessageDialog(null, "Error al introducir la fecha.", "Información",
					JOptionPane.INFORMATION_MESSAGE);
		}
		return null;
	}

	public static java.sql.Date convertirJavaDateASqlDate(java.util.Date date) {

		return new java.sql.Date(date.getTime());
	}

	public static ArrayList<AuxFacturasClientes> cargarFacturasClientes(String nombre) {
		// conexion
		Conexion conexion = new Conexion();

		// Perapramos a consulta de actualizacion
		PreparedStatement ps = null;
		ResultSet resultado = null;

		AuxFacturasClientes facturas = null;
		ArrayList<AuxFacturasClientes> lista = new ArrayList<AuxFacturasClientes>();

		// Consulta - A SENTENZA NON LEVA PUNTO E COMA
		String consulta = "SELECT peNumPedido, peFecha, sum(pdPrecioVenta) as pdPrecioVenta  FROM ((pedidos JOIN clientes ON peNifCliente = clNif) JOIN lineaspedido ON peNumPedido = liNumPedido) JOIN productos ON liIdProducto = pdid  where clNombre='"
				+ nombre + "' GROUP BY peNumPedido ";
		// Conecta e executa a sentenza
		try {
			ps = conexion.getConexion().prepareStatement(consulta);
			resultado = ps.executeQuery();
			while (resultado.next()) {
				facturas = new AuxFacturasClientes();
				facturas.setCodPedido(resultado.getInt("peNumPedido"));
				facturas.setFecha(resultado.getDate("peFecha"));
				facturas.setCliente(nombre);
				facturas.setTotalPedido(resultado.getDouble("pdPrecioVenta"));
				facturas.setTotalIva(facturas.getTotalPedido() * 0.21);
				facturas.setTotal(facturas.getTotalPedido() + facturas.getTotalIva());

				lista.add(facturas);
			}
			ps.close();
			resultado.close();
			conexion.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, non se conectó");
			System.out.println(e);
		}
		// System.out.println(lista);
		return lista;
	}

	public static ArrayList<AuxFacturasClientes> cargarFacturasMes(int mes) {

		System.out.println("Estoy en pedidos dao");
		// conexion
		Conexion conexion = new Conexion();

		// Perapramos a consulta de actualizacion
		PreparedStatement ps = null;
		ResultSet resultado = null;

		AuxFacturasClientes facturas = null;
		ArrayList<AuxFacturasClientes> lista = new ArrayList<AuxFacturasClientes>();

		// Consulta - A SENTENZA NON LEVA PUNTO E COMA
		String consulta = "SELECT peNumPedido, peFecha, clNombre, sum(pdPrecioVenta) as pdPrecioVenta  FROM ((pedidos JOIN clientes ON peNifCliente = clNif) JOIN lineaspedido ON peNumPedido = liNumPedido) JOIN productos ON liIdProducto = pdid  where MONTH(peFecha)='"
				+ mes + "' GROUP BY peNumPedido ";
		// Conecta e executa a sentenza
		try {
			ps = conexion.getConexion().prepareStatement(consulta);
			resultado = ps.executeQuery();

			while (resultado.next()) {
				facturas = new AuxFacturasClientes();
				facturas.setCodPedido(resultado.getShort("peNumPedido"));
				facturas.setCliente(resultado.getString("clNombre"));
				facturas.setFecha(resultado.getDate("peFecha"));
				facturas.setTotalPedido(resultado.getDouble("pdPrecioVenta"));
				facturas.setTotalIva(facturas.getTotalPedido() * 0.21);
				facturas.setTotal(facturas.getTotalPedido() + facturas.getTotalIva());

				lista.add(facturas);

			}
			ps.close();
			resultado.close();
			conexion.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, non se conectó");
			System.out.println(e);
		}
		// System.out.println(lista);
		return lista;
	}

	public static ArrayList<AuxCrearFactura> cargarNuevaFactura(int numPedido) {
		conexion = new Conexion();
		PreparedStatement ps = null;
		ResultSet r = null;

		String consulta = "SELECT liNumPedido, liId, pdNombre, liCantidad, pdPrecioVenta, liCantidad*pdPrecioVenta AS 'Importe' "
				+ "FROM lineaspedido JOIN productos ON liIdProducto = pdId WHERE liNumPedido = ?";

		ArrayList<AuxCrearFactura> lineasPedido = new ArrayList<AuxCrearFactura>();
		lineasPedido.clear();

		try {
			ps = (PreparedStatement) conexion.getConexion().prepareStatement(consulta);
			ps.setInt(1, numPedido);
			r = ps.executeQuery();

			while (r.next()) {
				AuxCrearFactura l = new AuxCrearFactura();
				l.setNumLinea(r.getInt("liId"));
				l.setProducto(r.getString("pdNombre"));
				l.setPrecioVenta(r.getFloat("pdPrecioVenta"));
				l.setCantidad(r.getInt("liCantidad"));
				l.setImporte(r.getFloat("Importe"));
				lineasPedido.add(l);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		conexion.desconectar();
		return lineasPedido;
	}

	public static ArrayList<Pedidos> cargarPedidos() {
		conexion = new Conexion();
		PreparedStatement ps = null;
		ResultSet r = null;
		ArrayList<Pedidos> pedidos = new ArrayList<Pedidos>();
		pedidos.clear();

		String consulta = "SELECT peNumPedido, peFecha, peNifCliente, peDescuento FROM Pedidos";

		try {
			ps = (PreparedStatement) conexion.getConexion().prepareStatement(consulta);
			r = ps.executeQuery();

			while (r.next()) {
				Pedidos p = new Pedidos();
				p.setNumPedido(r.getInt("peNumPedido"));
				p.setFechaPedido(ConvertirFechas.convertirDateString(r.getDate("peFecha")));
				p.setNifCliente(r.getString("peNifCliente"));
				p.setDescuento(r.getDouble("peDescuento"));
				pedidos.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return pedidos;
	}

	static public DatosPedidoFacturaCliente cargarDatosPedidosFactura(int numPedido) {

		conexion = new Conexion();
		PreparedStatement ps = null;
		ResultSet r = null;

		String consulta = "SELECT peNumPedido, peFecha, peDescuento, clNombre, clCalle, clCodPostal, clCiudad FROM pedidos INNER JOIN clientes ON peNifCliente = clNif WHERE peNumpedido = ?";

		DatosPedidoFacturaCliente datosPedidoFacturaCliente = null;
		try {
			ps = (PreparedStatement) conexion.getConexion().prepareStatement(consulta);
			ps.setInt(1, numPedido);
			r = ps.executeQuery();

			while (r.next()) {
				datosPedidoFacturaCliente = new DatosPedidoFacturaCliente();

				datosPedidoFacturaCliente.setFecha(ConvertirFechas.convertirDateString(r.getDate("peFecha")));
				datosPedidoFacturaCliente.setDescuento(String.valueOf(r.getDouble("peDescuento")));
				datosPedidoFacturaCliente.setNombreCliente(r.getString("clNombre"));
				datosPedidoFacturaCliente.setCalleCliente(r.getString("clCalle"));
				datosPedidoFacturaCliente.setCodPostalCliente(String.valueOf(r.getInt("clCodPostal")));
				datosPedidoFacturaCliente.setCiudadCliente(r.getString("clCiudad"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return datosPedidoFacturaCliente;
	}

	static public DatosPedidoFacturaTotal cargarSubtotalesPedidosFactura(int numPedido) {
		conexion = new Conexion();
		PreparedStatement ps = null;
		ResultSet r = null;

		DatosPedidoFacturaTotal total = new DatosPedidoFacturaTotal();

		String consulta = "SELECT peNumPedido, SUM(liCantidad * pdPrecioVenta) AS 'Subtotal', "
				+ "IFNULL(SUM(liCantidad * pdPrecioVenta) * (peDescuento / 100),0) AS 'Descuento', "
				+ "SUM(liCantidad * pdPrecioVenta) - (IFNULL(SUM(liCantidad * pdPrecioVenta) * (peDescuento / 100),0)) AS 'Base imponible', "
				+ "(SUM(liCantidad * pdPrecioVenta) - (IFNULL(SUM(liCantidad * pdPrecioVenta) * (peDescuento / 100),0))) * 0.21 AS 'IVA', "
				+ "(SUM(liCantidad * pdPrecioVenta) - (IFNULL(SUM(liCantidad * pdPrecioVenta) * (peDescuento / 100),0))) * 0.21 + "
				+ "(SUM(liCantidad * pdPrecioVenta) - (IFNULL(SUM(liCantidad * pdPrecioVenta) * (peDescuento / 100),0))) AS 'Total' "
				+ "FROM  (lineaspedido JOIN productos ON liIdProducto = pdId) JOIN pedidos ON liNumPedido = peNumPedido "
				+ "WHERE liNumPedido = ?";

		try {
			ps = (PreparedStatement) conexion.getConexion().prepareStatement(consulta);
			ps.setInt(1, numPedido);
			r = ps.executeQuery();
			while (r.next()) {
				total.setSubtotal(r.getDouble("Subtotal"));
				total.setDescuento(r.getDouble("Descuento"));
				total.setBaseImponible(r.getDouble("Base imponible"));
				total.setIva(r.getDouble("IVA"));
				total.setTotal(r.getDouble("Total"));
			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		return total;
	}
}