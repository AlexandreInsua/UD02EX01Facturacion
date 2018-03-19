package vista.facturas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;
import modelo.vo.Clientes;
import modelo.vo.Pedidos;
import vista.ModeloFacturasCliente;
import vista.ModeloFacturasMes;
import vista.pedido.ComboClientes;
import vista.pedido.ComboPedido;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class VentanaFacturasCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tableFacturas;
	ModeloFacturasCliente miModeloFacturasClientes;
	Controlador controlador;
	ComboClientes comboClientes;
	JScrollPane scrollPane;

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}


	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			VentanaFacturasCliente dialog = new VentanaFacturasCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	*//**
	 * Create the dialog.
	 */
	public VentanaFacturasCliente() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblFacturasCliente = new JLabel("Facturas Cliente");
			lblFacturasCliente.setBounds(160, 11, 111, 20);
			lblFacturasCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
			contentPanel.add(lblFacturasCliente);
		}
		{
			JLabel lblNewLabel = new JLabel("Cliente:");
			lblNewLabel.setBounds(21, 45, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 70, 414, 148);
		contentPanel.add(scrollPane);
		
		 comboClientes = new ComboClientes();
		 comboClientes.addItemListener(new ItemListener() {
		 	public void itemStateChanged(ItemEvent e) {
		 		miModeloFacturasClientes = new ModeloFacturasCliente();
				Clientes comboSeleccionado = (Clientes) comboClientes.getSelectedItem();
				miModeloFacturasClientes.cargarFacturasClientes(comboSeleccionado.getNombre());
				tableFacturas = new JTable(miModeloFacturasClientes);
				scrollPane.setViewportView(tableFacturas);
		 		
		 	}
		 });
		 comboClientes.setBounds(77, 42, 146, 20);
		 contentPanel.add(comboClientes);
		
	
		
		
		miModeloFacturasClientes = new ModeloFacturasCliente();
		Clientes comboSeleccionado = (Clientes) comboClientes.getSelectedItem();
		miModeloFacturasClientes.cargarFacturasClientes(comboSeleccionado.getNombre());
		tableFacturas = new JTable(miModeloFacturasClientes);
		scrollPane.setViewportView(tableFacturas);
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
