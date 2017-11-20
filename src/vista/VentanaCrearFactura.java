package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Insets;

public class VentanaCrearFactura extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTextField textNombre;
	private JTextField textCodPostal;
	private JTextField textCiudad;
	private JTextField textSubTotal;
	private JTextField textDescuento;
	private JTextField textBaseImponible;
	private JTextField textIva;
	private JTextField textTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaCrearFactura dialog = new VentanaCrearFactura();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaCrearFactura() {
		setTitle("El Chip Prodigioso");
		setBounds(100, 100, 620, 424);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.NORTH);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1, BorderLayout.NORTH);
				{
					JLabel lblCrearFactura = new JLabel("Crear Factura");
					panel_1.add(lblCrearFactura);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1, BorderLayout.SOUTH);
				panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				{
					JLabel lblNProducto = new JLabel("N\u00BA Producto");
					panel_1.add(lblNProducto);
				}
				{
					JComboBox comboBox = new JComboBox();
					panel_1.add(comboBox);
				}
				{
					textField = new JTextField();
					panel_1.add(textField);
					textField.setColumns(10);
				}
				{
					JLabel lblDto = new JLabel("% dto.");
					panel_1.add(lblDto);
				}
				{
					textField_1 = new JTextField();
					textField_1.setEditable(false);
					panel_1.add(textField_1);
					textField_1.setColumns(10);
				}
			}
		}
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1, BorderLayout.NORTH);
				{
					JLabel lblCliente = new JLabel("Cliente");
					panel_1.add(lblCliente);
				}
				{
					textNombre = new JTextField();
					panel_1.add(textNombre);
					textNombre.setColumns(10);
				}
				{
					textCodPostal = new JTextField();
					panel_1.add(textCodPostal);
					textCodPostal.setColumns(10);
				}
				{
					textCiudad = new JTextField();
					panel_1.add(textCiudad);
					textCiudad.setColumns(10);
				}
			}
			{
				JScrollPane scrollPane = new JScrollPane();
				panel.add(scrollPane, BorderLayout.CENTER);
				{
					table = new JTable();
					table.setModel(new DefaultTableModel(
						new Object[][] {
							{null, null, null, null, null},
							{null, null, null, null, null},
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
				JPanel panel_1 = new JPanel();
				panel.add(panel_1, BorderLayout.SOUTH);
				GridBagLayout gbl_panel_1 = new GridBagLayout();
				gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
				gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
				gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				panel_1.setLayout(gbl_panel_1);
				{
					JLabel lblNewLabel = new JLabel("Subtotal");
					GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
					gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
					gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel.gridx = 17;
					gbc_lblNewLabel.gridy = 0;
					panel_1.add(lblNewLabel, gbc_lblNewLabel);
				}
				{
					textSubTotal = new JTextField();
					GridBagConstraints gbc_textSubTotal = new GridBagConstraints();
					gbc_textSubTotal.insets = new Insets(0, 0, 5, 0);
					gbc_textSubTotal.fill = GridBagConstraints.HORIZONTAL;
					gbc_textSubTotal.gridx = 18;
					gbc_textSubTotal.gridy = 0;
					panel_1.add(textSubTotal, gbc_textSubTotal);
					textSubTotal.setColumns(10);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Descuento");
					GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
					gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
					gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_1.gridx = 17;
					gbc_lblNewLabel_1.gridy = 1;
					panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
				}
				{
					textDescuento = new JTextField();
					GridBagConstraints gbc_textDescuento = new GridBagConstraints();
					gbc_textDescuento.insets = new Insets(0, 0, 5, 0);
					gbc_textDescuento.fill = GridBagConstraints.HORIZONTAL;
					gbc_textDescuento.gridx = 18;
					gbc_textDescuento.gridy = 1;
					panel_1.add(textDescuento, gbc_textDescuento);
					textDescuento.setColumns(10);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("Base imponible");
					GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
					gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
					gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_2.gridx = 17;
					gbc_lblNewLabel_2.gridy = 2;
					panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
				}
				{
					textBaseImponible = new JTextField();
					GridBagConstraints gbc_textBaseImponible = new GridBagConstraints();
					gbc_textBaseImponible.insets = new Insets(0, 0, 5, 0);
					gbc_textBaseImponible.fill = GridBagConstraints.HORIZONTAL;
					gbc_textBaseImponible.gridx = 18;
					gbc_textBaseImponible.gridy = 2;
					panel_1.add(textBaseImponible, gbc_textBaseImponible);
					textBaseImponible.setColumns(10);
				}
				{
					JLabel lblNewLabel_3 = new JLabel("IVA");
					GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
					gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
					gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_3.gridx = 17;
					gbc_lblNewLabel_3.gridy = 3;
					panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);
				}
				{
					textIva = new JTextField();
					GridBagConstraints gbc_textIva = new GridBagConstraints();
					gbc_textIva.insets = new Insets(0, 0, 5, 0);
					gbc_textIva.fill = GridBagConstraints.HORIZONTAL;
					gbc_textIva.gridx = 18;
					gbc_textIva.gridy = 3;
					panel_1.add(textIva, gbc_textIva);
					textIva.setColumns(10);
				}
				{
					JLabel lblNewLabel_4 = new JLabel("Total");
					GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
					gbc_lblNewLabel_4.insets = new Insets(0, 0, 0, 5);
					gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
					gbc_lblNewLabel_4.gridx = 17;
					gbc_lblNewLabel_4.gridy = 4;
					panel_1.add(lblNewLabel_4, gbc_lblNewLabel_4);
				}
				{
					textTotal = new JTextField();
					GridBagConstraints gbc_textTotal = new GridBagConstraints();
					gbc_textTotal.fill = GridBagConstraints.HORIZONTAL;
					gbc_textTotal.gridx = 18;
					gbc_textTotal.gridy = 4;
					panel_1.add(textTotal, gbc_textTotal);
					textTotal.setColumns(10);
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
