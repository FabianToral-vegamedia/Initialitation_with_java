package ejemplos;

public class Operaciones {

	public static void main(String[] args) {
		// Declaración de variables
		int a, b, suma, resta;
		int multi, divi, resto;
		
		// Inicialización de las variables
		a=1;
		b=10;
		
		// Operaciones
		suma=a+b;
		resta=a-b;
		multi=a*b;
		divi=a/b;
		resto=a%b;

		// Mostrar resultados por pantalla (consola)
		System.out.println(a+" + "+b+" = "+suma);
		System.out.println(a+" - "+b+" = "+resta);
		System.out.println(a+" * "+b+" = "+multi);
		System.out.println(a+" / "+b+" = "+divi);
		System.out.println(a+" % "+b+" = "+resto);
	}

}
