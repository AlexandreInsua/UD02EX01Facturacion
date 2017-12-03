package modelo.vo;

public class LineasPedido  {

	// Atributos
	private int numPedido;
	private int idProducto;
	private int cantidad;

	// Constructores

	public LineasPedido(int numPedido, int idProducto, int cantidad) {
		super();
		this.numPedido = numPedido;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
	}

	public LineasPedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getters And Setters
	public int getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
