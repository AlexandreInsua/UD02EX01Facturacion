package vista.productos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;
import modelo.vo.Proveedor;
import vista.ComboIncrementar;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaIncrementarPrecio extends JDialog {
	Controlador controlador;
	ComboIncrementar comboIncrementar;

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public void setComoIncrementar(ComboIncrementar comboIncrementar) {
		this.comboIncrementar = comboIncrementar;
	}

	private final JPanel contentPanel = new JPanel();
	private JTextField porcentaje;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { try { VentanaIncrementarPrecio
	 * dialog = new VentanaIncrementarPrecio();
	 * dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	 * dialog.setVisible(true); } catch (Exception e) { e.printStackTrace(); } }
	 */

	/**
	 * Create the dialog.
	 */
	public VentanaIncrementarPrecio() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblProveedor = new JLabel("Proveedor");
			lblProveedor.setBounds(58, 38, 50, 14);
			contentPanel.add(lblProveedor);
		}
		{
			comboIncrementar = new ComboIncrementar();
			// JComboBox comboBox = new JComboBox();
			comboIncrementar.setBounds(113, 35, 316, 20);
			contentPanel.add(comboIncrementar);
		}
		{
			JLabel lblIncrementar = new JLabel("% Incrementar");
			lblIncrementar.setBounds(35, 93, 73, 14);
			contentPanel.add(lblIncrementar);
		}
		{
			porcentaje = new JTextField();
			porcentaje.setBounds(113, 90, 316, 20);
			contentPanel.add(porcentaje);
			porcentaje.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
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
				JButton btnOk = new JButton("OK");
				btnOk.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if (porcentaje.getText() != null && !porcentaje.getText().isEmpty()) {
							float porcen = Float.parseFloat(porcentaje.getText());
							Proveedor proveedor = (Proveedor) comboIncrementar.getSelectedItem();
							System.out.println(proveedor.getNombre());
							System.out.println(porcen);
							controlador = new Controlador();
							controlador.incrementarPrecio(proveedor, porcen);
						}

					}
				});
				btnOk.setActionCommand("OK");
				buttonPane.add(btnOk);
				getRootPane().setDefaultButton(btnOk);
			}
			{
				JButton btnCancel = new JButton("Cancel");
				btnCancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancel.setActionCommand("Cancel");
				buttonPane.add(btnCancel);
			}
		}
	}

}
