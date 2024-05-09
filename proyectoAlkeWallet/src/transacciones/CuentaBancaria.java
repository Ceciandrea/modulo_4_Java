package transacciones;
//PROPOSITO DE LA CLASE ES GESTIONAR LAS TRANSACCIONES (ACOPLAMIENTO), 
public class CuentaBancaria {

	private double saldo; 
	
	// Constructor
	
	 public CuentaBancaria(double saldoInicial) {
	     this.saldo = saldoInicial;
	 }
	
	// Método para consultar el saldo actual
	 public double consultarSaldo() {
	     return saldo;
	 } // Método para realizar un depósito
	 public void realizarDeposito(double monto) {
	     saldo += monto;
	     registrarTransaccion("Depósito", monto);
	     
	 }
	 
	// Método para realizar un retiro
	 public void realizarRetiro(double monto) {
	     if (monto <= saldo) {
	         saldo -= monto;
	         registrarTransaccion("Retiro", monto);
	     } else {
	         System.out.println("Saldo insuficiente para realizar el retiro.");
	     }
	 }
	  // Método para registrar una transacción
	     private void registrarTransaccion(String tipo, double monto) {
	         System.out.println("Transacción registrada: " + tipo + " de $" + monto);
	     }
}

