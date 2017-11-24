package vista;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;



import controlador.Controlador;
import modelo.vo.Clientes;
import modelo.vo.LineasPedido;
import modelo.vo.Productos;
import modelo.vo.Proveedor;


public class ModeloTablaBeneficios extends AbstractTableModel {
	private static final Object String = null;
	ArrayList<String> nombresColumnas;
	ArrayList<AuxTablaBeneficios> datos;
	
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

		datos = new ArrayList<AuxTablaBeneficios>();
	

		// cargarBeneficio();
	}

	public void cargarBeneficio() {
		Controlador controlador = new Controlador();
		datos = controlador.cargarBeneficio();
	
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

		
		AuxTablaBeneficios miAuxTablaBeneficios = datos.get(fila);

		switch (columna) {
		case 0:
			return miAuxTablaBeneficios.getProducto();
		case 1:
			return miAuxTablaBeneficios.getPrecioCompra();
		case 2:
			return miAuxTablaBeneficios.getPrecioVenta();
		case 3:
			return miAuxTablaBeneficios.getCantidad();
		case 4:
			return beneficios;
		case 5:
			return miAuxTablaBeneficios.getProveedor();
		case 6:
			return miAuxTablaBeneficios.getTelefono();
		case 7:
			return miAuxTablaBeneficios.getWeb();

		}
		return miAuxTablaBeneficios;
	}

	@Override
	public String getColumnName(int columna) {
		return nombresColumnas.get(columna);
	}
}
