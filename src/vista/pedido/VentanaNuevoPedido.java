package vista.pedido;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;

import controlador.Controlador;
import modelo.dao.PedidosDao;
import modelo.vo.LineasPedido;
import modelo.vo.Pedidos;
import modelo.vo.Productos;
import vista.AuxNuevoPedido;
import vista.ComboIncrementar;
import vista.ModeloNuevosPedidos;
import vista.ModeloTablaBeneficios;

public class VentanaNuevoPedido extends JDialog {
	private JTable table;
	private JTextField textNumPedido;
	private JTextField textFecha;
	private JTextField txtCantidad;
	ModeloNuevosPedidos miModeloNuevosPedidos;
	Controlador controlador;
	ComboNuevoProducto comboNuevoProducto;
	ComboClientes comboClientes;

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
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setPreferredSize(new Dimension(20, 20));
			getContentPane().add(scrollPane, BorderLayout.CENTER);
			{
				miModeloNuevosPedidos = new ModeloNuevosPedidos();
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
				JButton btnAnadir = new JButton("A\u00F1adir");
				btnAnadir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						
						int id = 2;
						String descripcion=comboNuevoProducto.getSelectedItem() + "";
						int cantidad = Integer.parseInt(txtCantidad.getText());
						float precioVenta = 120.00f;
						float importe = 120.00f;
						Date fecha = ParseFecha(textFecha.getText()); 
						String nombreCliente = comboClientes.getSelectedItem() + "";
						double descuento = 3.00;
						int codPedido = Integer.parseInt(PedidosDao.contarPedidos());
						int codLinea = 11;
						
						AuxNuevoPedido datosLinea=new AuxNuevoPedido(id,descripcion,cantidad,precioVenta,importe,fecha,nombreCliente,descuento,codPedido,codLinea);
					}
				});
				panel.add(btnAnadir);
				//controlador.crearPedidoNuevo();
			}
			
			 
	
		}
		
	}
	public static Date ParseFecha(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate =cParseFecha( formato.parse(fecha));
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
        
        }
	public static java.sql.Date cParseFecha(java.util.Date date) {
        return new java.sql.Date(date.getTime());
        }

}
