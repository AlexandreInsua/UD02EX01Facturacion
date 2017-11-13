package Modelo.vo;

public class Productos {

	// Atributos
	private short codigo;
	private String producto;
	private float precioCompra;
	private float precioVenta;
	private int stock;
	private String proveedor;
	private String telefono;

	// Contructores

	public Productos(short codigo, String producto, float precioCompra, float precioVenta, int stock, String proveedor,
			String telefono) {
		super();
		this.codigo = codigo;
		this.producto = producto;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
		this.proveedor = proveedor;
		this.telefono = telefono;
	}

	public Productos() {
		super();
		// TODO Auto-generated constructor stub

	}

	// Getters and Setters
	public short getCodigo() {
		return codigo;
	}

	public void setCodigo(short codigo) {
		this.codigo = codigo;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return producto;

	}

}
