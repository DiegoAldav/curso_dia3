package clase3;

import java.util.Scanner;

public class ejercicio_1b {

	public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
		
		System.out.println("ingrese 3 numeros enteros");
		
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		
    int[] numeros = new int[3];
		
		numeros[0] = a;
		numeros[1] = b;
		numeros[2] = c;
		
    int mayor= numeros[0];
		
		for (int i = 0; i < numeros.length-1; i++) {
			if (numeros[i] < numeros[i+1]) {
				mayor = numeros[i+1];
			}
		}
		
		int medio = 0;
		int minimo = 0;
		for (int i = 0; i < numeros.length; i++) {
		if (mayor == numeros[0]) {
			if (numeros[1] > numeros[2] ) {
				medio = numeros[1];
				minimo = numeros[2];
			}else {
				medio = numeros[2];
				minimo = numeros[1];
			}
		} else if (mayor == numeros[1]) {
			if (numeros[0] > numeros[2]) {
				medio = numeros[0];
				minimo = numeros[2];
			}else {
				medio = numeros[2];
				minimo = numeros[0];
			}
		} else if (mayor == numeros[2]) {
			if (numeros[0] > numeros[1]) {
				medio = numeros[0];
				minimo = numeros[1];
			}else {
				medio = numeros[1];
				minimo = numeros[0];
			}
		}
		}
				
		int[] numerosOrdenados = new int[3];
		
		numerosOrdenados[0] = mayor;
		numerosOrdenados[1] = medio;
		numerosOrdenados[2] = minimo;
		
		System.out.println("seleccione el orden de los numeros\n0 para ascendente\ny 1 para decendente");
		
		int z = teclado.nextInt();
		
		if (z == 1) {
		for (int i = 0; i < numerosOrdenados.length; i++)
		System.out.print(numerosOrdenados[i]+ " ");
		} else if (z == 0) {
			for (int i = numerosOrdenados.length-1; i >= 0; i--) {
				System.out.print(numerosOrdenados[i]+" ");
			}
			}else {
			System.out.println("el numero ingresado es distinto de cero y uno reinice el programa");
		}
		
	}

}
