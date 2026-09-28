package ejemplos;

public class OperadoresLogicos2 {

	public static void main(String[] args) {
		// Declaramos e inicializamos las variables
		int a=4;
		int b=8;
		boolean res;
		
		res=(a<b);						// true
		System.out.println(res);
		
		res=(a==b);						// false
		System.out.println(res);

		res=(a<b)&&(a==b);				// false
		System.out.println(res);

		res=(a<b)||(a==b);				// true
		System.out.println(res);

		res=(a>=b)||(a!=b);				// true
		System.out.println(res);
		
		res=!(a<=b);					// true
		System.out.println(res);
		
		res=(b<a)||(a<=b)||(b>=a);		// true
		System.out.println(res);
		
		res=(b<a)&&(a<=b)&&(b>=a);		// false
		System.out.println(res);
		
		res=(b<a)&&((a<=b)||(b>=a));	// false
		System.out.println(res);

		
		

	}

}
