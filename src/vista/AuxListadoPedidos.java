package vista;

import java.sql.Date;

import javax.xml.crypto.Data;

public class AuxListadoPedidos {
	private int numPedido;
	private Date fechaPedido;
	private String nombreCliente;
	private short codProducto;
	private String producto;
	private int cantidad;
	private float precioVenta;
	private float importe;
	private int numLinea;

	public AuxListadoPedidos(int numPedido, Date fechaPedido, String nombreCliente, short codProducto, String producto,
			int cantidad, float precioVenta, float importe, int numLinea) {
		super();
		this.numPedido = numPedido;
		this.fechaPedido = fechaPedido;
		this.nombreCliente = nombreCliente;
		this.codProducto = codProducto;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioVenta = precioVenta;
		this.importe = importe;
		this.numLinea = numLinea;
	}

	public AuxListadoPedidos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public int getNumLinea() {
		return numLinea;
	}

	public void setNumLinea(int numLinea) {
		this.numLinea = numLinea;
	}

	public int getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date date) {
		this.fechaPedido = date;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public short getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(short codProducto) {
		this.codProducto = codProducto;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return fechaPedido + "";
	}

}
