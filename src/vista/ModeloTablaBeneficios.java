package vista;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

<<<<<<< HEAD
import controlador.Controlador;
import Modelo.vo.Clientes;
import Modelo.vo.LineasPedido;
import Modelo.vo.Productos;
import Modelo.vo.Proveedor;
=======

import controlador.Controlador;
import modelo.vo.Clientes;
import modelo.vo.LineasPedido;
import modelo.vo.Productos;
import modelo.vo.Proveedor;
>>>>>>> bcb2891cca8a5a4aa3f85f3d37d874895c4f45cd

public class ModeloTablaBeneficios extends AbstractTableModel {
	private static final Object String = null;
	ArrayList<String> nombresColumnas;
	ArrayList<Clientes> datos;
	ArrayList<Proveedor> datosProv;
	ArrayList<Productos> datosProd;
	ArrayList<LineasPedido> datosLin;

	String beneficios = "beneficios";

	public ModeloTablaBeneficios() {
		nombresColumnas = new ArrayList<>();

		nombresColumnas.add("Producto");
		nombresColumnas.add("Precio Compra");
		nombresColumnas.add("Precio Venta");
		nombresColumnas.add("Cantidad");
		nombresColumnas.add("Beneficio");
		nombresColumnas.add("Proveedor");
		nombresColumnas.add("Teléfono");
		nombresColumnas.add("Web");

		datos = new ArrayList<Clientes>();
		datosProv = new ArrayList<Proveedor>();
		datosProd = new ArrayList<Productos>();
		datosLin = new ArrayList<LineasPedido>();

		// cargarBeneficio();
	}

	public void cargarBeneficio() {
		Controlador controlador = new Controlador();
		datos = controlador.cargarClientes();
		datosProd = controlador.cargarProductos();
		datosProv = controlador.cargarProveedores();
		datosLin = controlador.cargarLineasPedido();
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

		Productos productos = datosProd.get(fila);
		Proveedor proveedor = datosProv.get(fila);
		LineasPedido lineas = datosLin.get(fila);
		Clientes cliente = datos.get(fila);

		switch (columna) {
		case 0:
			return productos.getProducto();
		case 1:
			return productos.getPrecioCompra();
		case 2:
			return productos.getPrecioVenta();
		case 3:
			return lineas.getCantidad();
		case 4:
			return beneficios;
		case 5:
			return proveedor.getNombre();
		case 6:
			return proveedor.getTelefono();
		case 7:
			return proveedor.getWeb();

		}
		return productos;
	}

	@Override
	public String getColumnName(int columna) {
		return nombresColumnas.get(columna);
	}
}
