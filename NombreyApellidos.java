package ejemplos;

public class NombreyApellidos {

	public static void main(String[] args) {
		// Declaro las variables que voy a utilizar
		String nombre;
		String apellido1;
		String apellido2;
		
		// Inicializo las variables
		nombre="Fabián";
		apellido1="Toral";
		apellido2="Lozano";
		
		// Imprimo por pantalla (en consola) mi nombre y apellidos
		System.out.println("Nombre: "+nombre);
		System.out.println("Primer apellido: "+apellido1);
		System.out.println("Segundo apellido: "+apellido2);
		System.out.println("\nNombre completo: ");
		System.out.println(nombre+apellido1+apellido2);
		System.out.println(nombre+" "+apellido1+" "+apellido2);
	}

}
