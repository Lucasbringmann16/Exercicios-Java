import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double A, B, C, pi, triangulo, circulo, trapezio, quadrado, retangulo;
		pi = 3.14159;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Insira o valor A: %n");
		A = sc.nextDouble();
		System.out.printf("Insira o valor B: %n");
		B = sc.nextDouble();
		System.out.printf("Insira o valor C: %n");
		C = sc.nextDouble();
		
		sc.close();
				
		triangulo = (A * C) /2;
		circulo = pi * Math.pow(C, 2);
		trapezio = ((A + B) * C) /2;
		quadrado = Math.pow(B, 2);
		retangulo = A * B;
		
	    System.out.printf("A area do triangulo é: %.3f %n", triangulo);
		System.out.printf("A area do circulo é: %.3f %n", circulo);
		System.out.printf("A area do trapezio é: %.3f %n", trapezio);
		System.out.printf("A area do quadrado é: %.3f %n", quadrado);
		System.out.printf("A area do retangulo é: %.3f %n", retangulo);
		
	}

}
