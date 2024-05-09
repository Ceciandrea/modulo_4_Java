package cuentaBancaria;

import usuario.Usuario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crear un usuario
        Usuario usuario = new Usuario("Cecia Hernández", "Cliente Premium");

        // Crear una cuenta bancaria para el usuario
        CuentaBancaria cuenta = new CuentaBancaria(usuario, 123456, 2500.00);

        // Mostrar información del usuario y de la cuenta bancaria
        System.out.println("Detalles del usuario y su cuenta bancaria:");
        System.out.println("Nombre del Usuario: " + cuenta.getUsuario().getNombreUsuario());
        System.out.println("Tipo de Usuario: " + cuenta.getUsuario().getTipoUsuario());
        System.out.println("Número de Cuenta: " + cuenta.getNumCuenta());
        System.out.println("Saldo: $" + cuenta.getSaldo()); 

	}

}
