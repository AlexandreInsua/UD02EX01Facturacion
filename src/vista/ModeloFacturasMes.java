package vista;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import controlador.Controlador;
import modelo.vo.AuxFacturasMes;
import modelo.vo.AuxNuevoPedido;

public class ModeloFacturasMes extends AbstractTableModel {
	private static final Object String = null;
	ArrayList<String> nombresColumnas;
	ArrayList<AuxFacturasMes> datos;

	String BaseImponible = "Base Imponible";
	String IVA = "Iva";
	String total = "Total";

	public ModeloFacturasMes() {
		nombresColumnas = new ArrayList<>();

		nombresColumnas.add("Nº Pedido");
		nombresColumnas.add("Fecha Pedido");
		nombresColumnas.add("Nombre Cliente");
		nombresColumnas.add("Base Imponible");
		nombresColumnas.add("Iva");
		nombresColumnas.add("Total");

		datos = new ArrayList<AuxFacturasMes>();

		// cargarPedido();
	}

	public void cargarFacturasMes() {
		Controlador controlador = new Controlador();
		datos = controlador.cargarFacturasMes();
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

		AuxFacturasMes miFacturasMes = datos.get(fila);

		switch (columna) {
		case 0:
			return miFacturasMes.getCodigo();
		case 1:
			return miFacturasMes.getFechaPedido();
		case 2:
			return miFacturasMes.getNombre();
		case 3:
			return BaseImponible;
		case 4:
			return IVA;
		case 5:
			return total;

		}
		return miFacturasMes;
	}

	@Override
	public String getColumnName(int columna) {
		return nombresColumnas.get(columna);
	}
}
