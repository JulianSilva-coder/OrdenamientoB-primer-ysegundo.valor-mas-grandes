package TaxiAPP;

import java.util.Scanner;

public class Act3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresar tama�o del arreglo");
		int tama�o[] = new int[entrada.nextInt()];
		for (int i = 0; i < tama�o.length; i++) {
			tama�o[i] = entrada.nextInt();
		}

		// Ordenamiento burbuja
		for (int i = 0; i < tama�o.length - 1; i++) {
			for (int j = 0; j < tama�o.length - 1; j++) {
				// Si el numero actual es mayor al siguiente (i + 1), pase esto:
				if (tama�o[j] > tama�o[j + 1]) {
					/*
					 * Aqui intercambiamos los valores con el siguiente.
					 */
					int aux = tama�o[j];
					tama�o[j] = tama�o[j + 1];
					tama�o[j + 1] = aux;
				}
			}
		}
		for (int i = 0; i < tama�o.length; i++) {
			System.out.println("Arreglo Ordenado: " + tama�o[i]);
		}
		// Aqui tomamos el primer y segundo numero mas grande
		int mayor = tama�o[0];
		int mayor2 = tama�o[0];
		for (int i = 0; i < tama�o.length; i++) {
			if (i == 0) {
				mayor = tama�o[i];
				mayor2 = tama�o[i];
			}else if(tama�o[i] > mayor) {
				mayor2 = mayor;
				mayor = tama�o[i];
			}else if(tama�o[i] > mayor2) {
				mayor2 = tama�o[i];
			}
		}
		System.out.println("Este es el numero mas grande: " + mayor);
		System.out.println("Este es el segundo numero mas grande: " + mayor2);
		int multiplicacion = (mayor * mayor2);
		System.out.println("Este es la multiplicacion: " + multiplicacion);
	}
}
