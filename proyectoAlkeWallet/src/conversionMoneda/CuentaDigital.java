package conversionMoneda;
//CLASE ABSTRACTA
public abstract class CuentaDigital {
	//ATRIBUTOS
	private String titular;
	private double saldo;
	
	
	//CONSTRUCTOR
	public CuentaDigital(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo; 
		
	}
		//GETTERS PARA LOS ATRIBUTOS TITULAR Y SALDO
	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	//METODO PARA VERIFICAR SALDO
	public abstract boolean verificarSaldo(); 

}
