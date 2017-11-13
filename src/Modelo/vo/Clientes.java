package Modelo.vo;

import java.util.ArrayList;

public class Clientes {

	// Atributos
	private String nif;
	private String nombre;
	private String calle;
	private int codPostal;
	private String ciudad;
	private String contacto;
	private double descuento;
	ArrayList <String> telefono;

	// Contructores
	public Clientes(String nif, String nombre, String calle, int codPostal, String ciudad, String contacto,
			double descuento, ArrayList<String> telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.calle = calle;
		this.codPostal = codPostal;
		this.ciudad = ciudad;
		this.contacto = contacto;
		this.descuento = descuento;
		this.telefono = telefono;
	}

	public Clientes() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getters and Setters
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public ArrayList<String> getTelefono() {
		return telefono;
	}

	public void setTelefono(ArrayList<String> telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Clientes [nif=" + nif + "]";
	}

	
	
}
