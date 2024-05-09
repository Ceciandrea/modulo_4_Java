package conversionMoneda;

public class Main {

	public static void main(String[] args) {
		
		//CUENTA EN PESOS CHILENOS 
		CuentaPesos cuentaPesos = new CuentaPesos("Cecia Hernández", 5000.0);
		System.out.println("titular: " + cuentaPesos.getTitular());
		System.out.println("Saldo en pesos chilenos: $" + cuentaPesos.getSaldo());
		System.out.println("¿Tiene saldo suficiente?: " + cuentaPesos.verificarSaldo());
		
		
		// CUENTA EN DOLAR
		CuentaDolar cuentaDolar = new CuentaDolar("Luz Hernández", 400);
		System.out.println("titular: " + cuentaDolar.getTitular());
		System.out.println("Saldo en dolares: $" + cuentaDolar.getSaldo());
		System.out.println("¿Tiene saldo suficiente?: " + cuentaDolar.verificarSaldo()); 

	}

}
