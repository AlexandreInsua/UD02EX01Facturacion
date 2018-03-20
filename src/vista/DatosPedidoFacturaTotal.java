package vista;

public class DatosPedidoFacturaTotal {

	double subtotal;
	double descuento;
	double baseImponible;
	double iva;
	double total;

	public double getSubtotal() {
		return subtotal;
	}

	public double getDescuento() {
		return descuento;
	}

	public double getBaseImponible() {
		return baseImponible;
	}

	public double getIva() {
		return iva;
	}

	public double getTotal() {
		return total;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public void setBaseImponible(double baseImponible) {
		this.baseImponible = baseImponible;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Subtotal " + subtotal + "\nDescuento " + descuento + "\nBase imponible " + baseImponible + "\nIVA " + iva
				+ "\nTotal " + total;

	}

}
