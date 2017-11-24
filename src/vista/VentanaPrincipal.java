package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import controlador.Controlador;

public class VentanaPrincipal extends JFrame{

	private JFrame frame;
	
	Controlador controlador = new Controlador();
	
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		btnSalir.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(btnSalir);
		
		JLabel lblElChipProdigioso = new JLabel("El chip prodigioso");
		lblElChipProdigioso.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		frame.getContentPane().add(lblElChipProdigioso, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Opciones de mantenimiento", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnProductos = new JButton("Productos");
		btnProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.mostrarVentanaProductos();
			
			}
		});
		panel.add(btnProductos);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setEnabled(false);
		panel.add(btnClientes);
		
		JButton btnFacturacion = new JButton("Facturaci\u00F3n");
		btnFacturacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.mostrarVentanaPedidosFacturas();
			}
		});
		panel.add(btnFacturacion);
		
		JButton btnPedidos = new JButton("Pedidos");
		btnPedidos.setEnabled(false);
		panel.add(btnPedidos);
	}

}
