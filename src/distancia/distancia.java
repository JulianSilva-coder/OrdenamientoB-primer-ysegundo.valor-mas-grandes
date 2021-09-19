package distancia;

import java.text.DecimalFormat;
import java.util.Scanner;

public class distancia {
	
	public static void main (String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat decimales = new DecimalFormat("#.00");
		System.out.println("Ingrese valores del punto A(X1 y Y1 respectivamente)");
		int valor1 = entrada.nextInt();
		int valor2 = entrada.nextInt();
		
		System.out.println("Ingrese valores del punto B(X2 y Y2 respectivamente)");//3
		float valor3 = entrada.nextFloat();
		float valor4 = entrada.nextFloat();
		
		float resultado1 = (valor2 - valor4);
		float cuadrado1 = (float)Math.pow(resultado1, 2);
		
		float resultado2 = (valor1-valor3);
		float cuadrado2 = (float)Math.pow(resultado2, 2);
		
		float suma = (cuadrado1 + cuadrado2);
		float raiz = (float)Math.sqrt(suma);
		
		System.out.println("La distancia del punto A al punto B es de: "+ decimales.format(raiz));
		
		
	}
}
