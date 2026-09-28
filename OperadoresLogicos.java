package ejemplos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// Declaramos e inicializamos las variables
		int a=8, b=6;
		boolean res;
		
		res=(a<=b) && (a!=b);			// false
		System.out.println(res);
		res=(a<=b) || (a!=b);			// true
		System.out.println(res);
		res=(a>b) && (b>5);				// true
		System.out.println(res);
		

	}

}
