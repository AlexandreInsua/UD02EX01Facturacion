package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;

public class VentanaBeneficios extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tableBeneficios;
	ModeloTablaBeneficios miModeloTablaBeneficios;
	
	Controlador controlador;
	
	public void setControlador(Controlador controlador){
		this.controlador = controlador;
	}

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			VentanaBeneficios dialog = new VentanaBeneficios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public VentanaBeneficios() {
		setTitle("El clip prodigioso");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 48, 408, 135);
			contentPanel.add(scrollPane);
			
			miModeloTablaBeneficios = new ModeloTablaBeneficios();
			tableBeneficios = new JTable(miModeloTablaBeneficios);
			scrollPane.setViewportView(tableBeneficios);
		}
		
		JLabel lblNewLabel = new JLabel("Listado Resultados en las Ventas");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(74, 23, 239, 14);
		contentPanel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
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
	}
}
