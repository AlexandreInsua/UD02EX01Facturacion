package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;

import javax.swing.JOptionPane;

import conexion.Conexion;
import modelo.vo.Clientes;
import modelo.vo.LineasPedido;
import modelo.vo.Pedidos;
import modelo.vo.Productos;
import modelo.vo.Proveedor;
import vista.AuxListadoPedidos;
import vista.AuxMinimos;
import vista.AuxNuevoPedido;

public class PedidosDao {

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
		String consulta = "SELECT clNif FROM clientes Where clNombre =" + nombre;

		// Conecta e executa a sentenza
		try {
			ps = conexion.getConexion().prepareStatement(consulta);
			resultado = ps.executeQuery();
			while (resultado.next()) {
				dni=(resultado.getString("clNif"));
				
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

	public static ArrayList<AuxNuevoPedido> cargarPedido() {
		// conexion
		Conexion conexion = new Conexion();

		// Perapramos a consulta de actualizacion
		PreparedStatement ps = null;
		ResultSet resultado = null;

		AuxNuevoPedido minimo = null;
		ArrayList<AuxNuevoPedido> lista = new ArrayList<AuxNuevoPedido>();

		// limpar dados
		lista.clear();

		int numPedido = Integer.parseInt(contarPedidos());

		// Consulta - A SENTENZA NON LEVA PUNTO E COMA
		String consulta = "select liIdProducto, pdNombre, liCantidad, pdPrecioVenta, liCantidad*pdPrecioVenta as precio"
				+ " from lineaspedido inner join productos ON liIdProducto=pdId" + " where liNumPedido=" + numPedido;
		// Conecta e executa a sentenza
		try {
			ps = conexion.getConexion().prepareStatement(consulta);
			resultado = ps.executeQuery();
			while (resultado.next()) {
				minimo = new AuxNuevoPedido();
				minimo.setCodigo(resultado.getShort("liIdProducto"));
				minimo.setProducto(resultado.getString("pdNombre"));
				minimo.setCantidad(resultado.getInt("liCantidad"));
				minimo.setPrecioVenta(resultado.getFloat("pdPrecioVenta"));
				minimo.setImporte(resultado.getFloat("precio"));
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

	} // fin

	public static void agregarLineaPedido(AuxNuevoPedido datosLinea) throws SQLException {

		Conexion conexion = new Conexion();
		Connection conn = conexion.getConexion();
		// Perapramos a consulta de actualizacion
		PreparedStatement ps = null;
		ResultSet resultado = null;

		String consulta1 = "INSERT INTO pedidos (peNumPedido, peFecha, peNifCliente,peDescuento)" + " VALUES("
				+ datosLinea.getCodigoPedido() + "," + datosLinea.getFecha() + "," + obtenerDniCliente(datosLinea.getNombreCliente()) + "," + datosLinea.getDescuento() +")";
		String consulta2 = "INSERT INTO lineaspedido (liNumPedido, liIdProducto, liCantidad)" + " VALUES("
				+ datosLinea.getCodigoPedido() + "," + datosLinea.getCodigoProd() + "," + datosLinea.getCantidad() + ")";

		// Conecta e executa a sentenza
		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(consulta1);
			ps.executeUpdate();
			ps = conn.prepareStatement(consulta2);
			ps.executeUpdate();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, ao insertar datos");
			System.out.println(e);
			conn.rollback();
		}

	}

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
		String consulta = " SELECT peFecha, clNombre, pdId, pdNombre, pdPrecioVenta, liCantidad,"
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
				minimo.setCodProducto(resultado.getShort("pdId"));
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


public static void eliminarPedido(int codigo) {
	Conexion conexion = new Conexion();
	// Perapramos a consulta de actualizacion
	PreparedStatement ps = null;

	// Consulta - A SENTENZA NON LEVA PUNTO E COMA

	String consulta = " DELETE * FROM lineasPedido where liNumPedido=" + codigo;
	String consulta2 = " DELETE * FROM pedidos where peNumPedido=" + codigo;
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

public static void eliminarLineaPedido(int codigo, int linea) {
	Conexion conexion = new Conexion();
	// Perapramos a consulta de actualizacion
	PreparedStatement ps = null;

	// Consulta - A SENTENZA NON LEVA PUNTO E COMA

	String consulta = " DELETE * FROM lineasPedido where liNumPedido=" + codigo + " and liId=" + linea ;

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
}

