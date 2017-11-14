package vista;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;


import controlador.Controlador;
import modelo.vo.Productos;

import modelo.vo.Clientes;
import modelo.vo.LineasPedido;
import modelo.vo.Productos;
import modelo.vo.Proveedor;
import controlador.Controlador;


public class ModeloValoracionExistencias extends AbstractTableModel {
	private static final Object String = null;
	ArrayList<String> nombresColumnas;
	ArrayList<Productos> datos;
	
	private String total="total";


	public ModeloValoracionExistencias() {
		nombresColumnas = new ArrayList<>();

		nombresColumnas.add("Producto");
		nombresColumnas.add("Stock");
		nombresColumnas.add("Precio Compra");
		nombresColumnas.add("Total");
		

		datos = new ArrayList<Productos>();
		
		// cargarExistencias();
	}

	public void cargarExistecias() {
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

		switch (columna) {
		case 0:
			return productos.getProducto();
		case 1:
			return productos.getStock();
		case 2:
			return productos.getPrecioCompra();
		case 3:
			return total;
		
		}
		return productos;
	}

	@Override
	public String getColumnName(int columna) {
		return nombresColumnas.get(columna);
	}
}


