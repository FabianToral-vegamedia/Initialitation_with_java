package ejemplos;

public class MayoriaEdad {

	public static void main(String[] args) {
		// Definimos una constante (su valor no va a cambiar durante la ejecución del programa)
		final int MAYORIAEDAD;
		
		// Asignamos el valor de la constante
		MAYORIAEDAD=18;
		
		// Definimos una variable (su valor puede cambiar durante la ejecución del programa)
		int edad;
		// Asignamos el valor de la variable
		edad=19;
		
		/*
		 * La definición y la inicialización de la variable
		 * la podriamos haber hecho en una única línea
		 * de la siguiente forma:
		 * 
		 * int edad=19;
		 */
		System.out.println("Mi edad es: "+edad);
		
		// Vamos a cambiar el valor de la variable
		edad=edad+1;
		System.out.println("Mi edad el año que viene será: "+edad);
		
		edad=edad-2;
		System.out.println("Mi edad el año pasado fue: "+edad);
		
		System.out.println("La mayoría de edad está en "+MAYORIAEDAD+" años");
		
		/*
		 * Esto no se podría hacer con una constante:
		 *		MAYORIAEDAD=MAYORIAEDAD+2;
		 */
		edad=MAYORIAEDAD+2;
		System.out.println("Mi edad ahora es de: "+edad);
		
		// Recordamos la diferencia entre CONCATENAR Y SUMAR
		// EJEMPLO DE CONCATENAR
		System.out.println("Si la mayoria de edad subiese 10 años, estaría en: "+MAYORIAEDAD+10);
		// EJEMPLO DE SUMAR
		System.out.println("Si la mayoria de edad subiese 10 años, estaría en: "+(MAYORIAEDAD+10));
		
	}

}
