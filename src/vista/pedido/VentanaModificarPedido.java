package vista.pedido;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;

public class VentanaModificarPedido extends JDialog {
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaModificarPedido dialog = new VentanaModificarPedido();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaModificarPedido() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.NORTH);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JLabel lblModificarPedido = new JLabel("Modificar pedido");
				panel.add(lblModificarPedido, BorderLayout.NORTH);
			}
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1, BorderLayout.CENTER);
				{
					JLabel lblNewLabel = new JLabel("N\u00BA Pedido");
					panel_1.add(lblNewLabel);
				}
				{
					JComboBox comboBox = new JComboBox();
					panel_1.add(comboBox);
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
					JLabel lblC = new JLabel("Cliente");
					panel_1.add(lblC);
				}
				{
					JComboBox comboBox = new JComboBox();
					panel_1.add(comboBox);
				}
			}
		}
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new TitledBorder(null, "Ventas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel.add(panel_1, BorderLayout.SOUTH);
				{
					JLabel lblProducto = new JLabel("Producto");
					panel_1.add(lblProducto);
				}
				{
					JComboBox comboBox = new JComboBox();
					panel_1.add(comboBox);
				}
				{
					JLabel lblCantidad = new JLabel("Cantidad");
					panel_1.add(lblCantidad);
				}
				{
					textField_1 = new JTextField();
					panel_1.add(textField_1);
					textField_1.setColumns(10);
				}
				{
					JButton btnAadir = new JButton("A\u00F1adir");
					btnAadir.setEnabled(false);
					panel_1.add(btnAadir);
				}
			}
			{
				JScrollPane scrollPane = new JScrollPane();
				panel.add(scrollPane, BorderLayout.NORTH);
				{
					table = new JTable();
					table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null },
							{ null, null, null, null, null }, { null, null, null, null, null },
							{ null, null, null, null, null }, { null, null, null, null, null }, },
							new String[] { "New column", "New column", "New column", "New column", "New column" }));
					scrollPane.setViewportView(table);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
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
