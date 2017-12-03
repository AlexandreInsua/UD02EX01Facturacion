package vista;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import controlador.Controlador;
import modelo.vo.Clientes;
import modelo.vo.LineasPedido;
import modelo.vo.Productos;
import modelo.vo.Proveedor;

public class ModeloNuevosPedidos extends AbstractTableModel {
	private static final Object String = null;
	ArrayList<String> nombresColumnas;
	ArrayList<AuxNuevoPedido> datos;


	public ModeloNuevosPedidos() {
		nombresColumnas = new ArrayList<>();

		nombresColumnas.add("Código");
		nombresColumnas.add("Producto");
		nombresColumnas.add("Cantidad");
		nombresColumnas.add("Precio");
		nombresColumnas.add("Importe");
	
		datos = new ArrayList<AuxNuevoPedido>();
		
		 cargarPedido();
	}

	public void cargarPedido() {
		Controlador controlador = new Controlador();
		datos = controlador.cargarPedido();
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

		AuxNuevoPedido miNuevoProducto = datos.get(fila);
		

		switch (columna) {
		case 0:
			return miNuevoProducto.getCodigo();
		case 1:
			return miNuevoProducto.getProducto();
		case 2:
			return miNuevoProducto.getCantidad();
		case 3:
			return miNuevoProducto.getPrecioVenta();
		case 4:
			return miNuevoProducto.getImporte();

		}
		return miNuevoProducto;
	}

	@Override
	public String getColumnName(int columna) {
		return nombresColumnas.get(columna);
	}
}