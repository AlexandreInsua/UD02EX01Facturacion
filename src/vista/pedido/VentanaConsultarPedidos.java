package vista.pedido;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

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
import vista.ModeloNuevosPedidos;

import javax.swing.border.TitledBorder;

public class VentanaConsultarPedidos extends JDialog {
	private JTextField textField;
	private JTable table;
	ModeloNuevosPedidos miModeloNuevosPedidos;
	Controlador controlador;
	ComboPedido comboPedido;
	private JTextField txtCliente;

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
	//Prueba

	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		try {
			VentanaConsultarPedidos dialog = new VentanaConsultarPedidos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	*//**
	 * Create the dialog.
	 */
	public VentanaConsultarPedidos() {
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
					 panel_1.add(comboPedido);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Fecha");
					panel_1.add(lblNewLabel_1);
				}
				{
					textField = new JTextField();
					textField.setEditable(false);
					textField.setText("");
					panel_1.add(textField);
					textField.setColumns(10);
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
