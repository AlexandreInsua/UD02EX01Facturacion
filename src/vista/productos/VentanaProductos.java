package vista.productos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import controlador.Controlador;

import javax.swing.JLabel;
import java.awt.Font;

public class VentanaProductos extends JDialog {

	Controlador controlador;

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	/**
	 * Launch the application.
	 * 
	 * public static void main(String[] args) { try { VentanaProductos dialog =
	 * new VentanaProductos();
	 * dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	 * dialog.setVisible(true); } catch (Exception e) { e.printStackTrace(); } }
	 * 
	 * Create the dialog.
	 */
	public VentanaProductos() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 229, 434, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);

			JButton btnSalir = new JButton("Salir");
			btnSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			buttonPane.add(btnSalir);
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

		JPanel panel = new JPanel();
		panel.setBorder(
				new TitledBorder(null, "Mantenimiento Pedidos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(20, 36, 391, 80);
		getContentPane().add(panel);

		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setEnabled(false);
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnNuevo);

		JButton btnModificar = new JButton("Modificar");
		btnModificar.setEnabled(false);
		panel.add(btnModificar);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setEnabled(false);
		panel.add(btnEliminar);

		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setEnabled(false);
		panel.add(btnConsultar);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Listado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(20, 127, 391, 91);
		getContentPane().add(panel_1);

		JButton btnListado = new JButton("Listado");
		btnListado.setEnabled(false);
		panel_1.add(btnListado);

		JButton btnMinimos = new JButton("Minimos");
		btnMinimos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controlador controlador = new Controlador();
				controlador.mostrarVentanaMinimos();
			}
		});
		panel_1.add(btnMinimos);

		JButton btnBeneficio = new JButton("Beneficio");
		btnBeneficio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controlador controlador = new Controlador();
				controlador.mostrarVentanaBeneficios();
			}
		});
		panel_1.add(btnBeneficio);

		JButton btnIncrementarPrecio = new JButton("Incrementar Precio");
		btnIncrementarPrecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controlador controlador = new Controlador();
				controlador.mostrarVentanaIncrementarPrecio();
			}
		});
		panel_1.add(btnIncrementarPrecio);

		JButton btnValoracionExistencias = new JButton("Valoracion Existencias");
		btnValoracionExistencias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controlador controlador = new Controlador();
				controlador.mostrarVentanaValoracionExistencias();
			}
		});
		panel_1.add(btnValoracionExistencias);

		JLabel lblNewLabel = new JLabel("PRODUCTOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(137, 11, 114, 14);
		getContentPane().add(lblNewLabel);
	}

}
