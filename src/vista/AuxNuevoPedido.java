package vista;

import java.sql.Date;

public class AuxNuevoPedido {
	
	
	// Atributos
		private int codigoProd;
		private String producto;
		private int cantidad;		
		private float precioVenta;
		private float importe;
		private Date fecha;
		private String nombreCliente;
		private double descuento;
		private int codigoPedido;
		private int codigoLinea;
		
		
	

		public AuxNuevoPedido(int codigoProd, String producto, int cantidad2, float precioVenta, float importe,
				Date fecha, String nombreCliente, double descuento, int codigoPedido, int codigoLinea) {
			super();
			this.codigoProd = codigoProd;
			this.producto = producto;
			this.cantidad = cantidad2;
			this.precioVenta = precioVenta;
			this.importe = importe;
			this.fecha = fecha;
			this.nombreCliente = nombreCliente;
			this.descuento = descuento;
			this.codigoPedido = codigoPedido;
			this.codigoLinea = codigoLinea;
		}



		public AuxNuevoPedido() {
			super();
			// TODO Auto-generated constructor stub
		}


		
		//Getters and setters
		public int getCodigo() {
			return codigoProd;
		}


		public void setCodigo(short codigo) {
			this.codigoProd = codigo;
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



		public int getCodigoProd() {
			return codigoProd;
		}



		public void setCodigoProd(short codigoProd) {
			this.codigoProd = codigoProd;
		}



		public Date getFecha() {
			return fecha;
		}



		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}



		public String getNombreCliente() {
			return nombreCliente;
		}



		public void setNombreCliente(String nombreCliente) {
			this.nombreCliente = nombreCliente;
		}



		public double getDescuento() {
			return descuento;
		}



		public void setDescuento(double descuento) {
			this.descuento = descuento;
		}



		public int getCodigoPedido() {
			return codigoPedido;
		}



		public void setCodigoPedido(int codigoPedido) {
			this.codigoPedido = codigoPedido;
		}



		public int getCodigoLinea() {
			return codigoLinea;
		}



		public void setCodigoLinea(int codigoLinea) {
			this.codigoLinea = codigoLinea;
		}



		@Override
		public String toString() {
			return "AuxNuevoProducto [codigo=" + codigoProd + ", producto=" + producto + ", cantidad=" + cantidad
					+ ", precioVenta=" + precioVenta + "]";
		}
		
		
		

}
