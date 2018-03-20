package vista;

/// clase auxiliar
public class DatosPedidoFacturaCliente {

	String fecha;
	String descuento;
	String nombreCliente;
	String calleCliente;
	String codPostalCliente;
	String ciudadCliente;


	/**
	 * 
	 */
	public DatosPedidoFacturaCliente() {
		super();
	}

	public String getFecha() {
		return fecha;
	}

	public String getDescuento() {
		return descuento;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public String getCalleCliente() {
		return calleCliente;
	}

	public String getCodPostalCliente() {
		return codPostalCliente;
	}

	public String getCiudadCliente() {
		return ciudadCliente;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public void setCalleCliente(String calleCliente) {
		this.calleCliente = calleCliente;
	}

	public void setCodPostalCliente(String codPostalCliente) {
		this.codPostalCliente = codPostalCliente;
	}

	public void setCiudadCliente(String ciudadCliente) {
		this.ciudadCliente = ciudadCliente;
	}

	@Override
	public String toString() {
		return " " + fecha + ", " + descuento + ", " + nombreCliente + ", " + calleCliente + ", " + codPostalCliente
				+ ", " + ciudadCliente;
	}

}