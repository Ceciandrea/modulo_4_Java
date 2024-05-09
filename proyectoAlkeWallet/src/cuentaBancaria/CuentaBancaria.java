package cuentaBancaria;

import usuario.Usuario;

public class CuentaBancaria {

	private Usuario usuario; 
	private int numCuenta;
	private double saldo;
	
	//CONSTRUCTOR
	public CuentaBancaria(Usuario usuario, int numCuenta, double saldo) {
		super();
		this.usuario = usuario;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}

	
	// GETTERS 
	public Usuario getUsuario() {
		return usuario;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public double getSaldo() {
		return saldo;
	} 
	
	
	
	 
	
	
}
