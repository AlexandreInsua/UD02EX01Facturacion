package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import controlador.Controlador;


import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 748, 340);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 48, 649, 147);
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
	}
}
