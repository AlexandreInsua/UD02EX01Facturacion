package vista;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import controlador.Controlador;

public class ModeloFacturasCliente extends AbstractTableModel {
	private static final Object String = null;
	ArrayList<String> nombresColumnas;
	ArrayList<AuxFacturasClientes> datos;


	public ModeloFacturasCliente() {
		nombresColumnas = new ArrayList<>();

		nombresColumnas.add("Nº Pedido");
		nombresColumnas.add("Fecha Pedido");
		nombresColumnas.add("Nombre Cliente");
		nombresColumnas.add("Base Imponible");
		nombresColumnas.add("Iva");
		nombresColumnas.add("Total");

		datos = new ArrayList<AuxFacturasClientes>();

		// cargarPedido();
	}

	public ArrayList<AuxFacturasClientes> cargarFacturasClientes(String nombre) {
		Controlador controlador = new Controlador();
		return datos = controlador.cargarFacturasClientes(nombre);
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

		AuxFacturasClientes miFacturasClientes = datos.get(fila);

		switch (columna) {
		case 0:
			return miFacturasClientes.getCodPedido();
		case 1:
			return miFacturasClientes.getFecha();
		case 2:
			return miFacturasClientes.getCliente();
		case 3:
			return miFacturasClientes.getTotalPedido();
		case 4:
			return miFacturasClientes.getTotalIva();
		case 5:
			return miFacturasClientes.getTotal();

		}
		return miFacturasClientes;
	}

	@Override
	public String getColumnName(int columna) {
		return nombresColumnas.get(columna);
	}
}
