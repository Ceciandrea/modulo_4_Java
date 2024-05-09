package alkeyWalletUsuario;


import org.junit.jupiter.api.Test;

import usuario.Usuario;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void testCrearUsuario() {
        Usuario user = new Usuario("Cecia Hernández", "Cliente");

        assertNotNull(user, "El usuario no debería ser null");
        assertEquals("Cecia Hernández", user.getNombreUsuario(), "El nombre de usuario no coincide");
        assertEquals("Cliente", user.getTipoUsuario(), "El tipo de usuario no coincide");
    }
}
