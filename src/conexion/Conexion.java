package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexion {
	
	private String db ;
	private static Connection conexion = null;

	public Conexion() {
		super();
	}
	
	public Conexion (String db) {
		//super();
		this.db = db;
	}

	//---------------------------------------------------------------------------------

	@SuppressWarnings("finally")

	public Connection getConexion(){

		// Configurar parametros de conexion
	
		 String user = "SegundoDAM";
		 String password = "SegundoDAM"; // la contraseña para ejecutar MySQL
		 String url = "jdbc:mysql://localhost:3306/ud02bdfacturacion?serverTimezone=Europe/Madrid";

		try{
			// Codigo para cargar el Driver de la Base de Datos
			 Class.forName("com.mysql.jdbc.Driver").newInstance();
			conexion=DriverManager.getConnection(url, user, password);
		//	System.out.println("Conexion establecida");
			System.err.println("Conexión Establecida");

		}catch(InstantiationException ie){
			JOptionPane.showMessageDialog(null, "Error 1: "+ie.getMessage());
		}catch(IllegalAccessException ia){
			JOptionPane.showMessageDialog(null, "Error 2: "+ia.getMessage());
		}catch(ClassNotFoundException cn){
			JOptionPane.showMessageDialog(null, "Error 3: "+cn.getMessage());
		}catch(SQLException ex){
			JOptionPane.showMessageDialog(null, "Error 4: "+ex.getMessage());
			ex.printStackTrace();
		}finally{
			return conexion;
		}
	}

	// metodo para desconectar la base de datos
	public void desconectar(){
		conexion = null;
	}
	/*public static void main(String[] args) {
	Conexion conexion=new Conexion();
	conexion.getConexion();
	
}*/
	}

		
		
	
	
	
	
