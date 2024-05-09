package alkeyWalletConversionMoneda;

import org.junit.jupiter.api.Test;

import conversionMoneda.CuentaPesos;

import static org.junit.jupiter.api.Assertions.*;

class CuentaPesosTest {

    @Test
    void testCrearCuentaPesos() {
        CuentaPesos cuenta = new CuentaPesos("Juan Perez", 5000.0);
        
        assertNotNull(cuenta, "La cuenta no debería ser null");
        assertEquals("Juan Perez", cuenta.getTitular(), "El titular de la cuenta no coincide");
        assertEquals(5000.0, cuenta.getSaldo(), 0.001, "El saldo inicial no coincide");
    }

    @Test
    void testVerificarSaldoPositivo() {
        CuentaPesos cuenta = new CuentaPesos("Juan Perez", 5000.0);
        assertTrue(cuenta.verificarSaldo(), "La verificación de saldo debería ser verdadera para saldos positivos");
    }

    @Test
    void testVerificarSaldoNegativo() {
        CuentaPesos cuenta = new CuentaPesos("Juan Perez", -100.0);
        assertFalse(cuenta.verificarSaldo(), "La verificación de saldo debería ser falsa para saldos negativos");
    }

    @Test
    void testVerificarSaldoCero() {
        CuentaPesos cuenta = new CuentaPesos("Juan Perez", 0.0);
        assertTrue(cuenta.verificarSaldo(), "La verificación de saldo debería ser verdadera para saldo cero");
    }
}
