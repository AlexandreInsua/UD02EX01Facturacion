package vista;

public class AuxCrearFactura {

	// TODO TANTOS ATRIBUTOS COMO CAMPOS NO FORMULARIO ????
	// IMPLICA TANTOS n-CAMPOS NA CONSULTA
	
	private int numPedido;
	private String producto;
	private float precioVenta;
	private int cantidad;
	
 
	public AuxCrearFactura(int numPedido, String producto, float precioVenta, int cantidad) {
		super();
		this.numPedido = numPedido;
		this.producto = producto;
		this.precioVenta = precioVenta;
		this.cantidad = cantidad;
	}
	public AuxCrearFactura() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNumPedido() {
		return numPedido;
	}
	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "AuxCrearFactura [numPedido=" + numPedido + ", producto=" + producto + ", precioVenta=" + precioVenta
				+ ", cantidad=" + cantidad + "]";
	}
	
	
	

}
