package vista.pedido;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import controlador.Controlador;
import modelo.dao.PedidosDao;
import modelo.vo.LineasPedido;
import modelo.vo.Pedidos;
import modelo.vo.Productos;

public class VentanaNuevoPedido extends JDialog {
	private JTable table;
	private JTextField textNumPedido;
	private JTextField textFecha;
	private JTextField txtCantidad;
	DefaultTableModel miModeloNuevosPedidos;
	Controlador controlador;
	ComboNuevoProducto comboNuevoProducto;
	ComboClientes comboClientes;
	JScrollPane scrollPane;
	boolean existePedido = false;
	ArrayList<LineasPedido> lineas = new ArrayList<LineasPedido>();
	Pedidos pedido;
	Object[][] data = new Object[0][0];
	Object[] fila = new Object[5];
	static String[] datoss = { "Código", "Producto", "Cantidad", "Precio", "Importe" };

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;

	}

	public void setComboNuevoProducto(ComboNuevoProducto comboNuevoProducto) {
		this.comboNuevoProducto = comboNuevoProducto;
	}

	public void setComboClientes(ComboClientes comboClientes) {
		this.comboClientes = comboClientes;
	}

	// /**
	// * Launch the application.
	// */
	// public static void main(String[] args) {
	// try {
	// VentanaNuevoPedido dialog = new VentanaNuevoPedido();
	// dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	// dialog.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	/**
	 * Create the dialog.
	 */
	public VentanaNuevoPedido() {
		setBounds(100, 100, 587, 497);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.NORTH);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JLabel lblNuevoproducto = new JLabel("Nuevo Producto");
				panel.add(lblNuevoproducto, BorderLayout.NORTH);
			}
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1, BorderLayout.SOUTH);
				{
					JLabel lblNProducto = new JLabel("N\u00BA pedido");
					panel_1.add(lblNProducto);
				}
				{
					textNumPedido = new JTextField();
					panel_1.add(textNumPedido);
					textNumPedido.setEditable(false);
					textNumPedido.setColumns(10);
					controlador = new Controlador();
					textNumPedido.setText(controlador.contarPedidos());
				}
				{
					JLabel lblFecha = new JLabel("Fecha");
					panel_1.add(lblFecha);
				}
				{
					textFecha = new JTextField();
					panel_1.add(textFecha);
					textFecha.setColumns(10);
				}
				{
					JLabel lblCliente = new JLabel("Cliente");
					panel_1.add(lblCliente);
				}
				{
					comboClientes = new ComboClientes();
					panel_1.add(comboClientes);
				}
			}
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setPreferredSize(new Dimension(20, 20));
			getContentPane().add(scrollPane, BorderLayout.CENTER);
			{
				miModeloNuevosPedidos = new DefaultTableModel(data, datoss);
				table = new JTable(miModeloNuevosPedidos);
				scrollPane.setViewportView(table);

			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Ventas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			getContentPane().add(panel, BorderLayout.SOUTH);
			{
				JLabel lblVentas = new JLabel("Productos");
				panel.add(lblVentas);
			}
			{
				comboNuevoProducto = new ComboNuevoProducto();
				panel.add(comboNuevoProducto);
			}
			{
				JLabel lblCantidad = new JLabel("Cantidad");
				panel.add(lblCantidad);
			}
			{
				txtCantidad = new JTextField();
				panel.add(txtCantidad);
				txtCantidad.setColumns(10);

			}
			{
				JButton btnAnadir = new JButton("A\u00F1adir linea");
				btnAnadir.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent arg0) {
						int cantidad = 0;
						
						/** producto */
						String descripcion = comboNuevoProducto.getSelectedItem() + "";
						Productos producto = Controlador.recuperarProducto(descripcion);
						int idProducto = producto.getCodigo();
						float precioVenta = producto.getPrecioVenta();

						/* datos vista */
						float importe = (float) (precioVenta * 1.21);
						
						
						String fecha = controlador.verificarFecha(textFecha.getText());
						
						
						String nombreCliente = comboClientes.getSelectedItem() + "";
						String nif = Controlador.RecuperarNif(nombreCliente);
						try {
						cantidad = Integer.parseInt(txtCantidad.getText());
						} catch (NumberFormatException nfe){
							controlador = new Controlador();
							controlador.verificarCantidadLineaPedido();
						}
						/* Pedido */
						int codPedido = Integer.parseInt(PedidosDao.contarPedidos());
						double descuento = 0;

						if (existePedido == false) {
							pedido = new Pedidos(codPedido, fecha, descuento, nif);
							existePedido = true;
						}
						LineasPedido linea = new LineasPedido(codPedido, idProducto, cantidad);
						lineas.add(linea);
						miModeloNuevosPedidos.addRow(new Object[]{idProducto,descripcion,cantidad,precioVenta,importe});
						table = new JTable(miModeloNuevosPedidos);
						scrollPane.setViewportView(table);

					}
				});
				panel.add(btnAnadir);
				// controlador.crearPedidoNuevo();
			}
			{
				JButton btnOk = new JButton("Guardar");
				btnOk.addMouseListener(new MouseAdapter() {

					@Override
					public void mouseClicked(MouseEvent arg0) {
						existePedido = false;
						Controlador.introducirNuevoPedido(pedido, lineas);
						dispose();

					}

				});
				panel.add(btnOk);
			}

		}

	}

}
