package vista.facturas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;
import modelo.vo.Clientes;
import vista.ModeloFacturasCliente;
import vista.ModeloFacturasMes;
import vista.ModeloNuevosPedidos;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaFacturasMes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tableFactura;
	ModeloFacturasMes miModeloFacturasMes;
	Controlador controlador;
	JScrollPane scrollPane;

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { try { VentanaFacturasMes dialog
	 * = new VentanaFacturasMes();
	 * dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	 * dialog.setVisible(true); } catch (Exception e) { e.printStackTrace(); } }
	 * 
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

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 77, 414, 129);
		contentPanel.add(scrollPane);

		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Enero");
		comboBox.addItem("Febrero");
		comboBox.addItem("Marzo");
		comboBox.addItem("Abril");
		comboBox.addItem("Mayo");
		comboBox.addItem("Junio");
		comboBox.addItem("Julio");
		comboBox.addItem("Agosto");
		comboBox.addItem("Septiembre");
		comboBox.addItem("Octubre");
		comboBox.addItem("Noviembre");
		comboBox.addItem("Diciembre");

		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				miModeloFacturasMes = new ModeloFacturasMes();
				int comboSeleccionado = (int) comboBox.getSelectedIndex() + 1;
				miModeloFacturasMes.cargarFacturasMes(comboSeleccionado);
				tableFactura = new JTable(miModeloFacturasMes);
				scrollPane.setViewportView(tableFactura);

			}
		});
		comboBox.setBounds(75, 46, 174, 20);
		contentPanel.add(comboBox);

		miModeloFacturasMes = new ModeloFacturasMes();
		int comboSeleccionado = (int) comboBox.getSelectedIndex() + 1;
		miModeloFacturasMes.cargarFacturasMes(comboSeleccionado);
		tableFactura = new JTable(miModeloFacturasMes);
		scrollPane.setViewportView(tableFactura);

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
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
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
