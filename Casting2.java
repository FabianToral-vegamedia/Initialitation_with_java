package ejemplos;

public class Casting2 {

	public static void main(String[] args) {
		// Declaración e inicialización de variables
		int a=3, b=8;
		System.out.println("a=" + a + ", b="+b);
		System.out.println("b/a: ");
		System.out.println(b/a);
		System.out.println((float)b/a);
		System.out.println(b/(float)a);
		System.out.println((float)b/(float)a);		
	}
}
