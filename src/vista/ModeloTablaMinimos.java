package vista;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

<<<<<<< HEAD
=======

import controlador.Controlador;
import modelo.vo.Productos;

import modelo.vo.Productos;
>>>>>>> bcb2891cca8a5a4aa3f85f3d37d874895c4f45cd
import controlador.Controlador;
import Modelo.vo.Productos;



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


