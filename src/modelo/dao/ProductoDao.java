package modelo.dao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexion.Conexion;
import modelo.vo.Productos;
import modelo.vo.Proveedor;
import vista.AuxMinimos;
import vista.AuxTablaBeneficios;

public class ProductoDao {

	public ArrayList<AuxMinimos> cargarMinimos() {
		// conexion
		Conexion conexion = new Conexion();

		// Perapramos a consulta de actualizacion
		PreparedStatement ps = null;
		ResultSet resultado = null;

		AuxMinimos minimo = null;
		ArrayList<AuxMinimos> lista = new ArrayList<AuxMinimos>();

		// limpar dados
		lista.clear();

		// Consulta - A SENTENZA NON LEVA PUNTO E COMA
		String consulta = "SELECT pdId, pdNombre, pdPrecioCompra, "
				+ "pdPrecioVenta, pdStock, prNombre, prTelefono FROM productos JOIN proveedores ON pdNifProveedor = prNif "
				+ "WHERE pdStock < pdStockMinimo";
		// Conecta e executa a sentenza
		try {
			ps = conexion.getConexion().prepareStatement(consulta);
			resultado = ps.executeQuery();
			while (resultado.next()) {
				minimo = new AuxMinimos();
				minimo.setCodigo(resultado.getShort("pdId"));
				minimo.setProducto(resultado.getString("pdNombre"));
				minimo.setPrecioCompra(resultado.getFloat("pdPrecioCompra"));
				minimo.setPrecioVenta(resultado.getFloat("pdPrecioVenta"));
				minimo.setStock(resultado.getInt("pdStock"));
				minimo.setProveedor(resultado.getString("prNombre"));
				minimo.setTelefono(resultado.getString("prTelefono"));
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

	} // fin cargaMinimos

	// Consulta Beneficios
	public ArrayList<AuxTablaBeneficios> cargarBeneficios() {
		// conexion
		Conexion conexion = new Conexion();

		// Perapramos a consulta de actualizacion
		PreparedStatement ps = null;
		ResultSet resultado = null;

		AuxTablaBeneficios minimo = null;
		ArrayList<AuxTablaBeneficios> lista = new ArrayList<AuxTablaBeneficios>();

		// limpar dados
		lista.clear();

		// Consulta - A SENTENZA NON LEVA PUNTO E COMA
		String consulta = "SELECT productos.pdNombre, pdPrecioCompra, pdPrecioVenta, liCantidad, (pdPrecioVenta - pdPrecioCompra) * liCantidad AS 'Beneficio',prNombre, prTelefono, prWeb "
				+ "FROM ((productos JOIN proveedores ON pdNifProveedor = prNif) JOIN lineaspedido ON pdId = liIdProducto) JOIN pedidos ON liNumPedido = peNumPedido "
				+ "GROUP BY liIdProducto";

		// Conecta e executa a sentenza
		try {
			ps = conexion.getConexion().prepareStatement(consulta);
			resultado = ps.executeQuery();
			while (resultado.next()) {
				minimo = new AuxTablaBeneficios();
				minimo.setProducto(resultado.getString("pdNombre"));
				minimo.setPrecioCompra(resultado.getFloat("pdPrecioCompra"));
				minimo.setPrecioVenta(resultado.getFloat("pdPrecioVenta"));
				minimo.setCantidad(resultado.getInt("liCantidad"));
				minimo.setBeneficio(resultado.getFloat("Beneficio"));
				minimo.setProveedor(resultado.getString("prNombre"));
				minimo.setTelefono(resultado.getString("prTelefono"));
				minimo.setWeb(resultado.getString("prWeb"));
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

	} // fin cargaMinimos

	// Consulta valoración existencias

	public ArrayList<Productos> cargarValoracion() {
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
		String consulta = "SELECT pdNombre, pdStock, pdPrecioCompra, (pdStock*pdPrecioCompra) as 'Valoracion' FROM productos";

		// Conecta e executa a sentenza
		try {
			ps = conexion.getConexion().prepareStatement(consulta);
			resultado = ps.executeQuery();
			while (resultado.next()) {
				minimo = new Productos();
				minimo.setProducto(resultado.getString("pdNombre"));
				minimo.setStock(resultado.getInt("pdStock"));
				minimo.setPrecioCompra(resultado.getFloat("pdPrecioCompra"));
				minimo.setTotal(resultado.getFloat("Valoracion"));

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

	} // fin cargaMinimos

	public static void main(String[] args) {
		ProductoDao productodao = new ProductoDao();

		System.out.println(productodao.cargarValoracion());
	}

	public float cargarTotal() {
		// conexion
		Conexion conexion = new Conexion();

		// Perapramos a consulta de actualizacion
		PreparedStatement ps = null;
		ResultSet resultado = null;

		// Productos minimo = null;
		Float total = null;

		// Consulta - A SENTENZA NON LEVA PUNTO E COMA
		String consulta = "SELECT sum(pdStock*pdPrecioCompra) as 'Total' FROM productos";

		// Conecta e executa a sentenza
		try {
			ps = conexion.getConexion().prepareStatement(consulta);
			resultado = ps.executeQuery();
			while (resultado.next()) {
				total = resultado.getFloat("Total");
			}
			ps.close();
			resultado.close();
			conexion.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, non se conectó");
			System.out.println(e);
		}
	
		return total;

	} // fin cargaMinimos

}
