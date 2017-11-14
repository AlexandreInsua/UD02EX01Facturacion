package vista;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

<<<<<<< HEAD
import controlador.Controlador;
import modelo.vo.Productos;
=======
import Modelo.vo.Productos;
import controlador.Controlador;
>>>>>>> 0ee6bca2bc72e5295f54667e718fb5d07a0991e6



public class ModeloTablaMinimos extends AbstractTableModel {
	ArrayList <String> nombresColumnas;
	ArrayList <Productos> datos;

	public  ModeloTablaMinimos() {
		nombresColumnas = new ArrayList<>();

		nombresColumnas.add("Cod Producto");
		nombresColumnas.add("Producto");
		nombresColumnas.add("Precio Compra");
		nombresColumnas.add("Precio Venta");
		nombresColumnas.add("Stock");
		nombresColumnas.add("Proveedor");
		nombresColumnas.add("Teléfono");

		datos = new ArrayList<Productos>();

		//cargarStock();
	}

	public void cargarStock(){
		Controlador controlador = new Controlador();
		datos = controlador.cargarProductos();
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

		Productos productos = datos.get(fila);

		switch(columna){
		case 0:
			return productos.getCodigo();
		case 1:
			return productos.getProducto();
		case 2:
			return productos.getPrecioCompra();
		case 3:
			return productos.getPrecioVenta();
		case 4:
			return productos.getStock();
		case 5:
			return productos.getProveedor();
		case 6:
			return productos.getTelefono();
		
		}
		return productos;
	}

	@Override
	public String getColumnName(int columna){
		return nombresColumnas.get(columna);
	}
}


