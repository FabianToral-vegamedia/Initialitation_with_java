package ejemplos;

public class OperadoresAsignacion2 {

	public static void main(String[] args) {
		// Declaración e inicialización de las variables
		int a=10, b=5;
		
		a++;				// a=11
		a-=3;				// a=8
		a*=b;				// a=40
		a--;				// a=39
		b++;				// b=6
		System.out.println(a<b);	// 39<6 --> false
		
	}

}
