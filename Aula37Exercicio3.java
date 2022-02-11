import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		int valorA, valorB;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor A");
		valorA = sc.nextInt();
		System.out.println("Digite o valor B");
		valorB = sc.nextInt();		
		
		if (valorA % valorB == 0 || valorB % valorA == 0) {
			System.out.println("São multiplos");
		}

		else {
			System.out.println("Não são multiplos");
		}
				
		sc.close();

	}

}
