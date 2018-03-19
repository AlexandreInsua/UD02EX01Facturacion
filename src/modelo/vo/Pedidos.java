package modelo.vo;




public class Pedidos {

	// Atributos
	
	private int numPedido;
	private String fechaPedido;
	private double descuento;
	private String nifCliente;
	

	// Constructores

	public Pedidos(int numPedido, String fechaPedido, double descuento, String nifCliente) {
		super();
		this.numPedido = numPedido;
		this.fechaPedido = fechaPedido;
		this.descuento = descuento;
		this.nifCliente = nifCliente;
	}

	public Pedidos() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getters and Setters
	
	public int getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}

	public String getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public String getNifCliente() {
		return nifCliente;
	}

	public void setNifCliente(String nifCliente) {
		this.nifCliente = nifCliente;
	}

	@Override
	public String toString() {
		return numPedido + "";
	}
	
	

}
