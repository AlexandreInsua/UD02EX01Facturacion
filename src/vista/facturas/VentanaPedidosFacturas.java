package vista.facturas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;

import controlador.Controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPedidosFacturas extends JDialog {

	Controlador controlador;

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaPedidosFacturas dialog = new VentanaPedidosFacturas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaPedidosFacturas() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 229, 434, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton btnSalir = new JButton("Salir");
				btnSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				buttonPane.add(btnSalir);
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
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Mantenimiento Pedidos", TitledBorder.LEADING, TitledBorder.TOP,
					null, null));
			panel.setBounds(20, 40, 393, 71);
			getContentPane().add(panel);

			JButton btnNuevo = new JButton("Nuevo");
			btnNuevo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Controlador controlador = new Controlador();
					controlador.mostrarVentanaNuevoPedido();
				}
			});
			panel.add(btnNuevo);

			JButton btnModificar = new JButton("Modificar");
			btnModificar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Controlador controlador = new Controlador();
					controlador.mostrarVentanaModificarPedido();
				}
			});
			panel.add(btnModificar);

			JButton btnEliminar = new JButton("Eliminar");
			btnEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Controlador controlador = new Controlador();
					controlador.mostrarVentanaEliminarPedidos();
				}
			});
			panel.add(btnEliminar);

			JButton btnConsultar = new JButton("Consultar");
			btnConsultar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Controlador controlador = new Controlador();
					controlador.mostrarVentanaConsultarPedidos();
				}
			});
			panel.add(btnConsultar);
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(
					new TitledBorder(null, "Consultas Facturas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(20, 122, 393, 87);
			getContentPane().add(panel);

			JButton btnCrearFactura = new JButton("Crear Factura");
			btnCrearFactura.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Controlador controlador = new Controlador();
					controlador.mostrarVentanaCrearFactura();
				}
			});
			panel.add(btnCrearFactura);

			JButton btnFacturaMes = new JButton("Factura Mes");
			btnFacturaMes.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Controlador controlador = new Controlador();
					controlador.mostrarVentanaFacturaMes();
				}
			});
			panel.add(btnFacturaMes);

			JButton btnFacturasCliente = new JButton("FacturasCliente");
			btnFacturasCliente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Controlador controlador = new Controlador();
					controlador.mostrarVentanaFacturaCliente();
				}
			});
			panel.add(btnFacturasCliente);
		}

		JLabel lblNewLabel = new JLabel("PEDIDOS-FACTURAS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(157, 11, 134, 14);
		getContentPane().add(lblNewLabel);
	}

}
