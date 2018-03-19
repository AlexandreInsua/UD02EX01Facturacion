package vista;

import java.util.Date;

public class AuxFacturasClientes {
	
	int codPedido;
	Date fecha;
	String cliente;
	double totalPedido;
	double totalIva;
	double total;
	
	
	public AuxFacturasClientes() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AuxFacturasClientes(int codPedido, Date fecha, String cliente, double totalPedido, double totalIva,
			double total) {
		super();
		this.codPedido = codPedido;
		this.fecha = fecha;
		this.cliente = cliente;
		this.totalPedido = totalPedido;
		this.totalIva = totalIva;
		this.total = total;
	}


	public int getCodPedido() {
		return codPedido;
	}


	public void setCodPedido(int codPedido) {
		this.codPedido = codPedido;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public double getTotalPedido() {
		return totalPedido;
	}


	public void setTotalPedido(double totalPedido) {
		this.totalPedido = totalPedido;
	}


	public double getTotalIva() {
		return totalIva;
	}


	public void setTotalIva(double totalIva) {
		this.totalIva = totalIva;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	@Override
	public String toString() {
		return "AuxFacturasClientes [codPedido=" + codPedido + ", fecha=" + fecha + ", cliente=" + cliente
				+ ", totalPedido=" + totalPedido + ", totalIva=" + totalIva + ", total=" + total + "]";
	}
	
	
	
	

}
