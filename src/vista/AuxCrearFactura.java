package vista;

public class AuxCrearFactura {
	
	private int numLinea;
	private String producto;
	private float precioVenta;
	private int cantidad;
	private float importe; 
	public AuxCrearFactura(int numPedido, String producto, float precioVenta, int cantidad, float importe) {
		super();
		this.numLinea = numPedido;
		this.producto = producto;
		this.precioVenta = precioVenta;
		this.cantidad = cantidad;
		this.importe = importe;
	}
	public AuxCrearFactura() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNumLinea() {
		return numLinea;
	}
	public void setNumLinea(int numPedido) {
		this.numLinea = numPedido;
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
	
	public float getImporte(){
		return this.importe;
	}
	
	public void setImporte(float importe){
		this.importe =importe;
	}
	
	@Override
	public String toString() {
		return "AuxCrearFactura [numPedido=" + numLinea + ", producto=" + producto + ", precioVenta=" + precioVenta
				+ ", cantidad=" + cantidad + "]";
	}
	
	
	

}
