package vista.pedido;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controlador.Controlador;
import vista.ModeloNuevosPedidos;

import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;

public class VentanaEliminarPedido extends JDialog {
	private JTable table;
	private JTextField textField;
	ModeloNuevosPedidos miModeloNuevosPedidos;
	Controlador controlador;
	private JTextField txtDescuento;
	private JTextField txtCliente;
	ComboPedido comboPedido;
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		try {
			VentanaEliminarPedido dialog = new VentanaEliminarPedido();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	*//**
	 * Create the dialog.
	 */
	public VentanaEliminarPedido() {
		setBounds(100, 100, 603, 300);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.NORTH);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JLabel lblEliminarPedido = new JLabel("Eliminar pedido");
				lblEliminarPedido.setFont(new Font("Tahoma", Font.PLAIN, 16));
				panel.add(lblEliminarPedido, BorderLayout.CENTER);
			}
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1, BorderLayout.SOUTH);
				{
					JLabel lblNPedido = new JLabel("N\u00BA Pedido");
					panel_1.add(lblNPedido);
				}
				{
					
					comboPedido = new ComboPedido();
					 panel_1.add(comboPedido);
				}
				{
					JLabel lblFecha = new JLabel("Fecha");
					panel_1.add(lblFecha);
				}
				{
					textField = new JTextField();
					panel_1.add(textField);
					textField.setColumns(10);
				}
				{
					JLabel lblCliente = new JLabel("Cliente");
					panel_1.add(lblCliente);
				}
				{
					txtCliente = new JTextField();
					panel_1.add(txtCliente);
					txtCliente.setColumns(10);
				}
				{
					JLabel lblNewLabel = new JLabel("Descuento");
					panel_1.add(lblNewLabel);
				}
				{
					txtDescuento = new JTextField();
					panel_1.add(txtDescuento);
					txtDescuento.setColumns(10);
				}
			}
		}
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JScrollPane scrollPane = new JScrollPane();
				panel.add(scrollPane, BorderLayout.CENTER);
				{
					miModeloNuevosPedidos = new ModeloNuevosPedidos();
					table = new JTable(miModeloNuevosPedidos);
					scrollPane.setViewportView(table);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnEliminar = new JButton("Eliminar");
				buttonPane.add(btnEliminar);
			}
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
