package alkeyWalletCuentaBancaria;

import usuario.Usuario;
import org.junit.jupiter.api.Test;

import cuentaBancaria.CuentaBancaria;

import static org.junit.jupiter.api.Assertions.*;

class CuentaBancariaTest {

    @Test
    void testCrearCuentaBancaria() {
        Usuario usuario = new Usuario("JaneDoe", "Cliente");
        CuentaBancaria cuenta = new CuentaBancaria(usuario, 123456, 1000.00);

        assertNotNull(cuenta, "La cuenta bancaria no debería ser null");
        assertNotNull(cuenta.getUsuario(), "El usuario de la cuenta no debería ser null");
        assertEquals(usuario, cuenta.getUsuario(), "El usuario asociado a la cuenta no coincide");
        assertEquals(123456, cuenta.getNumCuenta(), "El número de cuenta no coincide");
        assertEquals(1000.00, cuenta.getSaldo(), 0.001, "El saldo inicial no coincide");
}
}