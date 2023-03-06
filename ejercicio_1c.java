package clase3;

import java.util.Scanner;

public class ejercicio_1c {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[5];
		
		System.out.println("ingrese 5 numeros enteros");
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = teclado.nextInt();						
		}
		
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		
		System.out.println("la suma de todos los numeros es: "+suma);
	}

}
