import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// VER SE O NÚMERO É POSITIVO OU NEGATIVO ---
		
		int numero;
		
		System.out.printf("DIGITE O NUMERO: %n");
		
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("Negativo");
		}
		
		if (numero >= 0) {
			System.out.print("Não negativo");
		}
		
		sc.close();
	}

}
