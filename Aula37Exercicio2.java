import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// VERIFICAÇÃO DE PAR E IMPAR ---
		
		int numero;
				
		System.out.println("Digite o número");
		
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número é Par");
		}
		else {
			System.out.println("É Impar");
		}
				
	}

}
