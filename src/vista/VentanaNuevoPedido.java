package vista;

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
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;

public class VentanaNuevoPedido extends JDialog {
	private JTable table;
	private JTextField textNumproducto;
	private JTextField textCliente;
	private JTextField textFecha;
	private JTextField textCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaNuevoPedido dialog = new VentanaNuevoPedido();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

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
					JLabel lblNProducto = new JLabel("N\u00BA producto");
					panel_1.add(lblNProducto);
				}
				{
					textNumproducto = new JTextField();
					panel_1.add(textNumproducto);
					textNumproducto.setEditable(false);
					textNumproducto.setColumns(10);
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
					textCliente = new JTextField();
					panel_1.add(textCliente);
					textCliente.setColumns(10);
				}
			}
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setPreferredSize(new Dimension(20, 20));
			getContentPane().add(scrollPane, BorderLayout.CENTER);
			{
				table = new JTable();
				table.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null, null},
						{null, null, null, null, null},
						{null, null, null, null, null},
					},
					new String[] {
						"New column", "New column", "New column", "New column", "New column"
					}
				));
				scrollPane.setViewportView(table);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Ventas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			getContentPane().add(panel, BorderLayout.SOUTH);
			{
				JLabel lblVentas = new JLabel("Ventas");
				panel.add(lblVentas);
			}
			{
				JComboBox comboBox = new JComboBox();
				panel.add(comboBox);
			}
			{
				JLabel lblCantidad = new JLabel("Cantidad");
				panel.add(lblCantidad);
			}
			{
				textCantidad = new JTextField();
				panel.add(textCantidad);
				textCantidad.setColumns(10);
			}
			{
				JButton btnAnadir = new JButton("A\u00F1adir");
				btnAnadir.setEnabled(false);
				panel.add(btnAnadir);
			}
		}
	}

}
