package alkeyWalletConversionMoneda;

import org.junit.jupiter.api.Test;

import conversionMoneda.CuentaDolar;

import static org.junit.jupiter.api.Assertions.*;

class CuentaDolarTest {

    @Test
    void testCrearCuentaDolar() {
        CuentaDolar cuenta = new CuentaDolar("Maria Lopez", 1000.0);

        assertNotNull(cuenta, "La cuenta no debería ser null");
        assertEquals("Maria Lopez", cuenta.getTitular(), "El titular de la cuenta no coincide");
        assertEquals(1000.0, cuenta.getSaldo(), 0.001, "El saldo inicial no coincide");
    }

    @Test
    void testVerificarSaldoPositivo() {
        CuentaDolar cuenta = new CuentaDolar("Maria Lopez", 1000.0);
        assertTrue(cuenta.verificarSaldo(), "La verificación de saldo debería ser verdadera para saldos positivos");
    }

    @Test
    void testVerificarSaldoNegativo() {
        CuentaDolar cuenta = new CuentaDolar("Maria Lopez", -50.0);
        assertFalse(cuenta.verificarSaldo(), "La verificación de saldo debería ser falsa para saldos negativos");
    }

    @Test
    void testVerificarSaldoCero() {
        CuentaDolar cuenta = new CuentaDolar("Maria Lopez", 0.0);
        assertTrue(cuenta.verificarSaldo(), "La verificación de saldo debería ser verdadera para saldo cero");
    }
}