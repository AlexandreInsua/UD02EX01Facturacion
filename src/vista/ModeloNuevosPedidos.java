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
	ArrayList<AuxListadoPedidos> datos;


	public ModeloNuevosPedidos() {
		nombresColumnas = new ArrayList<>();

		nombresColumnas.add("Código");
		nombresColumnas.add("Producto");
		nombresColumnas.add("Cantidad");
		nombresColumnas.add("Precio");
		nombresColumnas.add("Importe");
	
		datos = new ArrayList<AuxListadoPedidos>();
		
	}

	public void cargarPedido(int codigo) {
		Controlador controlador = new Controlador();
		datos = controlador.listarPedidos(codigo);
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

		AuxListadoPedidos miNuevoProducto = datos.get(fila);

		switch (columna) {
		case 0:
			return miNuevoProducto.getCodProducto();
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