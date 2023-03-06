package clase3;

public class ejercicio_2 {

	public static void main(String[] args) {
		
		String letras = "abcdefghijklmnñopqrstuvwxyz ab";
		
		String frase = "hola que tal";
		
		String textoCodificado = "";
		
		char caracter;
		for (int i = 0; i < frase.length(); i++) {
			caracter = frase.charAt(i);
			int pos = letras.indexOf(caracter);
			textoCodificado += letras.charAt(pos +1);
		}
		
		System.out.print(textoCodificado);
		System.out.println("");
		
		//decodificacion
		String frase1 = textoCodificado;
		String textoDecodificado = "";
		
		char caracter1;
		for (int i = 0; i < frase1.length(); i++) {
			caracter1 = frase1.charAt(i);
			int pos1 = letras.indexOf(caracter1);
			
			if ((pos1-1)==(-1)) {
				textoDecodificado += letras.charAt(27);
			} else {			
			textoDecodificado += letras.charAt(pos1 -1);
		    }
		}
		System.out.print(textoDecodificado);

	}

}
