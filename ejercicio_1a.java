package clase3;

public class ejercicio_1a {

	public static void main(String[] args) {
		String ubicacion = "Argentina\\BuenosAires\\La Matanza";
		
		int n = 0;
		
		for (int i = 0; i < ubicacion.length(); i++) {
			if (ubicacion.charAt(i) == 'n' ) {
				n++;
			}
		}
			
		System.out.println("cantidad de veces que aparece la letra n en el texto es : "+n);
		

	}

}