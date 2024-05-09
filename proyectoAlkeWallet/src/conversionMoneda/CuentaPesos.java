package conversionMoneda;

public class CuentaPesos extends CuentaDigital{

		public CuentaPesos(String titular, double saldo) {
			super(titular, saldo); 
		}
		
		@Override
		public boolean verificarSaldo() {
			return getSaldo() >= 0; 
		}
}
