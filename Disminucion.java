package ejemplos;

public class Disminucion {

	public static void main(String[] args) {
		// Ejemplo de operador incremental
		int a=1;
		a--;
		System.out.println(a);		// 0
		--a;
		System.out.println(a);		// -1
		System.out.println(--a);	// -2
		System.out.println(a--);	// -2
		System.out.println(a);		// -3
	}
}
