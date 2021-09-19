package TaxiAPP;

import java.util.Scanner;

public class Act3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresar tamaño del arreglo");
		int tamaño[] = new int[entrada.nextInt()];
		for (int i = 0; i < tamaño.length; i++) {
			tamaño[i] = entrada.nextInt();
		}

		// Ordenamiento burbuja
		for (int i = 0; i < tamaño.length - 1; i++) {
			for (int j = 0; j < tamaño.length - 1; j++) {
				// Si el numero actual es mayor al siguiente (i + 1), pase esto:
				if (tamaño[j] > tamaño[j + 1]) {
					/*
					 * Aqui intercambiamos los valores con el siguiente.
					 */
					int aux = tamaño[j];
					tamaño[j] = tamaño[j + 1];
					tamaño[j + 1] = aux;
				}
			}
		}
		for (int i = 0; i < tamaño.length; i++) {
			System.out.println("Arreglo Ordenado: " + tamaño[i]);
		}
		// Aqui tomamos el primer y segundo numero mas grande
		int mayor = tamaño[0];
		int mayor2 = tamaño[0];
		for (int i = 0; i < tamaño.length; i++) {
			if (i == 0) {
				mayor = tamaño[i];
				mayor2 = tamaño[i];
			}else if(tamaño[i] > mayor) {
				mayor2 = mayor;
				mayor = tamaño[i];
			}else if(tamaño[i] > mayor2) {
				mayor2 = tamaño[i];
			}
		}
		System.out.println("Este es el numero mas grande: " + mayor);
		System.out.println("Este es el segundo numero mas grande: " + mayor2);
		int multiplicacion = (mayor * mayor2);
		System.out.println("Este es la multiplicacion: " + multiplicacion);
	}
}
