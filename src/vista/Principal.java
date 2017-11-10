package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
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
	public Principal() {
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
			
			}
		});
		panel.add(btnProductos);
		
		JButton btnClientes = new JButton("Clientes");
		panel.add(btnClientes);
		
		JButton btnFacturacion = new JButton("Facturaci\u00F3n");
		panel.add(btnFacturacion);
		
		JButton btnPedidos = new JButton("Pedidos");
		panel.add(btnPedidos);
	}

}
