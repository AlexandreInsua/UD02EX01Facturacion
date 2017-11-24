package vista;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;


import controlador.Controlador;
import modelo.vo.Productos;

import modelo.vo.Productos;




public class ModeloTablaMinimos extends AbstractTableModel {
	ArrayList <String> nombresColumnas;
	ArrayList <AuxMinimos> datos;

	public  ModeloTablaMinimos() {
		nombresColumnas = new ArrayList<>();

		nombresColumnas.add("Cod Producto");
		nombresColumnas.add("Producto");
		nombresColumnas.add("Precio Compra");
		nombresColumnas.add("Precio Venta");
		nombresColumnas.add("Stock");
		nombresColumnas.add("Proveedor");
		nombresColumnas.add("Telefono");

		datos = new ArrayList<AuxMinimos>();

		cargarStock();
	}

	public void cargarStock(){
		Controlador controlador = new Controlador();
		
		datos = controlador.cargarMinimos();
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

		AuxMinimos miMinimos = datos.get(fila);

		switch(columna){
		case 0:
			return miMinimos.getCodigo();
		case 1:
			return miMinimos.getProducto();
		case 2:
			return miMinimos.getPrecioCompra();
		case 3:
			return miMinimos.getPrecioVenta();
		case 4:
			return miMinimos.getStock();
		case 5:
			return miMinimos.getProveedor();
		case 6:
			return miMinimos.getTelefono();
		
		}
		return miMinimos;
	}

	@Override
	public String getColumnName(int columna){
		return nombresColumnas.get(columna);
	}
}


