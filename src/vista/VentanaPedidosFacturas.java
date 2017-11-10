package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;

public class VentanaPedidosFacturas {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPedidosFacturas window = new VentanaPedidosFacturas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPedidosFacturas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(183, 228, 89, 23);
		frame.getContentPane().add(btnSalir);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(276, 228, 57, 23);
		frame.getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(335, 228, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Mantenimiento Pedidos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(27, 62, 376, 55);
		frame.getContentPane().add(panel);
		
		JButton btnNuevo = new JButton("Nuevo");
		panel.add(btnNuevo);
		
		JButton btnModificar = new JButton("Modificar");
		panel.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		panel.add(btnEliminar);
		
		JButton btnConsultas = new JButton("Consultas");
		panel.add(btnConsultas);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Consultas Facturas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(27, 138, 376, 49);
		frame.getContentPane().add(panel_1);
		
		JButton btnCrearFactura = new JButton("Crear Factura");
		panel_1.add(btnCrearFactura);
		
		JButton btnFacturasMes = new JButton("Facturas Mes");
		panel_1.add(btnFacturasMes);
		
		JButton btnFacturasCliente = new JButton("Facturas Cliente");
		panel_1.add(btnFacturasCliente);
		
		JLabel lblNewLabel = new JLabel("PEDIDOS - FACTURAS");
		lblNewLabel.setBounds(163, 27, 170, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
