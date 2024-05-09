package alkeyWalletTransacciones;



import org.junit.jupiter.api.Test;

import transacciones.CuentaBancaria;

import static org.junit.jupiter.api.Assertions.*;

class CuentaBancariaTest {

    @Test
    void testConsultarSaldo() {
        CuentaBancaria cuenta = new CuentaBancaria(1000.0);
        assertEquals(1000.0, cuenta.consultarSaldo(), 0.001, "El saldo inicial debe ser 1000.0");
    }

    @Test
    void testRealizarDeposito() {
        CuentaBancaria cuenta = new CuentaBancaria(1000.0);
        cuenta.realizarDeposito(500.0);
        assertEquals(1500.0, cuenta.consultarSaldo(), 0.001, "El saldo después del depósito debe ser 1500.0");
    }

    @Test
    void testRealizarRetiroExitoso() {
        CuentaBancaria cuenta = new CuentaBancaria(1000.0);
        cuenta.realizarRetiro(200.0);
        assertEquals(800.0, cuenta.consultarSaldo(), 0.001, "El saldo después del retiro debe ser 800.0");
    }

    @Test
    void testRealizarRetiroFracasoPorSaldoInsuficiente() {
        CuentaBancaria cuenta = new CuentaBancaria(500.0);
        cuenta.realizarRetiro(1000.0);
        assertEquals(500.0, cuenta.consultarSaldo(), "El saldo debería permanecer igual debido a saldo insuficiente");
    }
}
