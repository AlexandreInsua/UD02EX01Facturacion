package vista;

import javax.xml.crypto.Data;

public class AuxFacturasMes {
	
	// Atributos
			private short codigo;
			private Data fechaPedido;
			private String nombre;
			
			
			
			
			public AuxFacturasMes(short codigo, Data fechaPedido, String nombre) {
				super();
				this.codigo = codigo;
				this.fechaPedido = fechaPedido;
				this.nombre = nombre;
			}




			public AuxFacturasMes() {
				super();
				// TODO Auto-generated constructor stub
			}




			public short getCodigo() {
				return codigo;
			}




			public void setCodigo(short codigo) {
				this.codigo = codigo;
			}




			public Data getFechaPedido() {
				return fechaPedido;
			}




			public void setFechaPedido(Data fechaPedido) {
				this.fechaPedido = fechaPedido;
			}




			public String getNombre() {
				return nombre;
			}




			public void setNombre(String nombre) {
				this.nombre = nombre;
			}




			@Override
			public String toString() {
				return "AuxFacturasMes [codigo=" + codigo + ", fechaPedido=" + fechaPedido + ", nombre=" + nombre + "]";
			}
			
			
			
			
			
			
			
			
			
			

}
