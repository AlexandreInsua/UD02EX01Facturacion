package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;

public class VentanaProductos {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaProductos window = new VentanaProductos();
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
	public VentanaProductos() {
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
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Mantenimiento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 43, 414, 52);
		frame.getContentPane().add(panel);
		
		JButton btnNuevo = new JButton("Nuevo");
		panel.add(btnNuevo);
		
		JButton btnModificar = new JButton("Modificar");
		panel.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		panel.add(btnEliminar);
		
		JButton btnConsultar = new JButton("Consultar");
		panel.add(btnConsultar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Listados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 124, 414, 93);
		frame.getContentPane().add(panel_1);
		
		JButton btnListado = new JButton("Listado");
		panel_1.add(btnListado);
		
		JButton btnMinimos = new JButton("Minimos");
		panel_1.add(btnMinimos);
		
		JButton btnBeneficio = new JButton("Beneficio");
		panel_1.add(btnBeneficio);
		
		JButton btnIncrementar = new JButton("Incrementar Precio");
		panel_1.add(btnIncrementar);
		
		JButton btnValoracion = new JButton("Valoraci\u00F3n Existencias");
		panel_1.add(btnValoracion);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(311, 228, 45, 23);
		frame.getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(358, 228, 66, 23);
		frame.getContentPane().add(btnCancel);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(243, 228, 66, 23);
		frame.getContentPane().add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("PRODUCTOS");
		lblNewLabel.setBounds(179, 18, 80, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
