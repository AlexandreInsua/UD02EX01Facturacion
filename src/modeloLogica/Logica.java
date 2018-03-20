package modeloLogica;

import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import controlador.Controlador;

public class Logica {
	
	Controlador controlador;

	public void setControlador(Controlador controlador) {
		this.controlador=controlador;
		
	}

	public void verificarPorcentajeDeIncremento() {
		JOptionPane.showInternalMessageDialog(null, "Debe introducir un numero (use '.' para separar los decimales)");
		
	}

	public void verificarCantidadLineaPedido() {
		JOptionPane.showInternalMessageDialog(null, "Debe introducir un numero entero");
		
	}

	public String verificarFecha(String fecha) {
		String regexp = "\\d{1,2}/\\d{1,2}/\\d{4}";
		String fechaValidada = "";
		
		if(!Pattern.matches(regexp, fecha)){
			JOptionPane.showInternalMessageDialog(null, "Debe introducir una fecha válida (dd/mm/aaa)");
		}else{
			fechaValidada = fecha;
		}
		
		return fechaValidada;
	}

}
