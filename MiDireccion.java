package ejemplos;

public class MiDireccion {

	public static void main(String[] args) {
		// Declaramos variables
		String calle;
		int num;
		int piso;
		char letra;
		String localidad;
		
		// Inicializamos las variables
		calle="Murillo";
		num=1;
		piso=0;
		letra=' ';
		localidad="Fortuna";
		// Imprimó mi dirección
		System.out.println(calle+" "+num+" "+piso+" "+letra+" "+localidad);
		System.out.println("C/"+calle+" nº"+num+" "+piso+"º"+letra+" ("+localidad+")");
		

	}

}
