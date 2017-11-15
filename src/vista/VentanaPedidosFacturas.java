package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;


public class VentanaPedidosFacturas extends JDialog {

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
				buttonPane.add(btnSalir);
			}
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
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Mantenimiento Pedidos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(20, 40, 393, 71);
			getContentPane().add(panel);
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Consultas Facturas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(20, 122, 393, 87);
			getContentPane().add(panel);
		}
		
		JLabel lblNewLabel = new JLabel("PEDIDOS-FACTURAS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(157, 11, 134, 14);
		getContentPane().add(lblNewLabel);
	}
}
