package vista;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import controlador.Controlador;

public class ModeloCrearFactura extends AbstractTableModel {
	
	private static final Object String = null;
	ArrayList<String> nombresColumnas;
	ArrayList<AuxCrearFactura> datos;

	String importe = "Importe";

	public ModeloCrearFactura() {
		nombresColumnas = new ArrayList<>();

		nombresColumnas.add("Código");
		nombresColumnas.add("Producto");
		nombresColumnas.add("Cantidad");
		nombresColumnas.add("Precio");
		nombresColumnas.add("Importe");
		

		datos = new ArrayList<AuxCrearFactura>();

		// cargarNuevaFactura();
	}

	public void cargarNuevaFactura() {
		Controlador controlador = new Controlador();
		datos = controlador.cargarNuevaFactura();
	}

	@Override
	public int getColumnCount() {
		return nombresColumnas.size();
	}

	@Override
	public int getRowCount() {
		return datos.size();
	}

	@Override
	public Object getValueAt(int fila, int columna) {

		AuxCrearFactura miCrearFactura = datos.get(fila);

		switch (columna) {
		case 0:
			return miCrearFactura.getNumPedido();
		case 1:
			return miCrearFactura.getProducto();
		case 2:
			return miCrearFactura.getCantidad();
		case 3:
			return miCrearFactura.getPrecioVenta();
		case 4:
			return importe;
		

		}
		return miCrearFactura;
	}

	@Override
	public String getColumnName(int columna) {
		return nombresColumnas.get(columna);
	}
}


