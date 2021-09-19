package TaxiAPP;

import java.util.Scanner;

public class examenComplejidad {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la cantidad de dias");
		int dias = entrada.nextInt();
		int pacientesDelta = 2;
		System.out.println("Desde el segundo dia hay " + pacientesDelta + " contagiados");
		for (int i = 2; i <= dias; i++) {
			if(pacientesDelta == 2) {
				int contagios = (int)Math.pow(pacientesDelta, i);
				System.out.println("El dia: " + i + " y los contagiados es de: " + contagios + " Personas");
			}
		}
	}
}
