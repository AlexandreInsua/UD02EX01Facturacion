package vista.pedido;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controlador.Controlador;
import modelo.dao.PedidosDao;
import modelo.vo.LineasPedido;
import modelo.vo.Pedidos;
import modelo.vo.Productos;
import vista.AuxListadoPedidos;
import vista.ModeloNuevosPedidos;

import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaEliminarPedido extends JDialog {
	private JTextField txtFecha;
	private JTable table;
	private JTextField txtCliente;
	ModeloNuevosPedidos miModeloNuevosPedidos;
	Controlador controlador;
	ComboPedido comboPedido;
	JScrollPane scrollPane;

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
	// Prueba

	/**
	 * Launch the application.
	 */
	
	/*  public static void main(String[] args) { try { VentanaConsultarPedidos dialog
	 = new VentanaConsultarPedidos();
	 dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	 dialog.setVisible(true); } catch (Exception e) { e.printStackTrace(); } }
	 */
	 /**
		 * Create the dialog.
		 */
	public VentanaEliminarPedido() {
		setBounds(100, 100, 578, 300);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.NORTH);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JLabel lblConsultarPedido = new JLabel("Consultar pedido");
				panel.add(lblConsultarPedido, BorderLayout.NORTH);
			}
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1, BorderLayout.CENTER);
				{
					JLabel lblNewLabel = new JLabel("N\u00BA Pedido");
					panel_1.add(lblNewLabel);
				}
				{
					comboPedido = new ComboPedido();
					comboPedido.addItemListener(new ItemListener() {
						public void itemStateChanged(ItemEvent arg0) {
							Pedidos comboSeleccionado = (Pedidos) comboPedido.getSelectedItem();
							miModeloNuevosPedidos.cargarPedido(comboSeleccionado.getNumPedido());
							table = new JTable(miModeloNuevosPedidos);
							scrollPane.setViewportView(table);
							ArrayList<AuxListadoPedidos> listado = controlador
									.listarPedidos(comboSeleccionado.getNumPedido());
							String nombreCliente = listado.get(0).getNombreCliente();
							txtCliente.setText(nombreCliente);
							txtFecha.setText(listado.get(0).getFechaPedido() + "");

						}
					});

					panel_1.add(comboPedido);

				}
				{
					JLabel lblNewLabel_1 = new JLabel("Fecha");
					panel_1.add(lblNewLabel_1);
				}
				{
					txtFecha = new JTextField();
					txtFecha.setEditable(false);
					txtFecha.setText("");
					panel_1.add(txtFecha);
					txtFecha.setColumns(10);

				}
				{
					JLabel lblNewLabel_2 = new JLabel("Cliente");
					panel_1.add(lblNewLabel_2);
				}
				{
					txtCliente = new JTextField();
					txtCliente.setEditable(false);
					panel_1.add(txtCliente);
					txtCliente.setColumns(10);

				}
			}
		}
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				scrollPane = new JScrollPane();
				panel.add(scrollPane, BorderLayout.CENTER);
				{
					miModeloNuevosPedidos = new ModeloNuevosPedidos();
					Pedidos pedido = (Pedidos) comboPedido.getSelectedItem();
					miModeloNuevosPedidos.cargarPedido(pedido.getNumPedido());
					table = new JTable(miModeloNuevosPedidos);
					scrollPane.setViewportView(table);
					ArrayList<AuxListadoPedidos> listado = controlador.listarPedidos(pedido.getNumPedido());
					String nombreCliente = listado.get(0).getNombreCliente();
					txtCliente.setText(nombreCliente);
					txtFecha.setText(listado.get(0).getFechaPedido() + "");

				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnEliminar = new JButton("Eliminar");
				btnEliminar.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Pedidos comboSeleccionado = (Pedidos) comboPedido.getSelectedItem();
						if (table.getSelectedRow() == -1) {

							Controlador.eliminarPedido(comboSeleccionado.getNumPedido());

						} else {
					 int numLineaPedido = Integer.parseInt(table.getValueAt (table.getSelectedRow(), 0).toString());
					
						
					controlador.eliminarLineaPedido(comboSeleccionado.getNumPedido(), numLineaPedido);	 System.out.println(numLineaPedido);
						}
					}
				});

				buttonPane.add(btnEliminar);
			}
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
