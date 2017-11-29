package modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.crypto.Data;

import java.sql.PreparedStatement;

import conexion.Conexion;
import modelo.vo.Pedidos;
import vista.AuxCrearFactura;

public class PedidoDao {
	Pedidos pedido = null;
	AuxCrearFactura auxCrearFactura = null;

	public PedidoDao() {
		super();
	}

	/*
	 * public ArrayList<AuxCrearFactura> cargarNuevaFactura() { Conexion
	 * conexion = new Conexion(); PreparedStatement ps = null; ResultSet
	 * resultado = null; Pedidos pedido = null; ArrayList<Pedidos> lista = new
	 * ArrayList<Pedidos>();
	 * 
	 * String consultaSQL = "SELECT * FROM  Pedidos";
	 * 
	 * try{ ps = conexion.getConexion().prepareStatement(consultaSQL); resultado
	 * = ps.executeQuery(); auxCrearFactura = new AuxCrearFactura();
	 * 
	 * } catch (SQLException e){
	 * 
	 * } return null; } ^
	 */

	public ArrayList<Pedidos> cargarPedidos() {
		Conexion conexion = new Conexion();
		PreparedStatement ps = null;
		ResultSet resultado = null;
		Pedidos pedido = null;
		ArrayList<Pedidos> pedidos = new ArrayList<Pedidos>();

		String consultaSQL = "SELECT * FROM  Pedidos";

		try {
			ps = conexion.getConexion().prepareStatement(consultaSQL);
			resultado = ps.executeQuery();
			while (resultado.next()) {

				pedido = new Pedidos();
				pedido.setNumPedido(resultado.getInt("peNumPedido"));
				pedido.setFechaPedido((Data) resultado.getDate("peFecha"));
				pedido.setDescuento(resultado.getDouble("descuento"));
				pedido.setNifCliente(resultado.getString("nifCliente"));
				pedidos.add(pedido);
				System.out.println(pedido);
			}
			ps.close();
			resultado.close();
			conexion.desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pedidos;
	}
	
	public static void main(String[] args) {
		PedidoDao pedidodao = new PedidoDao();
		pedidodao.cargarPedidos();
	}

}
