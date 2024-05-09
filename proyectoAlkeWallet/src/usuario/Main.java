package usuario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear Usuario
		Usuario usuario = new Usuario("Cecia", "titular" ); 
		
		Usuario usuario1 = new Usuario("Andrea", "Adjunto" ); 
		
		
		// IMPRIMIR INFORMACION EN CONSOLA
		System.out.println("Nombre Usuario: " + usuario.getNombreUsuario() + 
				" Tipo de Usuario: " + usuario.getTipoUsuario());
		
		
		System.out.println("Nombre Usuario: " + usuario1.getNombreUsuario() +  
				" Tipo de Usuario: " + usuario1.getTipoUsuario());
		
		
		
	}


}
