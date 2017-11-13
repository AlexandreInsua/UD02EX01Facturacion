package Modelo.vo;

import javax.xml.crypto.Data;

public class Pedidos {

	// Atributos
	
	private int numPedido;
	private Data fechaPedido;
	private double descuento;
	private String nifCliente;

	// Constructores

	public Pedidos(int numPedido, Data fechaPedido, double descuento, String nifCliente) {
		super();
		this.numPedido = numPedido;
		this.fechaPedido = fechaPedido;
		this.descuento = descuento;
		this.nifCliente = nifCliente;
	}

	public Pedidos() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getters and Setters
	
	public int getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}

	public Data getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Data fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public String getNifCliente() {
		return nifCliente;
	}

	public void setNifCliente(String nifCliente) {
		this.nifCliente = nifCliente;
	}

}
