package vista;

public class AuxTablaBeneficios {
	
	private String producto;
	private float precioCompra;
	private float precioVenta;
	private String telefono;
	private String web;
	private String proveedor;
	private int cantidad;
	private float beneficio;
	
	
	
	public AuxTablaBeneficios(String producto, float precioCompra, float precioVenta, String telefono, String web,
			String proveedor, int cantidad) {
		super();
		this.producto = producto;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.telefono = telefono;
		this.web = web;
		this.proveedor = proveedor;
		this.cantidad = cantidad;
	}
	public AuxTablaBeneficios() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public float getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "AuxTablaBeneficios [producto=" + producto + ", precioCompra=" + precioCompra + ", precioVenta="
				+ precioVenta + ", telefono=" + telefono + ", web=" + web + ", proveedor=" + proveedor + ", cantidad="
				+ cantidad + "]";
	}
	public float getBeneficios() {
		return beneficio;
	}
	
	public void setBeneficio(float beneficio) {
		this.beneficio = beneficio;
	}
	
	
	
	
	
	

}
