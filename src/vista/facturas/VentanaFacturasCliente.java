package vista.facturas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;
import vista.ModeloFacturasMes;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VentanaFacturasCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tableFacturas;
	ModeloFacturasMes miModeloFacturasMes;
	Controlador controlador;

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaFacturasCliente dialog = new VentanaFacturasCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(77, 42, 146, 20);
		contentPanel.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 70, 414, 148);
		contentPanel.add(scrollPane);
		
		miModeloFacturasMes = new ModeloFacturasMes();
		tableFacturas = new JTable(miModeloFacturasMes);
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
