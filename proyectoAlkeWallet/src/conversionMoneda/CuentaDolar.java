package conversionMoneda;

public class CuentaDolar extends CuentaDigital {

	public CuentaDolar(String titular, double saldo) {
	     super(titular, saldo);
	}
	@Override
	public boolean verificarSaldo() {
	     return getSaldo() >= 0;
	}
	
}
