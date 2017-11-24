package vista;

public class AuxNuevoPedido {
	
	
	// Atributos
		private short codigo;
		private String producto;
		private int cantidad;		
		private float precioVenta;
		
		
		public AuxNuevoPedido(short codigo, String producto, int cantidad, float precioVenta) {
			super();
			this.codigo = codigo;
			this.producto = producto;
			this.cantidad = cantidad;
			this.precioVenta = precioVenta;
		}


		public AuxNuevoPedido() {
			super();
			// TODO Auto-generated constructor stub
		}


		
		//Getters and setters
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


		
		//To String
		
		@Override
		public String toString() {
			return "AuxNuevoProducto [codigo=" + codigo + ", producto=" + producto + ", cantidad=" + cantidad
					+ ", precioVenta=" + precioVenta + "]";
		}
		
		
		

}
