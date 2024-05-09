package transacciones;

public class Main {

	public static void main(String[] args) {
		
		CuentaBancaria miCuenta = new CuentaBancaria(1000); 
		
		// Deposito de $500
		
		miCuenta.realizarDeposito(500);
		
		//retiro de $200
		miCuenta.realizarRetiro(200);
		
		Transaccion miTransaccion = new Transaccion ("cuentaA", "CuentaB", 300); 
		miTransaccion.realizar();;
		

	}

}
