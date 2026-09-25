package ejemplos;

public class OperadoresAsignacion {

	public static void main(String[] args) {
		// Declaración e inicialización de las variables
		int a=2, b=3;
		
		// Practicamos los operadores de asignación
		a=b;
		System.out.println(a+" "+b);
		a+=b;							// a=a+b;
		System.out.println(a+" "+b);
		a=a+1;							// a+=1;
										// a++;
		System.out.println(a+" "+b);
		b=b-1;							// b-=1;
										// b--;
		System.out.println(a+" "+b);

	}
}
