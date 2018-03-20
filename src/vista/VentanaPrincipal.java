package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame {
	Controlador controlador = new Controlador();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnFacturacion = new JButton("Facturacion");
		btnFacturacion.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFacturacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.mostrarVentanaPedidosFacturas();
			}
		});
		btnFacturacion.setBounds(203, 48, 101, 204);
		panel.add(btnFacturacion);
		
		JButton btnNewButton_1 = new JButton("Clientes");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(116, 48, 89, 204);
		panel.add(btnNewButton_1);
		
		JButton btnProductos = new JButton("Productos");
		btnProductos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnProductos.setBounds(19, 48, 95, 204);
		panel.add(btnProductos);
		
		JButton btnNewButton_3 = new JButton("Pedidos");
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.setBounds(304, 48, 89, 204);
		panel.add(btnNewButton_3);
		
		JLabel lblElClipProdigioso = new JLabel("El Clip Prodigioso");
		lblElClipProdigioso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblElClipProdigioso.setBounds(135, 14, 184, 23);
		panel.add(lblElClipProdigioso);
		btnProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.mostrarVentanaProductos();
			}
		});
	}
}
