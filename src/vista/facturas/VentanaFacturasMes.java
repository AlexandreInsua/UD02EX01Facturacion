package vista.facturas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;
import vista.ModeloFacturasMes;
import vista.ModeloNuevosPedidos;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VentanaFacturasMes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tableFactura;
	ModeloFacturasMes miModeloFacturasMes;
	Controlador controlador;

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		try {
			VentanaFacturasMes dialog = new VentanaFacturasMes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	*//**
	 * Create the dialog.
	 */
	public VentanaFacturasMes() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblFacturasMes = new JLabel("Facturas Mes");
			lblFacturasMes.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblFacturasMes.setBounds(162, 11, 194, 14);
			contentPanel.add(lblFacturasMes);
		}
		
		JLabel lblNewLabel = new JLabel("Mes:");
		lblNewLabel.setBounds(38, 49, 46, 14);
		contentPanel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(75, 46, 174, 20);
		contentPanel.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 77, 414, 129);
		contentPanel.add(scrollPane);
		
		miModeloFacturasMes = new ModeloFacturasMes();
		tableFactura = new JTable(miModeloFacturasMes);
		scrollPane.setViewportView(tableFactura);
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
